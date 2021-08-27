package com.endava.bankchallenge.model;

import com.endava.bankchallenge.strategy.RandomOperation;

public class Withdraw extends Transaction {

    public Withdraw(String transactionType, Customer customer) {
        super(transactionType, customer);
        operation = new RandomOperation();
    }

    
   
}
