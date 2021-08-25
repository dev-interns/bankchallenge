package com.endava.bankchallenge.model;

public class MessageTransaction {

    private int customerId;
    private String customerEmail;
    private int accountId;
    private int agentId;
    private String messageType;
    private String transactionDate;
    private double transactionValue;
    private String transactionType;

    public MessageTransaction(int customerId, String customerEmail, int accountId, int agentId, String messageType, String transactionDate, double transactionValue, String transactionType) {
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.accountId = accountId;
        this.agentId = agentId;
        this.messageType = messageType;
        this.transactionDate = transactionDate;
        this.transactionValue = transactionValue;
        this.transactionType = transactionType;
    }

}