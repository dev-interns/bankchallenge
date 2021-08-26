package com.endava.bankchallenge.objectpool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.endava.bankchallenge.factory.AgentFactory;
import com.endava.bankchallenge.model.agent.Agent;

import java.util.Arrays;

public class AgentPool {
    private List<Agent> agents;
    private final AgentFactory agentFactory;
    private final List<String> agentTypes = new ArrayList<>(Arrays.asList("Cashier", "Supervisor", "Director"));
    HashMap<String, Integer> agentAvailability;

    public AgentPool() {
        agentFactory = new AgentFactory();
        agents = new ArrayList<>();
        agentAvailability = new HashMap<>();
        agentTypes
                .forEach(agentType -> agentAvailability.put(agentType, new Random().nextInt(10) + 1));
    }

    public Agent getAgent(int time) throws Exception {
        // updateagents
        //computeIfAbscent
        //compute
        agents.forEach(agent -> {
            agent.updateTime(time);
            if (!agent.isBusy()) {
                agentAvailability.put(agent.getType(), agentAvailability.get(agent.getType()) + 1);
            }
        });
        agents = updateAgentList(agents);
        for (String agentName : agentTypes) {
            if (agentAvailability.get(agentName) > 0) {
                System.out.println(this.agentAvailability);
                agentAvailability.put(agentName, agentAvailability.get(agentName) - 1);
                Agent agent = agentFactory.createAgent(agentName);
                agents.add(agent);
                return agent;
            }
        }
        throw new Exception("No agents available");
    }

    public static List<Agent> updateAgentList(List<Agent> list) {
        return list.stream()
                .filter(Agent::isBusy)
                .collect(Collectors.toList());
    }

}
