package Transactions;

public class Deposit extends Transaction{
    public Deposit(){
        this.transactionType="Deposit";
        this.operation = new RandomOperation();
    }
}
