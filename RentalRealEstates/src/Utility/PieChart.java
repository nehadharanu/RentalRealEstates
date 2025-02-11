/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Utility;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
//import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author preranagireesh
 */
public class PieChart extends javax.swing.JPanel {

    /**
     * Creates new form PieChart
     */
    
    private final PieDataset dataset;
    private String title;
    public PieChart( String title, PieDataset dataset ) {
//      super( title );
      this.title = title;
      this.dataset = dataset;
    }
    
    public ChartPanel getChartPanel() {
        return createDemoPanel();
    }
    
   private static JFreeChart createChart( PieDataset dataset, String title ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         title,   
         dataset,          
         true,
         true, 
         false);

      return chart;
   }
   
   private ChartPanel createDemoPanel() {
      JFreeChart chart;  
      chart = createChart(dataset, title);
      return new ChartPanel( chart ); 
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
