/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

/**
 *
 * @author preranagireesh
 */
public class Listings {

    private int id;
    private static int counter = 0;
    private int unitNumber;
    private String address;
    private int numberOfBeds;
    private int numberOfBaths;
    private String propertyFeatures;
    private double rent;
    private boolean isAvailable;

    public Listings(int unitNumber, String address, int numberOfBeds, int numberOfBaths, String propertyFeatures, double rent, boolean isAvailable) {
        id = counter;
        counter = counter + 1;
        this.unitNumber = unitNumber;
        this.address = address;
        this.numberOfBeds = numberOfBeds;
        this.numberOfBaths = numberOfBaths;
        this.propertyFeatures = propertyFeatures;
        this.rent = rent;
        this.isAvailable = isAvailable;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public String getPropertyFeatures() {
        return propertyFeatures;
    }

    public void setPropertyFeatures(String propertyFeatures) {
        this.propertyFeatures = propertyFeatures;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return String.valueOf(unitNumber);
    }

}
