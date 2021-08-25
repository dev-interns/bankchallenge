package com.endava.bankchallenge.model;

import com.endava.bankchallenge.factory.AgentFactory;
import com.endava.bankchallenge.factory.TransactionFactory;
import com.endava.bankchallenge.model.agent.Agent;

public class Dispatcher {
    private double time;
    private final AgentFactory agentFactory;
    private final TransactionFactory transactionFactory;
    public Dispatcher(){
        this.agentFactory = new AgentFactory();
        this.transactionFactory = new TransactionFactory();
    }
    public void attend(Customer customer, String transactionType) throws Exception {
        Transaction transaction = transactionFactory.createTransaction(transactionType);
        //logic get the type of agent

        String type = "Cashier";
        Agent agent = agentFactory.createAgent(type);
        int time =agent.processTransaction(transaction,21);
        System.out.println("I'm a " + agent.getType());
        System.out.println("I attend " + transaction.getTransactionType());
        System.out.println("in: " + time + " s");
    }

    public double getTime() {
        return time;
    }

    public AgentFactory getAgentFactory() {
        return agentFactory;
    }

    public TransactionFactory getTransactionFactory() {
        return transactionFactory;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
