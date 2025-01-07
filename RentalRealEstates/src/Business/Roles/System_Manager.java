/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import javax.swing.JPanel;
import UserInterface.SysManager.SysManagerWorkAreaJPanel;


/**
 *
 * @author Neha D
 */
public class System_Manager extends Roles {
    
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        return new SysManagerWorkAreaJPanel(userProcessContainer, ecoSystem);
    }

}
