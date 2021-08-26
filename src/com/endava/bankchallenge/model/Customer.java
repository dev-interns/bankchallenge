package com.endava.bankchallenge.model;

public class Customer {
    private String firstName;
    private String lastName;
    private int customerId;
    private int accountId;
    private String customerEmail;
    private boolean attended;

    public Customer(String firstName, String lastName, int customerId, int accountId, String customerEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.accountId = accountId;
        this.customerEmail = customerEmail;
        this.attended = false;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public boolean isAttended() {
        return attended;
    }
}