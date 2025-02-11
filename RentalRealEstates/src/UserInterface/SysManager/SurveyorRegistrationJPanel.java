/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysManager;

import Business.EcoSystem;
import Business.Surveyor.Surveyor;
import Business.Surveyor.SurveyorDirectory;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha D
 */
public class SurveyorRegistrationJPanel extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem system;

    /**
     * Creates new form SurveyorRegistration
     */
    public SurveyorRegistrationJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
//        this.setSize(619,600);
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
        addbtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        userIdTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Manage Appointments");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "User ID", "Password", "Phone Number"
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

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 700, 550));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbtn.setBackground(new java.awt.Color(10, 132, 255));
        addbtn.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.setBorder(null);
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel7.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 110, 30));

        updateBtn.setBackground(new java.awt.Color(94, 92, 230));
        updateBtn.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(null);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel7.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 100, 30));

        deleteBtn.setBackground(new java.awt.Color(255, 55, 95));
        deleteBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(null);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel7.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 90, 30));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 40));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("First Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        lastNameTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 30));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Last Name");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        firstNameTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 30));

        userIdTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 310, 30));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        passwordTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, 30));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        phoneTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 310, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 380, 550));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
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

                Surveyor surveyor = new Surveyor(firstNameTxt.getText(), lastNameTxt.getText(), userIdTxt.getText(), passwordTxt.getText(), Long.parseLong(phoneTxt.getText()));
                system.getUserAccDirectory().addAccount(surveyor);
                system.getSurveyorDirectory().addSurveyor(surveyor);
                populateTable();
                clearFields();

            } else {
                JOptionPane.showMessageDialog(null, "Username " + userIdTxt.getText() + " already exists !!!, Please try a new one");
            }
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void populateTable() {
        SurveyorDirectory cdcDir = system.getSurveyorDirectory();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Surveyor customer : cdcDir.getSurveyorList()) {
            Object[] row = new Object[5];
            row[0] = customer.getFirstName();
            row[1] = customer.getLastName();
            row[2] = customer.getUserID();
            row[3] = customer.getUserPassword();
            row[4] = customer.getPhoneNumber();

            model.addRow(row);

        }

    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if (isValidated()) {
            String username = userIdTxt.getText();
            DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
            int t1 = jTable1.getSelectedRow();
            if (t1 >= 0) {

                {
                    String a = (String) t.getValueAt(t1, 2);
                    SurveyorDirectory surveyorDir = system.getSurveyorDirectory();
                    List<Surveyor> surveyorList = surveyorDir.getSurveyorList();
                    int z = surveyorList.size();
                    if (!username.matches(a)) {
                        JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
                        clearFields();
                        return;
                    }
                    for (int i = 0; i < z; i++) {
                        Surveyor c = surveyorList.get(i);
                        c.getUserID();
                        if (c.getUserID().matches(a)) {

                            c.setFirstName(firstNameTxt.getText());
                            c.setLastName(lastNameTxt.getText());
                            c.setPhoneNumber(Long.parseLong(phoneTxt.getText()));
                            c.setUserID(userIdTxt.getText());
                            c.setUserPassword(passwordTxt.getText());
                        }
                    }
                    populateTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a Row!!");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String username = userIdTxt.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1 = jTable1.getSelectedRow();
        if (t1 >= 0) {
            String userId = (String) t.getValueAt(t1, 2); // Assuming User ID is in column 2
            System.out.println("Deleting Surveyor with User ID: " + userId);

            String a = (String) t.getValueAt(t1, 3);
            System.out.println(a);
            SurveyorDirectory directory = system.getSurveyorDirectory();
            List<Surveyor> surveyList = directory.getSurveyorList();
            boolean removed = false;
            int z = surveyList.size();

            for (Surveyor surveyor : new ArrayList<>(surveyList)) { // Avoid ConcurrentModificationException
                if (surveyor.getUserID().equals(userId)) {
                    directory.removeSurveyor(surveyor);
                    removed = true;
                    break;
                }
            }

            if (removed) {
                System.out.println("deleted");
                populateTable();
                jTable1.repaint(); 
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "surveyor not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Official from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            firstNameTxt.setText(table.getValueAt(selectedRow, 0).toString());
            lastNameTxt.setText(table.getValueAt(selectedRow, 1).toString());
            userIdTxt.setText(table.getValueAt(selectedRow, 2).toString());
            passwordTxt.setText(table.getValueAt(selectedRow, 3).toString());
            phoneTxt.setText(table.getValueAt(selectedRow, 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField firstNameTxt;
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
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables

    public boolean isValidated() {
        if (null == firstNameTxt.getText() || firstNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter name");
            return false;
        }
        if (null == lastNameTxt.getText() || lastNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter name");
            return false;
        }
        if (null == userIdTxt.getText() || userIdTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter name");
            return false;
        }
        if (!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
            JOptionPane.showMessageDialog(null, "please enter 10 digit phone number");
            phoneTxt.setText("");
            return false;
        }
        if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
            JOptionPane.showMessageDialog(null, "Password is in incorrect Format.\nShould be minimum 8 in length "
                    + "with one upper case, one lower case, one digit and one special character");
            passwordTxt.setText("");
            return false;
        }
        return true;
    }

    public void clearFields() {
        firstNameTxt.setText("");
        lastNameTxt.setText("");
        phoneTxt.setText("");
        userIdTxt.setText("");
        passwordTxt.setText("");
    }

}
