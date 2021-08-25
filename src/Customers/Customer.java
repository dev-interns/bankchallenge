package Customers;

public class Customer {
    public String firstName;
    public String lastName;
    public int customerId;
    public int accountId;
    public String customerEmail;

    public Customer(String firstName, String lastName, int customerId, int accountId, String customerEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.accountId = accountId;
        this.customerEmail = customerEmail;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCustomerId() { return customerId; }

    public int getAccountId() { return accountId; }

    public String getCustomerEmail() { return customerEmail; }

}