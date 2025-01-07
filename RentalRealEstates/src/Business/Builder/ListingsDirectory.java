/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rajesh
 */
public class ListingsDirectory {

    List<Listings> listings = new ArrayList<>();

    public List<Listings> getListings() {
        return listings;
    }

    public void setListings(List<Listings> listings) {
        this.listings = listings;
    }

    public void addListing(Listings listing) {
        listings.add(listing);
    }

    public void removeListing(Listings listing) {
        listings.remove(listing);
    }

    List<Listings> listingsDirectory = new ArrayList<Listings>();

    public List<Listings> getListingsDirectory() {
        return listingsDirectory;
    }

    public void removeListings(Listings listing) {
        listingsDirectory.remove(listing);
    }

    public void addListings(Listings listing) {
        listingsDirectory.add(listing);
    }

    public void setListingsDirectory(List<Listings> listingsDirectory) {
        this.listingsDirectory = listingsDirectory;
    }

}
