package com.endava.bankchallenge.factory;

import com.endava.bankchallenge.model.Transfer;
import com.endava.bankchallenge.model.Withdraw;
import com.endava.bankchallenge.model.Customer;
import com.endava.bankchallenge.model.Deposit;
import com.endava.bankchallenge.model.Transaction;

public class TransactionFactory {
    public Transaction createTransaction(String transactionType,Customer customer) throws Exception {
        switch (transactionType){
            case "Transfer":
                return new Transfer(transactionType,customer);
            case "Withdraw":
                return new Withdraw(transactionType,customer);
            case "Deposit":
                return new Deposit(transactionType,customer);
            default:
                throw new Exception("Don't supported transaction type ");
        }
    }
}
