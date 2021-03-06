/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentanalytics;

import chart.AttendanceRingChart;
import chart.BarLineChart;
import chart.MaleFemaleRingChart;
import chart.ProportionPieChart;
import chart.SexRatioByMajorBarChart;
import java.awt.BorderLayout;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author paraschhabra
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        PieChartMF.setLayout(new java.awt.BorderLayout());
		        ChartPanel chartPanel = new MaleFemaleRingChart("data/" + FileSelect.selectedFileName).createChart();

//        ChartPanel chartPanel = new MaleFemaleRingChart("data/MOCK_DATA-1.csv").createChart();
        PieChartMF.add(chartPanel,BorderLayout.CENTER);
        PieChartMF.validate();

        pieChart_Country.setLayout(new java.awt.BorderLayout());
        ChartPanel chartPanel1 = new ProportionPieChart("data/" + FileSelect.selectedFileName).createChart();
        pieChart_Country.add(chartPanel1,BorderLayout.CENTER);
        pieChart_Country.validate();
        
        Att_Panel.setLayout(new java.awt.BorderLayout());
        ChartPanel chartPanel2 = new AttendanceRingChart("data/" + FileSelect.selectedFileName).createChart();
        Att_Panel.add(chartPanel2,BorderLayout.CENTER);
        Att_Panel.validate();
        
        Great_Panel.setLayout(new java.awt.BorderLayout());
        ChartPanel chartPanel3 = new BarLineChart("data/" + FileSelect.selectedFileName).createChart();
        Great_Panel.add(chartPanel3,BorderLayout.CENTER);
        Great_Panel.validate();
        
        SexRatio_Panel.setLayout(new java.awt.BorderLayout());
        ChartPanel chartPanel4 = new SexRatioByMajorBarChart("data/" + FileSelect.selectedFileName).createChart();
        SexRatio_Panel.add(chartPanel4,BorderLayout.CENTER);
        SexRatio_Panel.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Great_Panel = new javax.swing.JPanel();
        PieChartMF = new javax.swing.JPanel();
        pieChart_Country = new javax.swing.JPanel();
        Att_Panel = new javax.swing.JPanel();
        SexRatio_Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));

        Great_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        Great_Panel.setMaximumSize(new java.awt.Dimension(525, 278));

        javax.swing.GroupLayout Great_PanelLayout = new javax.swing.GroupLayout(Great_Panel);
        Great_Panel.setLayout(Great_PanelLayout);
        Great_PanelLayout.setHorizontalGroup(
            Great_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Great_PanelLayout.setVerticalGroup(
            Great_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        PieChartMF.setBackground(new java.awt.Color(255, 255, 255));
        PieChartMF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        PieChartMF.setMaximumSize(new java.awt.Dimension(274, 274));
        PieChartMF.setPreferredSize(new java.awt.Dimension(274, 274));

        javax.swing.GroupLayout PieChartMFLayout = new javax.swing.GroupLayout(PieChartMF);
        PieChartMF.setLayout(PieChartMFLayout);
        PieChartMFLayout.setHorizontalGroup(
            PieChartMFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        PieChartMFLayout.setVerticalGroup(
            PieChartMFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pieChart_Country.setBackground(new java.awt.Color(255, 255, 255));
        pieChart_Country.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        pieChart_Country.setMaximumSize(new java.awt.Dimension(274, 274));
        pieChart_Country.setPreferredSize(new java.awt.Dimension(274, 274));

        javax.swing.GroupLayout pieChart_CountryLayout = new javax.swing.GroupLayout(pieChart_Country);
        pieChart_Country.setLayout(pieChart_CountryLayout);
        pieChart_CountryLayout.setHorizontalGroup(
            pieChart_CountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        pieChart_CountryLayout.setVerticalGroup(
            pieChart_CountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Att_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Att_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));
        Att_Panel.setMaximumSize(new java.awt.Dimension(274, 274));
        Att_Panel.setPreferredSize(new java.awt.Dimension(274, 274));

        javax.swing.GroupLayout Att_PanelLayout = new javax.swing.GroupLayout(Att_Panel);
        Att_Panel.setLayout(Att_PanelLayout);
        Att_PanelLayout.setHorizontalGroup(
            Att_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        Att_PanelLayout.setVerticalGroup(
            Att_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SexRatio_PanelLayout = new javax.swing.GroupLayout(SexRatio_Panel);
        SexRatio_Panel.setLayout(SexRatio_PanelLayout);
        SexRatio_PanelLayout.setHorizontalGroup(
            SexRatio_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        SexRatio_PanelLayout.setVerticalGroup(
            SexRatio_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Great_Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PieChartMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pieChart_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Att_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexRatio_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Great_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SexRatio_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PieChartMF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(pieChart_Country, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(Att_Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Att_Panel;
    private javax.swing.JPanel Great_Panel;
    private javax.swing.JPanel PieChartMF;
    private javax.swing.JPanel SexRatio_Panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pieChart_Country;
    // End of variables declaration//GEN-END:variables
}
