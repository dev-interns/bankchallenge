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
        
        for (time = 0; time < 1; time++) {
            //TODO create random number of clients
            int nclients = new Random().nextInt(5);
            for (int i = 0; i < nclients; i++) {
                customers.add(new Customer("juan", "Castro", 2123, 12, "juan@endava.com"));
            }
            customers.stream().forEach(customer ->{
                String[] transactionType = {"Cashier","Director","Subject"};
                try {
                    dispatcher.attend(customer, transactionType[new Random().nextInt(transactionType.length)], time);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
    }
}
