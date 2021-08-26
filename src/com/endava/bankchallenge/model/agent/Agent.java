package com.endava.bankchallenge.model.agent;

import com.endava.bankchallenge.model.Transaction;

public abstract class Agent {
    private boolean busy;
    private int agentId;
    private String type;
    private int timeToEmpty;
    public Agent(boolean busy, int agentId, String type) {
        this.busy = false;
        this.agentId = agentId;
        this.type = type;
        this.timeToEmpty=0;
    }
    public Integer processTransaction(Transaction transaction, int time){
        int operationTime = transaction.performOperation();
        this.timeToEmpty = time +operationTime; 
        this.busy = true;
        return operationTime;
    }

    public boolean isBusy() {
        return busy;
    }

    public int getAgentId() {
        return agentId;
    }

    public void updateTime(int actualTime){
        if(actualTime>=this.timeToEmpty){
            this.busy=false;
        }
    }

    public String getType() {
        return type;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
    public int getTimeToEmpty(){
        return this.timeToEmpty;
    }
}

