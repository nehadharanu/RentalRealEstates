/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Medical;

import Business.Roles.MedicalEmergencyRole;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author Neha D
 */
public class Ambulance extends UserAccount {
    private int id;
    private int count = 0;
    private String ambulanceServiceName;
    private String driverName;
    private long contactNo;

    public Ambulance(String userId, String pwd, String ambulanceServiceName, String driverName, long contactNo) {
        setUsername(userId);
        setPwd(pwd);
        setRole(new MedicalEmergencyRole());
        id = count;
        count = count+1;
        this.ambulanceServiceName = ambulanceServiceName;
        this.driverName = driverName;
        this.contactNo = contactNo;
    }

    public String getAmbulanceServiceName() {
        return ambulanceServiceName;
    }

    public void setAmbulanceServiceName(String ambulanceServiceName) {
        this.ambulanceServiceName = ambulanceServiceName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
}
