/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author preranagireesh
 */
public class BuilderDirectory {
    
    List<Builder> builders;

    public BuilderDirectory() {
        builders = new ArrayList<>();
    }
    

    public List<Builder> getBuilders() {
        return builders;
    }

    public void setBuilders(List<Builder> builders) {
        this.builders = builders;
    }
    
    //add builder
    public void addBuilder(Builder builder) {
        builders.add(builder);
    }
    
    //remove builder
    public void removeBuilder(Builder builder) {
        builders.remove(builder);
    }
    
}
