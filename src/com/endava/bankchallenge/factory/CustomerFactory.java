package com.endava.bankchallenge.factory;

import com.endava.bankchallenge.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerFactory {
    public List<Customer> customers;
    public String[] firstNames = {"Luis","Juan","Felipe","Alex","Camilo","Javier","Ana","Brenda","Vanesa","Jorge",
            "Maria", "Valentina", "Paula", "Gabriela", "Andres","Ricardo","Laura", "Angie", "Peter", "Diana",
            "Silvia", "Alejandro", "Lucas", "Julian", "Cristian", "Sebastian", "Carlos", "Isabella", "Eric", "John"};
    public String[] lastNames = {"Otalora","Marin","Canar","Gomez","Restrepo","Naranjo","Rojo","Blanco", "Rodriguez", "Ardila", "Pineda",
            "Martinez", "Molina", "Merchan", "Mora", "Mondragon", "Parker", "Moreno", "Vallejo", "Andrae", "Isaza",
            "Patino", "Dorado", "Leon", "Obregon", "Casallas", "Llanos", "Cuevas", "Estupinan", "Castillo", "Sanguino"};

    public List<Customer> createCustomers(int numberCustomers){
        customers = new ArrayList<>();
        for (int i=0;i<numberCustomers;i++){
            customers.add(new Customer(firstNames[new Random().nextInt(firstNames.length-1)],lastNames[new Random().nextInt(lastNames.length-1)],
                    new Random().nextInt(999999999), new Random().nextInt(999999999), firstNames[new Random().nextInt(firstNames.length-1)]+"."+lastNames[new Random().nextInt(lastNames.length-1)]+"@bank.com",
                    false));
        }
        return customers;
    }


}