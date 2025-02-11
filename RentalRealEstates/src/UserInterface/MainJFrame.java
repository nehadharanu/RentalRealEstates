/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.Builder.Builder;
import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.HomeEssentials.HomeEssentials;
import Business.PointOfContact.Medical.Ambulance;
import Business.PointOfContact.SecurityService.SecurityService;
import Business.PointOfContact.Utility.UtilityService;
import Business.RealEstateAgency.RealEstateAgent;
import Business.Surveyor.Surveyor;
import Business.SystemModel;
import Business.User.User;
import java.awt.CardLayout;

/**
 *
 * @author rajesh
 */
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private SystemModel systemModel;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        systemModel = new SystemModel();
        ecoSystem = dB4OUtil.retrieveSystem();
        this.setSize(1920, 1080);
        this.setResizable(false);
        setLoginPage();
        insertDummyData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        workArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    private void setLoginPage() {
        UserLogin wa = new UserLogin(workArea, ecoSystem);
        workArea.add("UserLogin", wa);
        
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    private void insertDummyData() {
  
        RealEstateAgent realEstateAgent1 = new RealEstateAgent("agent", "Pass@123", "Kal", "Low brokerage", 8888888888L, "Boston rental");
        ecoSystem.getUserAccDirectory().addAccount(realEstateAgent1);
        ecoSystem.getRealEstateAgentDirectory().addNewRealEstateAgent(realEstateAgent1);

        RealEstateAgent realEstateAgent2 = new RealEstateAgent("agent2", "Pass@123", "Lee", "Best locality", 8578578576L, "LLRental");
        ecoSystem.getUserAccDirectory().addAccount(realEstateAgent2);
        ecoSystem.getRealEstateAgentDirectory().addNewRealEstateAgent(realEstateAgent2);

        HomeEssentials homeEssentials = new HomeEssentials("Student goods", "California", "home", "Pass@123", 8128471924L);
        ecoSystem.getUserAccDirectory().addAccount(homeEssentials);
        ecoSystem.getHomeEssentialsDirectory().addHomeEssentials(homeEssentials);

        HomeEssentials homeEssentials2 = new HomeEssentials("LetGo", "New York", "home2", "Pass@123", 1982743869L);
        ecoSystem.getUserAccDirectory().addAccount(homeEssentials2);
        ecoSystem.getHomeEssentialsDirectory().addHomeEssentials(homeEssentials2);

        Builder builder = new Builder("DX Max", "Boston", "dxmax@support.com", "build", "Pass@123");
        ecoSystem.getUserAccDirectory().addAccount(builder);
        ecoSystem.getBuilderDirectory().addBuilder(builder);

        Builder builder2 = new Builder("Mission Park", "Cambridge", "support@park.com", "build2", "Pass@123");
        ecoSystem.getUserAccDirectory().addAccount(builder2);
        ecoSystem.getBuilderDirectory().addBuilder(builder2);

        User user = new User("Neha", "Dharanu", "nehadharanu@gmail.com", "9108228384", "neha", "Pass@123", "Boston");
        ecoSystem.getUserAccDirectory().addAccount(user);
        ecoSystem.getUserDirectory().addUser(user);

        User user2 = new User("Eshwar", "Shetty", "eshwar@gmail.com", "8577790214", "eshwar", "Pass@123", "Boston");
        ecoSystem.getUserAccDirectory().addAccount(user2);
        ecoSystem.getUserDirectory().addUser(user2);

        SecurityService securityService = new SecurityService("security", "Pass@123", "Boston", "Rahul", 8646546846L);
        ecoSystem.getUserAccDirectory().addAccount(securityService);
        ecoSystem.getSecurityServiceDirectory().addSecurityService(securityService);

        Ambulance ambulance = new Ambulance("ambu", "Pass@123", "Private medic", "Anthony", 911L);
        ecoSystem.getUserAccDirectory().addAccount(ambulance);
        ecoSystem.getAmbulanceDirectory().addAmbulance(ambulance);

        UtilityService utilityService = new UtilityService("utility", "Pass@123", "Boston", "Rise", 85555L);
        ecoSystem.getUserAccDirectory().addAccount(utilityService);
        ecoSystem.getUtilityServiceDirectory().addNewMaintenance(utilityService);
        
        Surveyor surveyor = new Surveyor("Tommy", "Jason", "surv", "Pass@123", 85555L);
        ecoSystem.getUserAccDirectory().addAccount(surveyor);
        ecoSystem.getSurveyorDirectory().addSurveyor(surveyor);
    }
}
