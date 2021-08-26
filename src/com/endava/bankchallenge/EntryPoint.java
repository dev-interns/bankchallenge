package com.endava.bankchallenge;

import com.endava.bankchallenge.model.Bank;
import com.endava.bankchallenge.model.Customer;
import com.endava.bankchallenge.model.Dispatcher;

import java.util.Random;
import java.util.stream.IntStream;

public class EntryPoint {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        IntStream.range(0,10).forEach( i -> {
            Customer customer = new Customer("Luis", "Otalora", 152, 12, "lotalora21@gmail.com", false);
            try {
                dispatcher.attend(customer, "Deposit");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        Bank bancoE = new Bank(new Random().nextInt(), "BancoE");

        bancoE.createNewOffice("classic office","Office E","Street S Avenue A");

        bancoE.showOffices();
        //bancoE.deleteOffice("Office E");
    }
}
