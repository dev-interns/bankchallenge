package com.endava.bankchallenge.factory;

import com.endava.bankchallenge.model.Transfer;
import com.endava.bankchallenge.model.Withdraw;
import com.endava.bankchallenge.model.Deposit;
import com.endava.bankchallenge.model.Transaction;

public class TransactionFactory {
    public Transaction createTransaction(String transactionType) throws Exception {
        switch (transactionType){
            case "Transfer":
                return new Transfer();
            case "Withdraw":
                return new Withdraw();
            case "Deposit":
                return new Deposit(transactionType);
            default:
                throw new Exception("Don't supported transaction type ");
        }
    }
}
