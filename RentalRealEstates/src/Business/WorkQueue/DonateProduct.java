/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Neha D
 */
public class DonateProduct {
    
    int id;
    String time;
    String status;
    String homeEssentialName;
    String appoinmentTime;
    String userId;
    Date appoinmentDate;
    String firstName;
    String lastName;
    String productType;
    String specifics;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSpecifics() {
        return specifics;
    }

    public void setSpecifics(String specifics) {
        this.specifics = specifics;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String gethomeEssentialName() {
        return homeEssentialName;
    }

    public void sethomeEssentialName(String marketplaceName) {
        this.homeEssentialName = marketplaceName;
    }

    public String getAppoinmentTime() {
        return appoinmentTime;
    }

    public void setAppoinmentTime(String appoinmentTime) {
        this.appoinmentTime = appoinmentTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getAppoinmentDate() {
        return appoinmentDate;
    }

    public void setAppoinmentDate(Date appoinmentDate) {
        this.appoinmentDate = appoinmentDate;
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
    
    
}
