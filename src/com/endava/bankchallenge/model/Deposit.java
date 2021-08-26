package com.endava.bankchallenge.model;

import com.endava.bankchallenge.strategy.RandomOperation;

public class Deposit extends Transaction {

    public Deposit(String transactionType, Customer customer) {
        super(transactionType, customer);
        operation = new RandomOperation();
    }

}
