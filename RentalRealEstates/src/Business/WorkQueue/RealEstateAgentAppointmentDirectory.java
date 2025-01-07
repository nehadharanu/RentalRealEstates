/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author preranagireesh
 */
public class RealEstateAgentAppointmentDirectory {
    
    List<RealEstateAgentAppointment> appointments = new ArrayList<>();

    public List<RealEstateAgentAppointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<RealEstateAgentAppointment> appointments) {
        this.appointments = appointments;
    }
    
    public void removeRequest(RealEstateAgentAppointment appointment){
        appointments.remove(appointment);
    }
    
    public void addRequest(RealEstateAgentAppointment appointment){
        appointments.add(appointment);
    }
    
}
