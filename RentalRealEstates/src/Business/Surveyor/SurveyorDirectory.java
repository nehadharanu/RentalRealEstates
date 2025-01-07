/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Surveyor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author preranagireesh
 */
public class SurveyorDirectory {
    List<Surveyor> surveyorList = new ArrayList<>();

    public List<Surveyor> getSurveyorList() {
        return surveyorList;
    }

    public void setSurveyorList(List<Surveyor> surveyorList) {
        this.surveyorList = surveyorList;
    }
    
    public void addSurveyor(Surveyor surveyor){
        surveyorList.add(surveyor);
    }
    
    public void removeSurveyor(Surveyor surveyor){
        surveyorList.remove(surveyor);
    }
}
