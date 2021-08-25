package com.endava.bankchallenge.model;

import com.endava.bankchallenge.model.Transaction;

public class Withdraw extends Transaction {
    public Withdraw(){
        this.transactionType = "Withdraw";
    }
}
