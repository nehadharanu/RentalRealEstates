/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HomeEssentials;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neha D
 */
public class HomeEssentialsDirectory {
    
    private List<HomeEssentials> homeEssentials = new ArrayList<>();

    public List<HomeEssentials> getHomeEssentials() {
        return homeEssentials;
    }

    public void setHomeEssentials(List<HomeEssentials> homeEssentials) {
        this.homeEssentials = homeEssentials;
    }
    
  
    public void addHomeEssentials(HomeEssentials item) {
        homeEssentials.add(item);
    }
    
    public void removeHomeEssentials(HomeEssentials item) {
        homeEssentials.remove(item);
    }
    
}
