/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.SecurityService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neha D
 */
public class SecurityServiceDirectory {
    
    List<SecurityService> securityServiceList = new ArrayList<>();

    public SecurityServiceDirectory() {
    }

    public List<SecurityService> getSecurityServiceDirectory() {
        return securityServiceList;
    }

    public void setSecurityServiceDirectory(List<SecurityService> securityServiceList) {
        this.securityServiceList = securityServiceList;
    }
    
    public void addSecurityService(SecurityService item) {
        securityServiceList.add(item);
    }
    
    public void removeSecurityService(SecurityService item) {
        securityServiceList.remove(item);
    }
    
    
}
