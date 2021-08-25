package Agents;

import Transactions.Transaction;

public abstract class Agent {
    private boolean busy;
    private int agentId;
    private String type;
    public Agent(boolean busy, int agentId, String type) {
        this.busy = busy;
        this.agentId = agentId;
        this.type = type;
    }
    public int processTransaction(Transaction transaction){
        return transaction.performOperation();
    }

    public boolean isBusy() {
        return busy;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getType() {
        return type;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
}
