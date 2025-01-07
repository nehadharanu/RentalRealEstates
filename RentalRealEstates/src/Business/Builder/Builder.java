/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

import Business.Roles.BuilderRole;
import Business.UserAccountManagement.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author preranagireesh
 */
public class Builder extends UserAccount {
    
    private String builderName;
    private String builderLocation;
    private String builderEmail;
    private String builderUserID;
    private String builderPassword;
    private List<Listings> listings;

    public Builder(String builderName, String builderLocation, String builderEmail, String builderUserID, String builderPassword) {
        setUsername(builderUserID);
        setPwd(builderPassword);
        setRole(new BuilderRole());
        this.builderName = builderName;
        this.builderLocation = builderLocation;
        this.builderEmail = builderEmail;
        this.builderUserID = builderUserID;
        this.builderPassword = builderPassword;
        this.listings = new ArrayList<>();
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public String getBuilderLocation() {
        return builderLocation;
    }

    public void setBuilderLocation(String builderLocation) {
        this.builderLocation = builderLocation;
    }

    public String getBuilderEmail() {
        return builderEmail;
    }

    public void setBuilderEmail(String builderEmail) {
        this.builderEmail = builderEmail;
    }

    public String getBuilderUserID() {
        return builderUserID;
    }

    public void setBuilderUserID(String builderUserID) {
        this.builderUserID = builderUserID;
    }

    public String getBuilderPassword() {
        return builderPassword;
    }

    public void setBuilderPassword(String builderPassword) {
        this.builderPassword = builderPassword;
    }

    public List<Listings> getListings() {
        return listings;
    }

    public void setListings(List<Listings> listings) {
        this.listings = listings;
    }

    @Override
    public String toString() {
        return builderName;
    }

    
    
}


