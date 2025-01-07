/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Roles.System_Manager;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author rajesh
 */
public class SystemConfig {
    
     public static EcoSystem configureSystem() {

        EcoSystem system = EcoSystem.getInstance();

        UserAccount ua = system.getUserAccDirectory().createUserAccount("sysmanager1", "sysmanager1", new System_Manager());

        return system;
    }
    
}
