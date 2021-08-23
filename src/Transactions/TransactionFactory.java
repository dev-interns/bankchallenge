package Transactions;

public class TransactionFactory {
    public Transaction createTransaction(String transactionType){
        switch (transactionType){
            case "Transfer":
                return new Transfer();
            case "Withdraw":
                return new Withdraw();
            case "Deposit":
                return new Deposit();
            default:
                return null;
        }
    }
}
