/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Medical;

import java.util.ArrayList;

/**
 *
 * @author Neha D
 */
public class AmbulanceDirectory {

    ArrayList<Ambulance> ambulanceDirectory = new ArrayList<>();

    public AmbulanceDirectory() {
    }

    public ArrayList<Ambulance> getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(ArrayList<Ambulance> ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public void addAmbulance(Ambulance ambulance) {
        ambulanceDirectory.add(ambulance);
    }

    public void removeAmbulance(Ambulance ambulance) {
        ambulanceDirectory.remove(ambulance);
    }

}
