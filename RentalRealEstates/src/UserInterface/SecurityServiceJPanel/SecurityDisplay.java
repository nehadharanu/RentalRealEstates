/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SecurityServiceJPanel;

import Business.EcoSystem;
import Business.PointOfContact.SecurityService.SecurityService;
import Business.UserAccountManagement.UserAccount;
import Business.UserAccountManagement.UserAccount;
import Business.WorkQueue.EmergencyRequest;
import Business.WorkQueue.EmergencyRequestDirectory;
import Business.WorkQueue.EmergencyRequest;
import Business.WorkQueue.EmergencyRequestDirectory;
//import UserInterface.SysAdmin.MapViewerTwo;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha D
 */
public class SecurityDisplay extends javax.swing.JPanel {

    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;
    String locationCordinate;

    /**
     * Creates new form FireDisplay
     */
    public SecurityDisplay(EcoSystem ecosystem, JPanel userProcessContainer, UserAccount userAcc) {
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        initComponents();
        populate_table();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        respondButton = new javax.swing.JButton();
        closeCase = new javax.swing.JButton();
        falseAlarm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Location", "Status", "Response"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 1020, 420));

        respondButton.setBackground(new java.awt.Color(51, 51, 255));
        respondButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        respondButton.setForeground(new java.awt.Color(255, 255, 255));
        respondButton.setText("Respond");
        respondButton.setBorder(null);
        respondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondButtonActionPerformed(evt);
            }
        });
        jPanel1.add(respondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, 160, 40));

        closeCase.setBackground(new java.awt.Color(51, 51, 255));
        closeCase.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        closeCase.setForeground(new java.awt.Color(255, 255, 255));
        closeCase.setText("Close Case");
        closeCase.setBorder(null);
        closeCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCaseActionPerformed(evt);
            }
        });
        jPanel1.add(closeCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 160, 40));

        falseAlarm.setBackground(new java.awt.Color(255, 55, 95));
        falseAlarm.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        falseAlarm.setForeground(new java.awt.Color(255, 255, 255));
        falseAlarm.setText("False Alarm");
        falseAlarm.setBorder(null);
        falseAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falseAlarmActionPerformed(evt);
            }
        });
        jPanel1.add(falseAlarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 170, 40));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Security emergency details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void falseAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falseAlarmActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int rowId = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            EmergencyRequestDirectory reqEmergencyDir = system.getEmergencyRequestDirectory();
            List<EmergencyRequest> emergencies = reqEmergencyDir.getEmergencyUserList();
            SecurityService a = (SecurityService) userAcc;
            int size = emergencies.size();
            for (int i = 0; i < size; i++) {
                EmergencyRequest emergency = emergencies.get(i);
                if (rowId == emergency.getId()) {
                    locationCordinate = emergency.getLocation();
                    if (emergency.getStatus().matches("Closed")) {
                        JOptionPane.showMessageDialog(null, "Emergency Closed");
                    } else if (emergency.getStatus().matches("False Alarm")) {
                        JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                    } else if (emergency.getResponse().matches("No Response")) {
                        JOptionPane.showMessageDialog(null, "respond to emergency");
                    } else {
                        emergency.setStatus("False Alarm");
                    }

                }

            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Emergency", "Location", "Status", "Response"}));
            populate_table();
        } else {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_falseAlarmActionPerformed

    private void closeCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCaseActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int rowId = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            EmergencyRequestDirectory reqEmergencyDir = system.getEmergencyRequestDirectory();
            List<EmergencyRequest> emergencies = reqEmergencyDir.getEmergencyUserList();
            int size = emergencies.size();
            for (int i = 0; i < size; i++) {
                EmergencyRequest emergency = emergencies.get(i);
                if (rowId == emergency.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (emergency.getStatus().matches("Closed")) {
                        JOptionPane.showMessageDialog(null, "Emergency Closed");
                    } else if (emergency.getStatus().matches("False Alaram")) {
                        JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                    } else if (emergency.getResponse().matches("No Response")) {
                        JOptionPane.showMessageDialog(null, "respond to emergency");
                    } else {
                        emergency.setStatus("Closed");
                    }

                }

            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Emergency", "Location", "Status", "Response"}));
            populate_table();
        } else {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_closeCaseActionPerformed

    private void respondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int rowId = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            EmergencyRequestDirectory reqEmergencyDir = system.getEmergencyRequestDirectory();
            List<EmergencyRequest> emergencies = reqEmergencyDir.getEmergencyUserList();
            int u = emergencies.size();
            SecurityService a = (SecurityService) userAcc;
            for (int i = 0; i < u; i++) {
                EmergencyRequest emergency = emergencies.get(i);
                if (rowId == emergency.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (emergency.getStatus().matches("Closed")) {
                        JOptionPane.showMessageDialog(null, "Emergency Closed");
                    } else if (emergency.getStatus().matches("False Alaram")) {
                        JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                    } else if (emergency.getResponse().matches("No Response")) {
                        emergency.setResponse(a.getSecurityManName()+ " " + "Responded");
                    } else {
                        JOptionPane.showMessageDialog(null, "Already Responded!!");
                    }

                }

            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Emergency", "Location", "Status", "Response"}));
            populate_table();
        } else {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_respondButtonActionPerformed

    private void showMap() {
        DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
            EmergencyRequestDirectory reqEmergencyDirectory = system.getEmergencyRequestDirectory();
            List<EmergencyRequest> reqEmergencyList = reqEmergencyDirectory.getEmergencyUserList();
            int size = reqEmergencyList.size();
            SecurityService police = (SecurityService) userAcc;
            for (int i = 0; i < size; i++) {
                EmergencyRequest emergency = reqEmergencyList.get(i);
                if (rowId == emergency.getId()) {
                    locationCordinate = emergency.getLocation();
                }

            }
            String[] parts = locationCordinate.split(",");
            String lattitude = parts[0].replaceAll("\\s", "");
            String longitude = parts[1].replaceAll("\\s", "");

        }
    }

    public void populate_table() {
        EmergencyRequestDirectory reqEmergencyDir = system.getEmergencyRequestDirectory();
        List<EmergencyRequest> emergencies = reqEmergencyDir.getEmergencyUserList();
        int size = emergencies.size();

        for (int i = 0; i < size; i++) {
            EmergencyRequest emergency = emergencies.get(i);
            if (emergency.getEmergency().matches("Fire")) {

                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                String s1 = String.valueOf(emergency.getId());

                String s[] = {s1, emergency.getName(), emergency.getEmergency(), emergency.getLocation(), emergency.getStatus(), emergency.getResponse()};
                table.addRow(s);

            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeCase;
    private javax.swing.JButton falseAlarm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton respondButton;
    // End of variables declaration//GEN-END:variables
}
