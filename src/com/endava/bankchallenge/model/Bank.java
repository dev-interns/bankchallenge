

package com.endava.bankchallenge.model;

import com.endava.bankchallenge.factory.OfficeFactory;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int bankId;
    private String nameBank;
    private List<Office> listOffices;

    public Bank(int bankId, String nameBank) {
        listOffices = new ArrayList<>();
        this.bankId = bankId;
        this.nameBank = nameBank;
    }

    //TODO metodos de oficina porque static?
    public void createNewOffice(String officeType, String officeName, String officeAddress){
        Office newOffice = OfficeFactory.createOffice(officeType,officeName,officeAddress);
        listOffices.add(newOffice);
    }

}