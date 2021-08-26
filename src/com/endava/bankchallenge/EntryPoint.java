package com.endava.bankchallenge;

import com.endava.bankchallenge.model.Customer;
import com.endava.bankchallenge.model.Dispatcher;

import java.util.stream.IntStream;

public class EntryPoint {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        for (int time = 0; time < 1; time++) {
            Customer customer = new Customer("Luis", "Otalora", 152, 12, "lotalora21@gmail.com");
            try {
                dispatcher.attend(customer, "Deposit",time);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
