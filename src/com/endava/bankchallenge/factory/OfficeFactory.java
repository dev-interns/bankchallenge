package com.endava.bankchallenge.factory;

import com.endava.bankchallenge.model.Office;

import java.util.Random;

public class OfficeFactory {
    public static Office createOffice(String officeType, String officeName, String officeAddress){
        if ("classic office".equals(officeType)) {
            return new Office(new Random().nextInt(999999999), officeName, officeAddress, officeType);
        }
        throw new RuntimeException("Don't supported office type ");
    }
}