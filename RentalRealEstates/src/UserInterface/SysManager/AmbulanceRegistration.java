/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysManager;

import Business.PointOfContact.Medical.Ambulance;
import Business.EcoSystem;
import Business.PointOfContact.Medical.AmbulanceDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajesh
 */
public class AmbulanceRegistration extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceRegistration
     */
    public AmbulanceRegistration() {
        initComponents();
    }

    EcoSystem system;
    JPanel rightSidePanel;
    Ambulance amb;

    public AmbulanceRegistration(EcoSystem system, JPanel rightSidePanel) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.setSize(1160, 750);
        populateTable();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ambulanceServiceTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        driveNameTxt = new javax.swing.JTextField();
        userIdTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drivers Name", "Ambulance Name", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 710, 520));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setBackground(new java.awt.Color(10, 132, 255));
        addButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel7.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 30));

        updateButton.setBackground(new java.awt.Color(94, 92, 230));
        updateButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel7.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 100, 30));

        deleteButton.setBackground(new java.awt.Color(255, 55, 95));
        deleteButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel7.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 100, 30));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 40));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Driver Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, -1));

        ambulanceServiceTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(ambulanceServiceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, 30));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Ambulance Service Name");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, -1));

        driveNameTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(driveNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 30));

        userIdTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 300, 30));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        passwordTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 300, 30));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, -1));

        phoneTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 300, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 370, 520));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:`
        if (isValidated()) {

            if (system.getUserAccDirectory().checkIfUsernameIsUnique(userIdTxt.getText())) {
                if (!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                    JOptionPane.showMessageDialog(null, " 10 digit phone number");
                    phoneTxt.setText("");
                    return;
                }

                if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
                    JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                            + "with one upper case, one lower case, one digit and one special character");
                    passwordTxt.setText("");
                    return;
                }

                Ambulance customer = new Ambulance(userIdTxt.getText(), passwordTxt.getText(), ambulanceServiceTxt.getText(), driveNameTxt.getText(), Long.parseLong(phoneTxt.getText()));
                system.getUserAccDirectory().addAccount(customer);
                system.getAmbulanceDirectory().addAmbulance(customer);
                populateTable();
                clearFields();

            } else {
                JOptionPane.showMessageDialog(null, "Username " + userIdTxt.getText() + " already exists !!!, Please try a new one");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (isValidated()) {
            String username = userIdTxt.getText();
            DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
            int t1 = jTable1.getSelectedRow();
            if (t1 >= 0) {

                String a = (String) t.getValueAt(t1, 2);
                AmbulanceDirectory directory = system.getAmbulanceDirectory();
                ArrayList<Ambulance> ambulanceLists = directory.getAmbulanceDirectory();
                int z = ambulanceLists.size();

                if (!username.matches(a)) {
                    JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
                    clearFields();
                    return;
                }

                for (int i = 0; i < z; i++) {
                    Ambulance c = ambulanceLists.get(i);
                    c.getUsername();
                    if (c.getUsername().matches(a)) {

                        c.setDriverName(driveNameTxt.getText());
                        c.setAmbulanceServiceName(ambulanceServiceTxt.getText());
                        c.setContactNo(Long.parseLong(phoneTxt.getText()));
                        c.setUsername(userIdTxt.getText());
                        c.setPwd(passwordTxt.getText());

                    }
                    populateTable();
                    clearFields();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a Row!!");
            }
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String username = userIdTxt.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1 = jTable1.getSelectedRow();
        if (t1 >= 0) {
            String a = (String) t.getValueAt(t1, 2);
            System.out.println(a);
            AmbulanceDirectory directory = system.getAmbulanceDirectory();
            ArrayList<Ambulance> lists = directory.getAmbulanceDirectory();
            int length = lists.size();
            for (int i = 0; i < length; i++) {
                Ambulance c = lists.get(i);
                System.out.println(c.getUsername());
                if (c.getUsername().matches(a)) {
                    lists.remove(c);
                    System.out.println("delete");
                    system.getAmbulanceDirectory().removeAmbulance(c);
                    break;
                }
            }
            populateTable();
            clearFields();

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void populateTable() {
        AmbulanceDirectory AmbulanceDir = system.getAmbulanceDirectory();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Ambulance ambulance : AmbulanceDir.getAmbulanceDirectory()) {
            Object[] row = new Object[5];
            row[0] = ambulance.getDriverName();
            row[1] = ambulance.getAmbulanceServiceName();
            row[2] = ambulance.getUsername();
            row[3] = ambulance.getPwd();
            row[4] = ambulance.getContactNo();
            model.addRow(row);

        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a AmbulanceStation from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            driveNameTxt.setText(table.getValueAt(selectedRow, 0).toString());
            ambulanceServiceTxt.setText(table.getValueAt(selectedRow, 1).toString());
            userIdTxt.setText(table.getValueAt(selectedRow, 2).toString());
            passwordTxt.setText(table.getValueAt(selectedRow, 3).toString());
            phoneTxt.setText(table.getValueAt(selectedRow, 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField ambulanceServiceTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField driveNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables

    private boolean isValidated() {

        if (null == driveNameTxt.getText() || driveNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter name");
            return false;
        }

        if (null == ambulanceServiceTxt.getText() || ambulanceServiceTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter correct location");
            return false;
        }
        if (null == userIdTxt.getText() || userIdTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter correct username");
            return false;
        }
        if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
            JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                    + "with one upper case, one lower case, one digit and one special character");
            return false;
        }

        return true;
    }

    public void clearFields() {
        driveNameTxt.setText("");
        phoneTxt.setText("");
        userIdTxt.setText("");
        passwordTxt.setText("");
        ambulanceServiceTxt.setText("");
    }
}
