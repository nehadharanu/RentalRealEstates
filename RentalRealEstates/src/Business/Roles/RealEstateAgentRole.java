/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.RealEstateAgent.RealEstateAgentJPanel;
import javax.swing.JPanel;



/**
 *
 * @author Neha D
 */
public class RealEstateAgentRole extends Roles {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new RealEstateAgentJPanel(userProcessContainer, account, business);
    }
    
}
