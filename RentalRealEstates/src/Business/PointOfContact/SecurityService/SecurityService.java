/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.SecurityService;

import Business.Roles.SecurityServiceRole;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author Neha D
 */
public class SecurityService extends UserAccount {

    private int id;
    private static int count = 0;
    private String securityServiceLocation;
    private String securityManName;
    private long contactNo;

    public SecurityService() {

    }

    public SecurityService(String userId, String pwd, String securityServiceLocation, String securityManName, long contactNo) {
        setUsername(userId);
        setPwd(pwd);
        setRole(new SecurityServiceRole());
        id = count;
        count = count + 1;
        this.securityServiceLocation = securityServiceLocation;
        this.securityManName = securityManName;
        this.contactNo = contactNo;
    }

    public String getSecurityServiceLocation() {
        return securityServiceLocation;
    }

    public void setSecurityServiceLocation(String securityServiceLocation) {
        this.securityServiceLocation = securityServiceLocation;
    }

    public String getSecurityManName() {
        return securityManName;
    }

    public void setSecurityManName(String securityManName) {
        this.securityManName = securityManName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

}
