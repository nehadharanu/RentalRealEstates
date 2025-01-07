/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rajesh
 */
public class EmergencyRequestDirectory {
    
    List<EmergencyRequest> emergencyUserList = new ArrayList<>();
    
    public void addEmergencyUser(EmergencyRequest emergencyRequest) {
        emergencyUserList.add(emergencyRequest);
    }
    
    public void removeEmergencyUser(EmergencyRequest emergencyRequest) {
        emergencyUserList.remove(emergencyRequest);
    }

    public List<EmergencyRequest> getEmergencyUserList() {
        return emergencyUserList;
    }

    public void setEmergencyUserList(List<EmergencyRequest> emergencyUserList) {
        this.emergencyUserList = emergencyUserList;
    }
    
}
