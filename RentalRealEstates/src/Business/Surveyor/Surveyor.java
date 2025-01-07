/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Surveyor;

import Business.Roles.SurveyorRole;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author preranagireesh
 */
public class Surveyor extends UserAccount {
    private String firstName;
    private String lastName;
    private String userID;
    private String userPassword;
    private long phoneNumber;

    public Surveyor(String firstName, String lastName, String userID, String userPassword, long phoneNumber) {
        setUsername(userID);
        setPwd(userPassword);
        setRole(new SurveyorRole());
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.userPassword = userPassword;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
    
}
