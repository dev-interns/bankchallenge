import Agents.Agent;
import Agents.AgentFactory;
import Transactions.Transaction;
import Transactions.TransactionFactory;

public class Dispatcher {
    double time;
    AgentFactory agentFactory;
    TransactionFactory transactionFactory;
    public Dispatcher(){
        this.agentFactory = new AgentFactory();
        this.transactionFactory = new TransactionFactory();
    }
    public void attend(Customer customer, String transactionType){
        Transaction transaction = transactionFactory.createTransaction(transactionType);
        //logic get the type of agent
        String type = "Cashier";
        Agent agent = agentFactory.createAgent(type);
        int time =agent.processTransaction(transaction);
        System.out.println("I'm a " + agent.getType());
        System.out.println("I attend " + transaction.getTransactionType());
        System.out.println("in: " + time + " s");
    }
}
