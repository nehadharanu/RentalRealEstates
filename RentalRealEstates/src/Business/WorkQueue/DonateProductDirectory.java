/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neha D
 */
public class DonateProductDirectory {
    
    List<DonateProduct> donors = new ArrayList<>();

    public List<DonateProduct> getDonors() {
        return donors;
    }

    public void setDonors(List<DonateProduct> donors) {
        this.donors = donors;
    }
    
    public void addRequest(DonateProduct user) {
        donors.add(user);
    }
    
    public void removeRequest(DonateProduct user) {
        donors.remove(user);
    }
    
}
