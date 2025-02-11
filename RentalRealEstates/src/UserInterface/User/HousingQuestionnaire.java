/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Business.EcoSystem;
import Business.PropertyDevelopmenntBoard.InquiryForm;
import Business.PropertyDevelopmenntBoard.InquiryFormDirectory;
import Business.UserAccountManagement.UserAccount;
//import Business.WorkQueue.OutbreakTracer;
//import Business.WorkQueue.OutbreakTracerDir;
import Business.User.User;
//import UserInterface.SysAdmin.MapViewerTwo;
import Utility.Notification;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha D
 */
public class HousingQuestionnaire extends javax.swing.JPanel {

    /**
     * Creates new form Housing Questionnaire
     */
    EcoSystem system;
    JPanel rightSidePanel;
    UserAccount userAcc;
    String locationCordinate;
    
    public HousingQuestionnaire(EcoSystem system, JPanel rightSidePanel,UserAccount userAcc) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.userAcc=userAcc;
        this.setSize(1160, 750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        housingComboBox = new javax.swing.JComboBox<>();
        positive = new javax.swing.JLabel();
        positive1 = new javax.swing.JLabel();
        positive2 = new javax.swing.JLabel();
        positive3 = new javax.swing.JLabel();
        positive4 = new javax.swing.JLabel();
        positive5 = new javax.swing.JLabel();
        positive6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bathsComboBox = new javax.swing.JComboBox<>();
        bedsComboBox = new javax.swing.JComboBox<>();
        sharingComboBox = new javax.swing.JComboBox<>();
        transportComboBox = new javax.swing.JComboBox<>();
        rentComboBox = new javax.swing.JComboBox<>();
        ammenityComboBox = new javax.swing.JComboBox<>();
        storeComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Housing Development Board");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setText("Questionnaire");

        housingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Studio", "Apartment", "Independent house", "Shared" }));
        housingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housingComboBoxActionPerformed(evt);
            }
        });

        positive.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive.setText("How many bedroom's do you prefer in your house?");

        positive1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive1.setText("How many bathroom's do you prefer in your house?");

        positive2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive2.setText("How many people would you ideally share your house with?");

        positive3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive3.setText("How much rent are you willing to pay ($)?");

        positive4.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive4.setText("Do you prefer public transport?");

        positive5.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive5.setText("Which is the most important ammenity in your housing facility? ");

        positive6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positive6.setText("Which is the most important store in your surrounding? ");

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel4.setText("What kind of housing do you prefer?");

        bathsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        bathsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathsComboBoxActionPerformed(evt);
            }
        });

        bedsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        bedsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedsComboBoxActionPerformed(evt);
            }
        });

        sharingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2-3", "4-5", "no preference" }));
        sharingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharingComboBoxActionPerformed(evt);
            }
        });

        transportComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Maybe" }));
        transportComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportComboBoxActionPerformed(evt);
            }
        });

        rentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 - 1000", "1000 - 2000", "2000 - 4000", "4000+" }));
        rentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentComboBoxActionPerformed(evt);
            }
        });

        ammenityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In-house laundry", "Gym", "Good view", "No preference" }));
        ammenityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammenityComboBoxActionPerformed(evt);
            }
        });

        storeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Target", "Walmart", "Stop & Shop", "Patel Brothers" }));
        storeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(positive, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positive1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positive2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positive3, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positive4, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positive5, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positive6, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(265, 265, 265)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ammenityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(housingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sharingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bathsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bedsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 934, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ammenityComboBox, bathsComboBox, bedsComboBox, housingComboBox, rentComboBox, sharingComboBox, storeComboBox, transportComboBox});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(housingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive)
                    .addComponent(bedsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive1)
                    .addComponent(bathsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive2)
                    .addComponent(sharingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive3)
                    .addComponent(rentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive4)
                    .addComponent(transportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive5)
                    .addComponent(ammenityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positive6)
                    .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1090, 480));

        submitButton.setBackground(new java.awt.Color(51, 51, 255));
        submitButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, 220, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void housingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_housingComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        surveyProcessing();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void bathsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathsComboBoxActionPerformed

    private void bedsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bedsComboBoxActionPerformed

    private void sharingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sharingComboBoxActionPerformed

    private void transportComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportComboBoxActionPerformed

    private void rentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentComboBoxActionPerformed

    private void ammenityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammenityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammenityComboBoxActionPerformed

    private void storeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeComboBoxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ammenityComboBox;
    private javax.swing.JComboBox<String> bathsComboBox;
    private javax.swing.JComboBox<String> bedsComboBox;
    private javax.swing.JComboBox<String> housingComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel positive;
    private javax.swing.JLabel positive1;
    private javax.swing.JLabel positive2;
    private javax.swing.JLabel positive3;
    private javax.swing.JLabel positive4;
    private javax.swing.JLabel positive5;
    private javax.swing.JLabel positive6;
    private javax.swing.JComboBox<String> rentComboBox;
    private javax.swing.JComboBox<String> sharingComboBox;
    private javax.swing.JComboBox<String> storeComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> transportComboBox;
    // End of variables declaration//GEN-END:variables

    private void surveyProcessing() {

        //String admittedUniversity = universityComboBox.getSelectedItem().toString();
        String housing = housingComboBox.getSelectedItem().toString();
//        String distance = distanceComboBox.getSelectedItem().toString();
        int expectedNoOfBeds = Integer.parseInt(bedsComboBox.getSelectedItem().toString());
        int expectedNoOfBaths = Integer.parseInt(bathsComboBox.getSelectedItem().toString());
        String expectedRoomMates = sharingComboBox.getSelectedItem().toString();
        String expectedRent = rentComboBox.getSelectedItem().toString();
        String publicTransport = transportComboBox.getSelectedItem().toString();
        String expectedAmenities = ammenityComboBox.getSelectedItem().toString();
        String convenienceStore = storeComboBox.getSelectedItem().toString();

        System.out.println("rent " + expectedRent);
        JOptionPane.showMessageDialog(this, "Thank you for taking the survey");
        InquiryForm questionnaire = new InquiryForm(housing, expectedNoOfBeds, expectedNoOfBaths, expectedRoomMates, expectedRent, publicTransport, expectedAmenities, convenienceStore);
        system.getInquiryFormDirectory().addInquiryForm(questionnaire);

    }
}
