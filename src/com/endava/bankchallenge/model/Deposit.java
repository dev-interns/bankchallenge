package com.endava.bankchallenge.model;

import com.endava.bankchallenge.strategy.RandomOperation;

public class Deposit extends Transaction {
    public Deposit(String transactionType, int idTransaction, String transactionDate, Double transactionValue) {
        super(transactionType, idTransaction, transactionDate, transactionValue);
        this.operation = new RandomOperation();
    }
    public Deposit(String transactionType){
        super(transactionType,15,"15-15-12",1000.0);
        this.operation = new RandomOperation();
    }
}
