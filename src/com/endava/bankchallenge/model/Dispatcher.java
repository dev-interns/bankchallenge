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
        //logic get the type of agent
        Agent agent = agentPool.getAgent(time);
        int transactionTime = agent.processTransaction(transaction, time);
        System.out.println("I'm a " + agent.getType());
        System.out.println("I attend " + transaction.getTransactionType());
        System.out.println("in: " + transactionTime + " s");
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
