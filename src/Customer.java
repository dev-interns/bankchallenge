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

}