package com.endava.bankchallenge.model;

import com.endava.bankchallenge.strategy.RandomOperation;

public class Transfer extends Transaction {

    public Transfer(String transactionType, Customer customer) {
        super(transactionType, customer);
        operation = new RandomOperation();
    }

}
