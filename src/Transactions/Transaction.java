package Transactions;

public abstract class Transaction{

    private int idTransaction;
    private String transactionDate, transactionType;
    private Double transactionValue;

    abstract public double performOperation();
    
}