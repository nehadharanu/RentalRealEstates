/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PropertyDevelopmenntBoard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neha D
 */
public class InquiryFormDirectory {

    List<InquiryForm> inquiryFormDirectory = new ArrayList<InquiryForm>();

    public List<InquiryForm> getInquiryFormDirectory() {
        return inquiryFormDirectory;
    }

    public void setInquiryFormDirectory(List<InquiryForm> inquiryFormDirectory) {
        this.inquiryFormDirectory = inquiryFormDirectory;
    }

    public void addInquiryForm(InquiryForm inquiry) {
        inquiryFormDirectory.add(inquiry);
    }

    public void removeInquiryForm(InquiryForm inquiry) {
        inquiryFormDirectory.remove(inquiry);
    }
}
