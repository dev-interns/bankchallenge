package com.endava.bankchallenge;

import com.endava.bankchallenge.model.Customer;
import com.endava.bankchallenge.model.Dispatcher;
import com.endava.bankchallenge.model.SubjectTransaction;
import com.endava.bankchallenge.observer.AuditService;
import com.endava.bankchallenge.observer.MrkService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EntryPoint {
    static int time;
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Dispatcher dispatcher = new Dispatcher();
        SubjectTransaction.getInstance().attach(new AuditService());
        SubjectTransaction.getInstance().attach(new MrkService());
        for (time = 0; time < 5; time++) {
            System.out.println("Time :" + time + "s");
            int nclients = new Random().nextInt(20);
            System.out.println(nclients);
            for (int i = 0; i < nclients; i++) {
                customers.add(new Customer("juan", "Castro", 2123, 12, "juan@endava.com"));
            }
            customers.stream().forEach(customer ->{
                String[] transactionType = {"Deposit","Transfer","Withdraw"};
                try {
                    if(! customer.isAttended())
                        dispatcher.attend(customer, transactionType[new Random().nextInt(transactionType.length)], time);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
