/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HomeEssentials;

import Business.Roles.HomeEssentialsRole;
import Business.UserAccountManagement.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Neha D
 */
public class HomeEssentials extends UserAccount {

    Map<String, Integer> homeEssentialsMap = new HashMap<String, Integer>();

    
    private String userId;
    private String password;
    private String storeName;
    private String storeLocation;
    private Long phoneNo;

    public HomeEssentials(String storeName, String storeLocation, String userId, String password, Long phoneNo) {
        setUsername(userId);
        setPwd(password);
        setRole(new HomeEssentialsRole());
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.userId = userId;
        this.password = password;
        this.phoneNo = phoneNo;
    }

    // Generate the getter and setter method the variables
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String name) {
        this.storeName = name;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Integer> getHomeEssentialsMap() {
        return homeEssentialsMap;
    }

    public void setHomeEssentialsMap(Map<String, Integer> homeEssentialsMap) {
        this.homeEssentialsMap = homeEssentialsMap;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

}
