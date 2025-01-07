/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RealEstateAgency;

import Business.Roles.RealEstateAgentRole;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author Neha D
 */
public class RealEstateAgent extends UserAccount {

    String userId;
    String agentPassword;
    String agentName;
    String specialization;
    Long phoneNo;
    String rentalAgency;

    public RealEstateAgent(String userId, String agentPassword, String agentName, String specialization, Long phoneNo, String rentalAgency) {
        setUsername(userId);
        setPwd(agentPassword);
        setRole(new RealEstateAgentRole());
        this.userId = userId;
        this.agentPassword = agentPassword;
        this.agentName = agentName;
        this.specialization = specialization;
        this.phoneNo = phoneNo;
        this.rentalAgency = rentalAgency;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAgentPassword() {
        return agentPassword;
    }

    public void setAgentPassword(String agentPassword) {
        this.agentPassword = agentPassword;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRentalAgency() {
        return rentalAgency;
    }

    public void setRentalAgency(String rentalAgency) {
        this.rentalAgency = rentalAgency;
    }

    @Override
    public String toString() {
        return agentName;
    }

}
