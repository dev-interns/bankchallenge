package com.endava.bankchallenge.factory;

import com.endava.bankchallenge.model.Office;

import java.util.Random;

public class OfficeFactory {
    public static Office createOffice(String officeType, String officeName, String officeAddress){
        switch (officeType){
            case "classic office":
                return new Office(new Random().nextInt(),officeName,officeAddress,officeType);
            default:
                return null;
        }
    }
}