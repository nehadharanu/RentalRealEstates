/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PropertyDevelopmenntBoard;

/**
 *
 * @author Neha D
 */
public class InquiryForm {

    private int id;
    private int count = 0;

    private String housingType;
    //private String distance;
    private int expectedNoOfBeds;
    private int expectedNoOfBaths;
    private String expectedRoomMates;
    private String expectedRent;
    private String publicTransport;
    private String expectedAmenities;
    private String convenienceStore;

    public InquiryForm( String housingType, int expectedNoOfBeds, int expectedNoOfBaths, String expectedRoomMates, String expectedRent, String publicTransport, String expectedAmenities, String convenienceStore) {
        id = count;

        this.housingType = housingType;
        //this.distance = distance;
        this.expectedNoOfBeds = expectedNoOfBeds;
        this.expectedNoOfBaths = expectedNoOfBaths;
        this.expectedRoomMates = expectedRoomMates;
        this.expectedRent = expectedRent;
        this.publicTransport = publicTransport;
        this.expectedAmenities = expectedAmenities;
        this.convenienceStore = convenienceStore;
        count += count;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

//    public String getDistance() {
//        return distance;
//    }
//
//    public void setDistance(String distance) {
//        this.distance = distance;
//    }

    public int getExpectedNoOfBeds() {
        return expectedNoOfBeds;
    }

    public void setExpectedNoOfBeds(int expectedNoOfBeds) {
        this.expectedNoOfBeds = expectedNoOfBeds;
    }

    public int getExpectedNoOfBaths() {
        return expectedNoOfBaths;
    }

    public void setExpectedNoOfBaths(int expectedNoOfBaths) {
        this.expectedNoOfBaths = expectedNoOfBaths;
    }

    public String getExpectedRoomMates() {
        return expectedRoomMates;
    }

    public void setExpectedRoomMates(String expectedRoomMates) {
        this.expectedRoomMates = expectedRoomMates;
    }

    public String getExpectedRent() {
        return expectedRent;
    }

    public void setExpectedRent(String expectedRent) {
        this.expectedRent = expectedRent;
    }

    public String getPublicTransport() {
        return publicTransport;
    }

    public void setPublicTransport(String publicTransport) {
        this.publicTransport = publicTransport;
    }

    public String getExpectedAmenities() {
        return expectedAmenities;
    }

    public void setExpectedAmenities(String expectedAmenities) {
        this.expectedAmenities = expectedAmenities;
    }

    public String getConvenienceStore() {
        return convenienceStore;
    }

    public void setConvenienceStore(String convenienceStore) {
        this.convenienceStore = convenienceStore;
    }

}
