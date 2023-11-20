/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Main.SalesAnalytics;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerSummary;
import TheBusiness.CustomerManagement.CustomersReport;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.SalesManagement.SalesPersonSummary;
import TheBusiness.SalesManagement.SalesPersonsReport;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashishnevan
 */
public class SalesAnalyticsReport extends javax.swing.JPanel {

    /**
     * Creates new form SalesAnalyticsReport
     */
    Business business;
    JPanel CardSequencePanel;

    public SalesAnalyticsReport(Business business, JPanel workarea) {
        initComponents();
        this.business = business;
        this.CardSequencePanel = workarea;
        populateTable1();
        populateTable2();
        populateTable3();
        populateTable4();
        populateTable5overperforming();
        populateTable5underperforming();
    }

    public void populateTable1() {
        for (Map.Entry<Market, ArrayList<SolutionOffer>> entry : business.getMarketChannelComboCatalog().getTop3SolutionsOfEachMarkets().entrySet()) {
            System.out.println("---Market: " + entry.getKey().getName() + "----");
            for (SolutionOffer so : entry.getValue()) {
                Object[] row = new Object[3];
                row[0] = entry.getKey().getName();
                row[1] = so.getName();
                row[2] = so.getFrequencyAboveTarget();
                ((DefaultTableModel) tbl1.getModel()).addRow(row);
                System.out.println("Solution Offer name: " + so.getName() + " Frequency of orders above target: " + so.getFrequencyAboveTarget());
            }
        }
    }

    public void populateTable2() {
        CustomersReport cr = business.getCustomerDirectory().generatCustomerPerformanceReport();
        ArrayList<CustomerSummary> sorted = cr.getSummariesSortedFrequencyAboveTarget();

        for (CustomerSummary cs : sorted) {
            Object[] row = new Object[3];
            row[0] = cs.getCustomer().getCustomerId();
            row[1] = cs.getFrequencyOfSolutionOrdersAboveTarget();
            row[2] = cs.getSolutionOrderTotal();
            ((DefaultTableModel) tbl2.getModel()).addRow(row);
            System.out.println("Customer ID: " + cs.getCustomer().getCustomerId() + " Solution Orders Above Target: " + cs.getFrequencyOfSolutionOrdersAboveTarget());
        }
    }

    public void populateTable3() {
        SalesPersonsReport spr = business.getSalesPersonDirectory().generateSalesPersonsReport();
        ArrayList<SalesPersonSummary> sortedSales = spr.getSummariesSortedByFrequencyAboveTarget();

        for (SalesPersonSummary ss : sortedSales) {
            Object[] row = new Object[3];
            row[0] = ss.getSalesPerson().getPerson().getPersonId();
            row[1] = ss.getFrequencyOfSolutionOrdersAboveTarget();
            row[2] = ss.getTotalSolutionOrdersValue();
            ((DefaultTableModel) tbl3.getModel()).addRow(row);
            System.out.println("SalesPerson ID:" + ss.getSalesPerson().getPerson().getPersonId() + " Solution Orders Above Target: " + ss.getFrequencyOfSolutionOrdersAboveTarget());
        }
    }

    public void populateTable4() {
        Map<Integer, Market> map = business.getMarketChannelComboCatalog().getPricePerformanceOfEachMarkets();

        for (Map.Entry<Integer, Market> entry : map.entrySet()) {
            Object[] row = new Object[2];
            row[0] = entry.getValue().getName();
            row[1] = entry.getKey();
            ((DefaultTableModel) tbl4.getModel()).addRow(row);
            System.out.println("Market Name:" + entry.getValue().getName() + " Revenue: " + entry.getKey());
        }
    }

    public void populateTable5overperforming() {
        System.out.println("overperforming solutionoffers");
        for (SolutionOffer so : business.getSolutionOfferCatalog().goodPerformingSolutionOffers()) {
            Object[] row = new Object[3];
            row[0] = so.getName();
            row[1] = so.getTargetPrice();
            row[2] = so.getSuggestedPrice();
            ((DefaultTableModel) tbl5overperforming.getModel()).addRow(row);
            System.out.println("name: " + so.getName() + " target price: " + so.getTargetPrice() + " suggested price: " + so.getSuggestedPrice());
        }
    }

    public void populateTable5underperforming() {
        System.out.println("underperforming solutionoffers");
        for (SolutionOffer so : business.getSolutionOfferCatalog().poorPerformingSolutionOffers()) {
            Object[] row = new Object[3];
            row[0] = so.getName();
            row[1] = so.getTargetPrice();
            row[2] = so.getSuggestedPrice();
            ((DefaultTableModel) tbl5underperforming.getModel()).addRow(row);
            System.out.println("name: " + so.getName() + " target price: " + so.getTargetPrice() + " suggested price: " + so.getSuggestedPrice());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl5overperforming = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl5underperforming = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Analytics Report");

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person", "Orders Above Target", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl3);
        if (tbl3.getColumnModel().getColumnCount() > 0) {
            tbl3.getColumnModel().getColumn(0).setResizable(false);
            tbl3.getColumnModel().getColumn(1).setResizable(false);
            tbl3.getColumnModel().getColumn(2).setResizable(false);
        }

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Solution Offer", "Sales Above Target"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl1);
        if (tbl1.getColumnModel().getColumnCount() > 0) {
            tbl1.getColumnModel().getColumn(0).setResizable(false);
            tbl1.getColumnModel().getColumn(1).setResizable(false);
            tbl1.getColumnModel().getColumn(2).setResizable(false);
        }

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Orders Above Target", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl2);
        if (tbl2.getColumnModel().getColumnCount() > 0) {
            tbl2.getColumnModel().getColumn(0).setResizable(false);
            tbl2.getColumnModel().getColumn(1).setResizable(false);
            tbl2.getColumnModel().getColumn(2).setResizable(false);
        }

        tbl4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Marginal Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl4);
        if (tbl4.getColumnModel().getColumnCount() > 0) {
            tbl4.getColumnModel().getColumn(0).setResizable(false);
            tbl4.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Top 3 Solutions Broken Down By Markets");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Top 3 Customers");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Marginal Revenue Broken Down By Markets");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Top 3 Sales Persons");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Overperforming Solutions");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Underperforming Solutions");

        tbl5overperforming.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Solution Offer", "Target Price", "Suggested Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbl5overperforming);
        if (tbl5overperforming.getColumnModel().getColumnCount() > 0) {
            tbl5overperforming.getColumnModel().getColumn(0).setResizable(false);
            tbl5overperforming.getColumnModel().getColumn(1).setResizable(false);
            tbl5overperforming.getColumnModel().getColumn(2).setResizable(false);
        }

        tbl5underperforming.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Solution Offer", "Target Price", "Suggested Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbl5underperforming);
        if (tbl5underperforming.getColumnModel().getColumnCount() > 0) {
            tbl5underperforming.getColumnModel().getColumn(0).setResizable(false);
            tbl5underperforming.getColumnModel().getColumn(1).setResizable(false);
            tbl5underperforming.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6)))
                            .addComponent(btnBack))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTable tbl4;
    private javax.swing.JTable tbl5overperforming;
    private javax.swing.JTable tbl5underperforming;
    // End of variables declaration//GEN-END:variables
}
