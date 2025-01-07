/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.SysManager.HomeEssentialsSysJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neha D
 */
public class HomeEssentialsRole extends Roles {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new HomeEssentialsSysJPanel(business, userProcessContainer);
    }
}
