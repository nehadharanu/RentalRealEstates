/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RealEstateAgent;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
//import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author rajesh
 */
public class RealEstateAgentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorView
     */
    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Timer timer;
    //MapCoordinates locationPoint;
    
    private void Time() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date= new Date();
                DateFormat timeFormat =  new SimpleDateFormat("HH:mm a");
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        timer = new Timer(100, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    public RealEstateAgentJPanel(JPanel userProcessContainer, UserAccount userAcc, EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        Time();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Appointments = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        appointments = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        requestHomeEssentials = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(250, 249, 251));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appointments.setBackground(new java.awt.Color(0, 204, 204));
        Appointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Appointments.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        Appointments.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(115, 120, 128));
        jLabel32.setText("Return");
        goBack.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/exit.png"))); // NOI18N
        goBack.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        Appointments.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 290, 60));

        appointments.setBackground(new java.awt.Color(255, 255, 255));
        appointments.setPreferredSize(new java.awt.Dimension(100, 48));
        appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appointmentsMousePressed(evt);
            }
        });
        appointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(115, 120, 128));
        jLabel7.setText("Manage Appointments");
        appointments.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/managelisting30.png"))); // NOI18N
        appointments.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Appointments.add(appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 60));

        requestHomeEssentials.setBackground(new java.awt.Color(255, 255, 255));
        requestHomeEssentials.setPreferredSize(new java.awt.Dimension(100, 48));
        requestHomeEssentials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestHomeEssentialsMousePressed(evt);
            }
        });
        requestHomeEssentials.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 120, 128));
        jLabel6.setText("Request Home Essentials");
        requestHomeEssentials.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 210, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/marketlogo.png"))); // NOI18N
        requestHomeEssentials.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        Appointments.add(requestHomeEssentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 290, 60));
        Appointments.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 733, 290, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/RentalMain.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Appointments.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));

        jPanel3.add(Appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 880));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("Agent Dashboard");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 470, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("Manage everything related to Agent Enterprises");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 190, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1230, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel3.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1630, 990));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed

    private void requestHomeEssentialsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestHomeEssentialsMousePressed
        // TODO add your handling code here:
        requestHomeEssentials();
    }//GEN-LAST:event_requestHomeEssentialsMousePressed

    private void appointmentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsMousePressed
        // TODO add your handling code here:
        appointments();
    }//GEN-LAST:event_appointmentsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appointments;
    private javax.swing.JPanel appointments;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel requestHomeEssentials;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

     private void requestHomeEssentials() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        appointments.setBackground(new Color(255, 255, 255));
        requestHomeEssentials.setBackground(new Color(213, 230, 249));

        RequestHomeEssentialsPanel reqBlood = new RequestHomeEssentialsPanel(container, system, userAcc);

        rightSidePanel.add(reqBlood);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }

    private void appointments() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        requestHomeEssentials.setBackground(new Color(255, 255, 255));
        appointments.setBackground(new Color(213, 230, 249));

        ManageAppointment manageApp = new ManageAppointment(rightSidePanel, system, userAcc);

        rightSidePanel.add(manageApp);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }
}
