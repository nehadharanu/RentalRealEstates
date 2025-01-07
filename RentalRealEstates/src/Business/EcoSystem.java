/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author rajesh
 */
public class EcoSystem extends SystemModel {
    
    private static EcoSystem business;
    
    public static EcoSystem getInstance(){
        if(business == null){
            business = new EcoSystem();
        }
        return business;
    }
    
    public static void setInstance(EcoSystem system) {	
        business = system;	
    }
    
}
