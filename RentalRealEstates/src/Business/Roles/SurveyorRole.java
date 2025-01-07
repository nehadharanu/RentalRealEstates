/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.User.UserAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rajesh
 */
public class SurveyorRole extends Roles {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new UserAreaJPanel(userProcessContainer, account, business);
    }
    
}
