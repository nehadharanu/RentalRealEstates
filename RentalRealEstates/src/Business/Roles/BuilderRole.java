/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.Builder.BuilderEnterpriseJFrame;
import javax.swing.JPanel;

/**
 *
 * @author preranagireesh
 */
public class BuilderRole extends Roles {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new BuilderEnterpriseJFrame(userProcessContainer, account, business);
    }

      
}
