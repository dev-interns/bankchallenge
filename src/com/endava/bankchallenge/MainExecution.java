package com.endava.bankchallenge;

import com.endava.bankchallenge.model.Bank;

public class MainExecution {
    public static void main(String[] args) {
        Bank bank = new Bank(1,"Davivienda");
        bank.createNewOffice("classic office","Office 1","Calle Jacinto #23-45");
        bank.getListOffices().get(0).simulate(5);
    }
}
