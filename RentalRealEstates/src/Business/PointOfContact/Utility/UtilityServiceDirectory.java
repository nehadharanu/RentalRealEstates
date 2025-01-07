/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Utility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neha D
 */
public class UtilityServiceDirectory {

    List<UtilityService> utilityServiceList = new ArrayList<>();

    public UtilityServiceDirectory() {
    }

    public List<UtilityService> getUtilityServiceList() {
        return utilityServiceList;
    }

    public void setMaintenanceList(List<UtilityService> utilityServiceList) {
        this.utilityServiceList = utilityServiceList;
    }

    public void addNewMaintenance(UtilityService maintenance) {
        utilityServiceList.add(maintenance);
    }

    public void removeMaintenance(UtilityService maintenance) {
        utilityServiceList.remove(maintenance);
    }

}
