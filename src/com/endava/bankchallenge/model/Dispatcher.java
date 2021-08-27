package com.endava.bankchallenge.model;

import com.endava.bankchallenge.factory.TransactionFactory;
import com.endava.bankchallenge.model.agent.Agent;
import com.endava.bankchallenge.objectpool.AgentPool;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.logging.*;

public class Dispatcher {
    private final AgentPool agentPool;
    private final TransactionFactory transactionFactory;
    private final List<Integer> times;
    private static Logger logger;
    public Dispatcher(){
        this.transactionFactory = new TransactionFactory();
        this.agentPool = new AgentPool();
        this.times = new ArrayList<>();
    }
    public void attend(Customer customer, String transactionType, int time){
        try {
            Transaction transaction = transactionFactory.createTransaction(transactionType, customer);
            Agent agent = agentPool.getAgent(time);
            int transactionTime = agent.processTransaction(transaction, time);
            times.add(transactionTime);
            System.out.printf("I'm a %s \nI attend a %s \nIn: %s s\n",agent.getType(),transaction.getTransactionType(),transactionTime);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Second: " + time + "s");
        }
    }
    public void getAvgtime(){
        IntSummaryStatistics stats = times.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println(stats);
    }
}
