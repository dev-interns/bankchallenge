package com.endava.bankchallenge.objectpool;

import com.endava.bankchallenge.factory.AgentFactory;
import com.endava.bankchallenge.model.agent.Agent;

import java.util.List;

public class AgentPool {
    private List<Agent> agents;
    private final AgentFactory agentFactory;
    public AgentPool(Integer n){
        agentFactory = new AgentFactory();

        // initialize all agents
        // [cashiser,cashiser,supervisor,supervisor,directo]
        // update busy agents state
        // create a comparator to order the list and get the free with string logic
        // option on streams to get a new one
        // counters in a map
    }
    {
        "Cashier":2,
        "Supervisor":1,
        "Director":5
    }
    public Agent getAgent(){
        if(ncashier >0){
            return agentFactory.createAgent("Cashier");
        }
        return null;
    }
    public List<Agent> getAgents() {
        return agents;
    }

}
