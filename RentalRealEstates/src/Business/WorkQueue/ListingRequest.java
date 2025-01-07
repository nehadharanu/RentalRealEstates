/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Builder.Listings;
import Business.Enums.ListingsState;

/**
 *
 * @author Neha D
 */
public class ListingRequest {

    String builderName;
    int id;
    String tenantId;
    ListingsState status;
    Listings listing;
    String RealEstateAgentName;

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Listings getListing() {
        return listing;
    }

    public void setListing(Listings listing) {
        this.listing = listing;
    }

    public Listings getListings() {
        return listing;
    }

    public void setListings(Listings listing) {
        this.listing = listing;
    }

    public String getRealEstateAgentName() {
        return RealEstateAgentName;
    }

    public void setRealEstateAgentName(String RealEstateAgentName) {
        this.RealEstateAgentName = RealEstateAgentName;
    }
    
     public ListingsState getStatus() {
        return status;
    }

    public void setStatus(ListingsState status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

}
