package com.endava.bankchallenge.objectpool;

import com.endava.bankchallenge.factory.AgentFactory;
import com.endava.bankchallenge.model.agent.Agent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


public class AgentPool {
    private List<Agent> agents;
    private final AgentFactory agentFactory;
    HashMap<String,Integer> agentdict;
    public AgentPool(){
        agentFactory = new AgentFactory();
        agents = new ArrayList<>();
        String[] agentsnames = {"Cashier","Supervisor","Director"};
        agentdict = new HashMap<>();
        IntStream.range(0, agentsnames.length)
            .forEach(cat ->{
                agentdict.put(agentsnames[cat], new Random().nextInt(5));
            });
        System.out.println(agentdict.toString());
        // initialize all agents
        // [cashiser,cashiser,supervisor,supervisor,directo]
        // update busy agents state
        // create a comparator to order the list and get the free with string logic
        // option on streams to get a new one
        // counters in a map
    }
    public void getAgent(){
        if(agents.isEmpty()){
            //create a new agent append and return
        }else{
            //get the fist agent and return 
        }
        // throw error
    }
    // }
    public void createAgent(){
        System.out.println("----Agent----");
        System.out.println(this.agentdict.keySet().stream().filter(e -> agentdict.get(e)>0).findFirst());
    }
    public List<Agent> getAgents() {
        return agents;
    }

}
