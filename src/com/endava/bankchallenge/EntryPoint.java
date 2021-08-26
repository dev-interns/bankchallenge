package com.endava.bankchallenge;

import com.endava.bankchallenge.model.Customer;
import com.endava.bankchallenge.model.Dispatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class EntryPoint {
    static int time;
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Dispatcher dispatcher = new Dispatcher();
        
        for (time = 0; time < 5; time++) {
            System.out.println("Time :" + time + "s");
            //TODO create random number of clients
            int nclients = new Random().nextInt(5);
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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
    }
}
