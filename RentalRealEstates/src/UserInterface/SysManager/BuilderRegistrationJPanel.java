/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysManager;

import Business.EcoSystem;
import Business.Builder.Builder;
import Business.Builder.BuilderDirectory;
import static UserInterface.SysManager.AgentRegistrationJPanel.PASSWORD_REGEX;
import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajesh
 */
public class BuilderRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuilderRegistrationJPanel
     */
    EcoSystem system;
    JPanel rightSidePanel;
    List<String> locations = new ArrayList<>();
    List<String> builders = new ArrayList<>();
    int locationCount = 0;
    int buildersCount = 0;
    MapCoordinates locationPoint;

    public static final Pattern EMAIL_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public BuilderRegistrationJPanel(EcoSystem system, JPanel rightSidePanel, MapCoordinates locationPoint) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        //this.locationPoint = locationPoint;
        this.setSize(1160, 750);
        displayTable();
        populateDashBoard();
    }

    private void populateDashBoard() {
       
        Set<String> uniqueLocations = new HashSet<>(locations);
        Set<String> uniqueBuilders = new HashSet<>(builders);

        // get the count of hash sets
        locationCount = uniqueLocations.size();
        buildersCount = uniqueBuilders.size();

        locationLabel.setText(Integer.toString(locationCount));
        jLabel3.setText(Integer.toString(buildersCount));

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
        locationLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listingsTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        userIdTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        locationInputField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pharmaLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        locationLabel.setFont(new java.awt.Font("SF Pro Display", 1, 64)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(51, 51, 255));
        locationLabel.setText("75");
        jPanel2.add(locationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 60));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setText("Locations");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(152, 151, 151));
        jLabel13.setText("Total number of location that are");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 151, 151));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel19.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(152, 151, 151));
        jLabel19.setText("are available in our database");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 240, 190));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "User ID", "Password", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listingsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listingsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listingsTable);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 670, 400));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setBackground(new java.awt.Color(51, 51, 255));
        addButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel7.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 110, 30));

        updateButton.setBackground(new java.awt.Color(51, 51, 255));
        updateButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel7.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 100, 30));

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
        jPanel7.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 100, 30));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, -1));

        nameTextField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 340, 30));

        userIdTextField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 340, 30));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, -1));

        passwordTextField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        jPanel7.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 340, 30));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Email");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, -1));

        emailTextField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 340, 30));

        locationInputField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        locationInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationInputFieldActionPerformed(evt);
            }
        });
        jPanel7.add(locationInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 340, 30));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Location");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 390, 610));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 64)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("11");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 70));

        pharmaLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        pharmaLabel.setText("Builders");
        jPanel8.add(pharmaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(152, 151, 151));
        jLabel17.setText("Total number of builders that");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 151, 151));
        jLabel14.setText("we have under belt");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 230, 190));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (isValidated()) {

            String name = (nameTextField.getText());
            String location = (locationInputField.getText());
            String emailId = (emailTextField.getText());
            String userId = (userIdTextField.getText());
            String pwd = (passwordTextField.getText());

            if (!system.getUserAccDirectory().checkIfUsernameIsUnique(userId)) {
                JOptionPane.showMessageDialog(null, "User name already exists");
                return;
            }

            Builder builder = new Builder(name, location, emailId, userId, pwd);
            system.getUserAccDirectory().addAccount(builder);
            system.getBuilderDirectory().addBuilder(builder);

            displayTable();
            anotherLoad();
            clearFields();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (isValidated()) {
            String username = userIdTextField.getText();
            DefaultTableModel t = (DefaultTableModel) listingsTable.getModel();
            int t1 = listingsTable.getSelectedRow();
            if (t1 >= 0) {
                String userId = (String) t.getValueAt(t1, 2);
                BuilderDirectory builderDirectory = system.getBuilderDirectory();
                List<Builder> bb = builderDirectory.getBuilders();
                int noOfBuilders = bb.size();
                if (!username.matches(userId)) {
                    JOptionPane.showMessageDialog(this, "Cannot Update User ID , it is unique!!");
                    clearFields();
                    return;
                }
                for (int i = 0; i < noOfBuilders; i++) {
                    Builder builder = bb.get(i);
                    if (builder.getBuilderUserID().matches(username)) {

                        builder.setBuilderName(nameTextField.getText());
                        builder.setBuilderLocation(locationInputField.getText());
                        builder.setBuilderUserID(userIdTextField.getText());
                        builder.setBuilderPassword(passwordTextField.getText());
                        builder.setBuilderEmail(emailTextField.getText());
                    }
                }
                displayTable();
                anotherLoad();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void anotherLoad() {
        populateDashBoard();
        BuilderRegistrationJPanel dr = new BuilderRegistrationJPanel(system, rightSidePanel, locationPoint);
        rightSidePanel.add(dr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }


    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        String username = userIdTextField.getText();
        DefaultTableModel t = (DefaultTableModel) listingsTable.getModel();
        int t1 = listingsTable.getSelectedRow();
        if (t1 >= 0) {
            String a = (String) t.getValueAt(t1, 3);
            BuilderDirectory bbd = system.getBuilderDirectory();
            List<Builder> cd1 = bbd.getBuilders();
            int z = cd1.size();
            for (int i = 0; i < z; i++) {
                Builder builder = cd1.get(i);

                if (builder.getBuilderUserID().matches(username)) {
                    bbd.removeBuilder(builder);
                    system.getUserAccDirectory().removeccount(builder);
                    break;
                }
            }
            displayTable();
            anotherLoad();
            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void listingsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listingsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) listingsTable.getModel();
        int selectedRow = listingsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a builder from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            nameTextField.setText(table.getValueAt(selectedRow, 0).toString());
            locationInputField.setText(table.getValueAt(selectedRow, 1).toString());
            userIdTextField.setText(table.getValueAt(selectedRow, 2).toString());
            passwordTextField.setText(table.getValueAt(selectedRow, 3).toString());
            emailTextField.setText(table.getValueAt(selectedRow, 4).toString());

        }

    }//GEN-LAST:event_listingsTableMouseClicked

    private void locationInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationInputFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    public void populateLongituteLatitude(MapCoordinates locationPoint) {
        this.locationPoint = locationPoint;
        locationInputField.setText(locationPoint.getLatitudeCoordinate() + ", " + locationPoint.getLongitudeCoordinate());
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listingsTable;
    private javax.swing.JTextField locationInputField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel pharmaLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userIdTextField;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        BuilderDirectory builderDirectory = system.getBuilderDirectory();
        DefaultTableModel model = (DefaultTableModel) listingsTable.getModel();

        model.setRowCount(0);
        System.out.println("BUILDER DIR:"+builderDirectory);
        System.out.println("BUILDERS :"+builderDirectory.getBuilders());
        for (Builder builder : builderDirectory.getBuilders()) {
            Object[] row = new Object[6];
            row[0] = builder.getBuilderName();
            row[1] = builder.getBuilderLocation();
            row[2] = builder.getBuilderUserID();
            row[3] = builder.getBuilderPassword();
            row[4] = builder.getBuilderEmail();
            locations.add(builder.getBuilderLocation());
            builders.add(builder.getBuilderName());

            model.addRow(row);

        }

    }

    private boolean isValidated() {

        if (null == nameTextField.getText() || nameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter builder name");
            return false;
        }
        if (null == userIdTextField.getText() || userIdTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter User ID");
            return false;
        }
        if (null == locationInputField.getText() || locationInputField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please select location");
            return false;
        }
        if (null == emailTextField.getText() || emailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter email ID");
            return false;
        }
        if (null == passwordTextField.getText() || passwordTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter password");
            return false;
        }
        if (!EMAIL_REGEX.matcher(emailTextField.getText()).matches()) {
            JOptionPane.showMessageDialog(this, "Please enter valid email address");
            emailTextField.setText("");
            return false;
        }

        if (!passwordTextField.getText().matches(PASSWORD_REGEX)) {
            JOptionPane.showMessageDialog(this, "Password is in incorrect Format.\nShould be minimum 8 in length "
                    + "with one upper case, one lower case, one digit and one special character");
            passwordTextField.setText("");
            return false;
        }
        return true;
    }

    private void clearFields() {
        locationInputField.setText("");
        nameTextField.setText("");
        userIdTextField.setText("");
        passwordTextField.setText("");
        emailTextField.setText("");
    }
}
