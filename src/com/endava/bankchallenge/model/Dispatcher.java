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
        Handler fileHandler = null;
        try {
            File file = new File("logger.log");
            if (!file.exists())
                file.createNewFile();
            fileHandler = new FileHandler("logger.log", 50000, 1);
            logger = Logger.getLogger(Dispatcher.class.getName());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void attend(Customer customer, String transactionType, int time){
        try {
            Transaction transaction = transactionFactory.createTransaction(transactionType, customer);
            Agent agent = agentPool.getAgent(time);
            int transactionTime = agent.processTransaction(transaction, time);
            times.add(transactionTime);
            System.out.printf("I'm a %s \nI attend a %s \nIn: %s s\n",agent.getType(),transaction.getTransactionType(),transactionTime);
        } catch (Exception e) {
            System.err.println(e.getMessage() + " Second: " + time + "s");
            //logger.log(Level.INFO,e.getMessage() + " Second: " + time + "s");
        }
    }
    public void getAvgtime(){
        IntSummaryStatistics stats = times.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println(stats);
    }
}
