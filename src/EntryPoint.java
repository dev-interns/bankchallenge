import java.util.stream.IntStream;

public class EntryPoint {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        //Customer customer;
        IntStream.range(0,10).forEach( i-> {
            Customer customer = new Customer("Luis", "Otalora", 152, 12, "lotalora21@gmail.com");
            dispatcher.attend(customer, "Deposit");
        });
    }
}
