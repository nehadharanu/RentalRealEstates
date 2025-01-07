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
public class ListingRequestDirectory {
    List<ListingRequest> listingRequirement = new ArrayList<ListingRequest>();

    public List<ListingRequest> getListingRequirement() {
        return listingRequirement;
    }

    public void setListingRequirement(List<ListingRequest> listingRequirement) {
        this.listingRequirement = listingRequirement;
    }
    
    public void addUserRequest(ListingRequest listing){
        listingRequirement.add(listing);
    }
    
    public void removeUserRequest(ListingRequest listing){
        listingRequirement.remove(listing);
    }
}
