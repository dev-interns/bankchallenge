package Agents;

import Transactions.Transaction;

import java.util.Random;

public class AgentFactory {
    public Agent createAgent(String type){
        switch (type){
            case "Cashier":
                return new Cashier(false, new Random().nextInt(),"Cashier");
            case "Supervisor":
                return new Cashier(false, new Random().nextInt(),"Supervisor");
            case "Director":
                return new Cashier(false, new Random().nextInt(),"Director");
            default:
                return null;
        }
    }
}
