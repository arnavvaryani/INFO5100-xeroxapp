/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SolutionOrders;

import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.SalesManagement.SalesPersonProfile;
import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author kal bugrara
 */
public class SolutionOrder {

    SolutionOffer selectedsolutionoffer;
    CustomerProfile customerProfile;
    MarketChannelAssignment marketChannelAssignment;
    SalesPersonProfile salespersonProfile;
    int actualPrice;
    int quantity;
    String id;
    String status = "Submiited";

    public SolutionOrder(CustomerProfile cp, SalesPersonProfile sp, SolutionOffer so, MarketChannelAssignment mca, int paidPrice, int q) {
        this.customerProfile = cp;
        this.salespersonProfile = sp;
        selectedsolutionoffer = so;
        customerProfile.addCustomerSolutionOrder(this);
        salespersonProfile.addSolutionOrder(this);
        marketChannelAssignment = mca;
        this.actualPrice = paidPrice;
        this.quantity = q;
        this.id = generateOrderID();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SolutionOffer getSelectedsolutionoffer() {
        return selectedsolutionoffer;
    }

    public void setSelectedsolutionoffer(SolutionOffer selectedsolutionoffer) {
        this.selectedsolutionoffer = selectedsolutionoffer;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }
    
    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculatePricePerformance() {
        return (actualPrice - this.selectedsolutionoffer.getTargetPrice()) * quantity;
    }

    public boolean isActualAboveTarget() {
        return actualPrice > this.selectedsolutionoffer.getTargetPrice();
    }

    public boolean isActualBelowTarget() {
        return actualPrice < this.selectedsolutionoffer.getTargetPrice();
    }

    public boolean isActualAtTarget() {
        return actualPrice == this.selectedsolutionoffer.getTargetPrice();
    }

    public MarketChannelAssignment getMarketChannelCombo() {

        return marketChannelAssignment;
    }

    public static String generateOrderID() {
        SecureRandom random  = new SecureRandom();
        BigInteger randomValue = new BigInteger(5*5, random);
        String orderID = randomValue.toString(16).substring(0, 5);
        
        return orderID.toUpperCase();
    }
    
    public String toString() {
        return id;
    }

    public void CancelOrder() {
        status = "Cancelled";
    }

    public void Submit() {
        status = "Submitted";
    }
}
