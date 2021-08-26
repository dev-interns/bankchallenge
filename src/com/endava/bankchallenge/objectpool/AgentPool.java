package com.endava.bankchallenge.objectpool;

//import com.endava.bankchallenge.factory.AgentFactory;
//import com.endava.bankchallenge.model.agent.Agent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.endava.bankchallenge.factory.AgentFactory;
import com.endava.bankchallenge.model.agent.Agent;

import java.util.Arrays;


public class AgentPool {
    private List<Agent> agents;
    private final AgentFactory agentFactory;
    private final List<String> agentsnames = new ArrayList<String>(Arrays.asList("Cashier","Supervisor","Director"));
    HashMap<String,Integer> agentdict;
    public AgentPool(){
        agentFactory = new AgentFactory();
        agents = new ArrayList<>();
        
        agentdict = new HashMap<>();
        IntStream.range(0, agentsnames.size())
            .forEach(cat ->{
                agentdict.put(agentsnames.get(cat), new Random().nextInt(10)+1);
            });
        System.out.println(agentdict.toString());
        // initialize all agents
        // [cashiser,cashiser,supervisor,supervisor,directo]
        // update busy agents state
        // create a comparator to order the list and get the free with string logic
        // option on streams to get a new one
        // counters in a map
    }
    public Agent getAgent(int time){
        // updateagents
        agents.forEach(agent ->{
            agent.updateTime(time);
            if(!agent.isBusy()){
                agentdict.put(agent.getType(), agentdict.get(agent.getType())+1);
            }
        });
        agents = updateAgentList(agents, time);
        // System.err.println(agents);
        // agents.stream().forEach(a->System.out.print(a.getTimeToEmpty()+","));
        // System.out.println();
        // agents.stream().forEach(a->System.out.print(a.isBusy()+","));
        // System.out.println();
        //if(agents.isEmpty()){
            //create a new agent append and return
        for(String agentname : agentsnames){
            if(agentdict.get(agentname)>0 ){
                agentdict.put(agentname, agentdict.get(agentname)-1);
                Agent temagent = agentFactory.createAgent(agentname);
                agents.add(temagent);
                System.out.println(this.agentdict);
                return temagent;
            }
        }
        //}else{
            //get the fist agent and return 
        //}
        // throw error
        return new AgentFactory().createAgent("Cashier");
    }
    // }
    public static List<Agent> updateAgentList(List<Agent> list, int time)
{
    return list.stream()
                .filter(x -> x.isBusy())
                .collect(Collectors.toList());
}
    public List<Agent> getAgents() {
        return agents;
    }

}
