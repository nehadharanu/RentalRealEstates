/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.Ambulance.AmbulanceView;
import javax.swing.JPanel;

/**
 *
 * @author rajesh
 */
public class MedicalEmergencyRole extends Roles{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AmbulanceView(userProcessContainer, account, business);
    }
    
}
