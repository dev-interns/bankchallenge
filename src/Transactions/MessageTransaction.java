package Transactions;

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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}