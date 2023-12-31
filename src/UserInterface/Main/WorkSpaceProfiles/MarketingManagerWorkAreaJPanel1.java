/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.Main.WorkSpaceProfiles;

import TheBusiness.Business.Business;
import UserInterface.Main.SalesAnalytics.SalesAnalyticsReport;
import UserInterface.Main.WorkSpaceProfiles.MarketManagement.ManageChannels;
import UserInterface.Main.WorkSpaceProfiles.MarketManagement.ManageMarkets;
import UserInterface.ManageTheBusiness.ManageTheBusinessJPanel;
import UserInterface.ProductManagement.ManageSuppliersJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class MarketingManagerWorkAreaJPanel1 extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;

    /**
     * Creates new form UnitRiskWorkArea
     */

    public MarketingManagerWorkAreaJPanel1(Business b, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageMarkets = new javax.swing.JButton();
        btnManageChannels = new javax.swing.JButton();
        btnSalesAnalyticsReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));

        btnManageMarkets.setBackground(new java.awt.Color(102, 153, 255));
        btnManageMarkets.setFont(getFont());
        btnManageMarkets.setForeground(new java.awt.Color(255, 255, 255));
        btnManageMarkets.setText("View Markets");
        btnManageMarkets.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageMarkets.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageMarkets.setMinimumSize(new java.awt.Dimension(20, 23));
        btnManageMarkets.setPreferredSize(new java.awt.Dimension(240, 30));
        btnManageMarkets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMarketsIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnManageChannels.setBackground(new java.awt.Color(102, 153, 255));
        btnManageChannels.setFont(getFont());
        btnManageChannels.setForeground(new java.awt.Color(255, 255, 255));
        btnManageChannels.setText("View Channels");
        btnManageChannels.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageChannels.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageChannels.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageChannels.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageChannels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageChannelsActionPerformed(evt);
            }
        });

        btnSalesAnalyticsReport.setBackground(new java.awt.Color(102, 153, 255));
        btnSalesAnalyticsReport.setFont(getFont());
        btnSalesAnalyticsReport.setForeground(new java.awt.Color(255, 255, 255));
        btnSalesAnalyticsReport.setText("Performance Reports");
        btnSalesAnalyticsReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalesAnalyticsReport.setMaximumSize(new java.awt.Dimension(200, 40));
        btnSalesAnalyticsReport.setMinimumSize(new java.awt.Dimension(20, 20));
        btnSalesAnalyticsReport.setPreferredSize(new java.awt.Dimension(240, 25));
        btnSalesAnalyticsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesAnalyticsReportActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Marketing ");

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageMarkets, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnManageChannels, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnSalesAnalyticsReport, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(259, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addComponent(btnLogout))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageMarkets, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageChannels, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalesAnalyticsReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(431, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageMarketsIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMarketsIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:

        ManageMarkets manageMarkets = new ManageMarkets(business, CardSequencePanel);
        CardSequencePanel.add("manageMarkets", manageMarkets);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageMarketsIdentifyResourceAssetsActionPerformed

    private void btnManageChannelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageChannelsActionPerformed
        // TODO add your handling code here:

        ManageChannels manageChannels = new ManageChannels(business, CardSequencePanel);
        CardSequencePanel.add("manageChannels", manageChannels);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageChannelsActionPerformed

    private void btnSalesAnalyticsReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesAnalyticsReportActionPerformed
        // TODO add your handling code here:
        SalesAnalyticsReport SAR = new SalesAnalyticsReport(business, CardSequencePanel);
        CardSequencePanel.add("SalesAnalyticsReport",SAR);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnSalesAnalyticsReportActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageChannels;
    private javax.swing.JButton btnManageMarkets;
    private javax.swing.JButton btnSalesAnalyticsReport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
