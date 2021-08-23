package Transactions;

import java.util.Random;

public abstract class Transaction{

    protected String transactionType;
    private int idTransaction;
    private String transactionDate;
    private Double transactionValue;

    public double performOperation(){
        return 10 + (15 - 10) * new Random().nextDouble();
    }
    
}