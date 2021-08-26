package com.endava.bankchallenge.model;

import com.endava.bankchallenge.factory.CustomerFactory;
import com.endava.bankchallenge.observer.AuditService;
import com.endava.bankchallenge.observer.MrkService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Office {
    private int officeId;
    private String officeName;
    private String officeAddress;
    private String officeType;

    public Office(int officeId, String officeName, String officeAddress, String officeType) {
        this.officeId = officeId;
        this.officeName = officeName;
        this.officeAddress = officeAddress;
        this.officeType = officeType;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    static int time;

    public void simulate(int maxTime) {
        List<Customer> customers = new ArrayList<>();
        Dispatcher dispatcher = new Dispatcher();
        CustomerFactory customerFactory = new CustomerFactory();
        SubjectTransaction.getInstance().attach(new AuditService());
        SubjectTransaction.getInstance().attach(new MrkService());
        for (time = 0; time < maxTime; time++) {
            System.out.println("----------------------------------------------");
            System.out.println("Time :" + time + "s");
            int numberNewClients = new Random().nextInt(10) + 1;
            System.out.println("New clients: " + numberNewClients);
            customers = Stream
                    .concat(customers.stream(), customerFactory.createCustomers(numberNewClients).stream())
                    .collect(Collectors.toList());
            customers.forEach(customer -> {
                String[] transactionType = {"Deposit", "Transfer", "Withdraw"};
                try {
                    if (!customer.isAttended())
                        dispatcher.attend(customer, transactionType[new Random().nextInt(transactionType.length)], time);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            });
            System.out.println("Unattended clients " + customers.stream().filter(customer -> !customer.isAttended()).count());
        }
    }

}