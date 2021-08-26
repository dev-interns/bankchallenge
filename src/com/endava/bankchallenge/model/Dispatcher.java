package com.endava.bankchallenge.model;

import com.endava.bankchallenge.factory.TransactionFactory;
import com.endava.bankchallenge.model.agent.Agent;
import com.endava.bankchallenge.objectpool.AgentPool;

public class Dispatcher {
    private double time;
    private final AgentPool agentPool;
    private final TransactionFactory transactionFactory;
    public Dispatcher(){
        this.transactionFactory = new TransactionFactory();
        this.agentPool = new AgentPool();
    }
    public void attend(Customer customer, String transactionType, int time) throws Exception {
        Transaction transaction = transactionFactory.createTransaction(transactionType,customer);
        Agent agent = agentPool.getAgent(time);
        int transactionTime = agent.processTransaction(transaction, time);
        System.out.printf("I.m a %s \nI attend a %s \nIn: %s s\n",agent.getType(),transaction.getTransactionType(),transactionTime);
    }

    public double getTime() {
        return time;
    }

    public TransactionFactory getTransactionFactory() {
        return transactionFactory;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
