package com.endava.bankchallenge.model;

import com.endava.bankchallenge.strategy.Operation;

public abstract class Transaction{

    protected String transactionType;
    protected int idTransaction;
    protected String transactionDate;
    protected Double transactionValue;
    protected Operation operation;

    public Transaction(String transactionType, int idTransaction, String transactionDate, Double transactionValue) {
        this.transactionType = transactionType;
        this.idTransaction = idTransaction;
        this.transactionDate = transactionDate;
        this.transactionValue = transactionValue;
    }
    public Transaction(){

    }

    public int performOperation(){
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