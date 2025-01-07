/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Utility;

import Business.Roles.UtilityServiceRole;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author Neha D
 */
public class UtilityService extends UserAccount {

    private int id;
    private static int count = 0;
    private String utilityServiceLocation;
    private String utilityServiceName;
    private long contactNo;

    public UtilityService(String userId, String pwd, String utilityServiceLocation, String utilityServiceName, long contactNo) {
        setUsername(userId);
        setPwd(pwd);
        setRole(new UtilityServiceRole());
        id = count;
        count = count + 1;
        this.utilityServiceLocation = utilityServiceLocation;
        this.utilityServiceName = utilityServiceName;
        this.contactNo = contactNo;
    }

    public String getUtilityServiceLocation() {
        return utilityServiceLocation;
    }

    public void setUtilityServiceLocation(String utilityServiceLocation) {
        this.utilityServiceLocation = utilityServiceLocation;
    }

    public String getUtilityServiceName() {
        return utilityServiceName;
    }

    public void setUtilityServiceName(String utilityServiceName) {
        this.utilityServiceName = utilityServiceName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

}
