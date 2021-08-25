package com.endava.bankchallenge.model;

import com.endava.bankchallenge.model.Transaction;

public class Transfer extends Transaction {
    public Transfer(){
        this.transactionType = "Transfer";
    }
}
