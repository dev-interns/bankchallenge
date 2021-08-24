package Transactions;

import java.util.Random;

public abstract class Transaction{

    protected String transactionType;
    private int idTransaction;
    private String transactionDate;
    private Double transactionValue;
    protected Operation operation;

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