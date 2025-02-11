/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SecurityServiceJPanel;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
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
public class SecurityServiceJPanel extends javax.swing.JPanel {
    
    
    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;
    private DB4OUtil dB4OUtil;
    Timer timer;
    
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
    /**
     * Creates new form FireView
     * @param userProcessContainer
     * @param userAcc
     * @param ecosystem
     */
    public SecurityServiceJPanel(JPanel userProcessContainer, UserAccount userAcc,EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        this.dB4OUtil = DB4OUtil.getInstance();
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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        SecurityServicePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel7.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1020, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/RentalMain.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 150));

        SecurityServicePanel.setBackground(new java.awt.Color(255, 255, 255));
        SecurityServicePanel.setPreferredSize(new java.awt.Dimension(100, 48));
        SecurityServicePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SecurityServicePanelMousePressed(evt);
            }
        });
        SecurityServicePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(115, 120, 128));
        jLabel9.setText("Security Service");
        SecurityServicePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/exit.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        SecurityServicePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jPanel9.add(SecurityServicePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 290, 60));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(115, 120, 128));
        jLabel22.setText("Return");
        goBack.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/exit.png"))); // NOI18N
        jLabel11.setText("jLabel9");
        goBack.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, -1));

        jPanel9.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 290, 70));
        jPanel9.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 733, 290, 10));
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 130));

        jLabel10.setText("jLabel9");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 880));

        jPanel14.setBackground(new java.awt.Color(0, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel23.setText("Security Service");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(152, 151, 151));
        jLabel4.setText("Manage everything related to Security Service Enterprises");
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel14.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 190, -1));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1190, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel8.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1190, 780));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 409, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

    private void SecurityServicePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecurityServicePanelMousePressed
        // TODO add your handling code here:
        checkEmergency();
    }//GEN-LAST:event_SecurityServicePanelMousePressed

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed

    private void checkEmergency() {
        
        SecurityServicePanel.setBackground(new Color(213,230,249));

        SecurityDisplay pr=new SecurityDisplay (system, rightSidePanel,userAcc);

        rightSidePanel.add(pr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SecurityServicePanel;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
