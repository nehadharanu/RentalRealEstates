/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author preranagireesh
 */
public class RequestHomeEssentials {
    
    private String status;
    private int id;
    private String productType;
    private String realEstateAgentId;
    private String homeEssentialName;
    private int units;
    private String firstName;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getRealEstateAgentId() {
        return realEstateAgentId;
    }

    public void setRealEstateAgentId(String realEstateAgentId) {
        this.realEstateAgentId = realEstateAgentId;
    }

    public String getHomeEssentialName() {
        return homeEssentialName;
    }

    public void setHomeEssentialName(String homeEssentialName) {
        this.homeEssentialName = homeEssentialName;
    }

   
    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
}
