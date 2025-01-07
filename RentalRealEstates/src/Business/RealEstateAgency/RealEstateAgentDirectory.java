/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RealEstateAgency;

import java.util.ArrayList;

/**
 *
 * @author rajesh
 */
public class RealEstateAgentDirectory{

    ArrayList<RealEstateAgent> realEstateAgents = new ArrayList<>();

    public ArrayList<RealEstateAgent> getRealEstateAgent() {
        return realEstateAgents;
    }

    public void setRealEstateAgent(ArrayList<RealEstateAgent> realEstateAgents) {
        this.realEstateAgents = realEstateAgents;
    }

    public void addNewRealEstateAgent(RealEstateAgent agent) {
        realEstateAgents.add(agent);
    }

    public void removeRealEstateAgent(RealEstateAgent agent) {
        realEstateAgents.remove(agent);
    }

    public RealEstateAgent findRealEstateAgent(String name) {
        for (RealEstateAgent agent : realEstateAgents) {
            if (agent.getAgentName().equals(name)) {
                return agent;
            }
        }
        return null;
    }
}