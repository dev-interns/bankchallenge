package com.endava.bankchallenge.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import com.endava.bankchallenge.model.agent.Agent;
import com.endava.bankchallenge.strategy.Operation;

public abstract class Transaction{

    protected String transactionType;
    protected int idTransaction;
    protected String transactionDate;
    protected Double transactionValue;
    protected Operation operation;
    protected Customer customer;

    public Transaction(String transactionType,Customer customer) {
        this.transactionType = transactionType;
        this.idTransaction = new Random().nextInt(1098987);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        this.transactionDate = dtf.format(now);
        this.transactionValue = (50000.0 ) * new Random().nextDouble();
        this.customer = customer;
    }

    public int performOperation(Agent agent){
        this.customer.setAttended(true);
        MessageTransaction mt = new MessageTransaction(customer.getCustomerId(), customer.getCustomerEmail(), customer.getAccountId(), agent.getAgentId(), "Notification", this.transactionDate, this.transactionValue, this.transactionType);
        SubjectTransaction.getInstance().notifyListeners(mt);
        return operation.run();
    }

    public String getTransactionType() {
        return transactionType;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public Double getTransactionValue() {
        return transactionValue;
    }
}