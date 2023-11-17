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
    public SolutionOrder(CustomerProfile cp, SalesPersonProfile sp, SolutionOffer so, MarketChannelAssignment mca, int paidPrice, int q){
        this.customerProfile = cp;
        this.salespersonProfile = sp;
        selectedsolutionoffer = so;
        customerProfile.addCustomerSolutionOrder(this);
        salespersonProfile.addSolutionOrder(this);
        marketChannelAssignment = mca;
        this.actualPrice = paidPrice;
        this.quantity = q;
    }

    public int getActualPrice() {
        return actualPrice;
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
    
    public boolean isActualAboveTarget () {
        return actualPrice > this.selectedsolutionoffer.getTargetPrice();
    }
    
    public boolean isActualBelowTarget () {
        return actualPrice < this.selectedsolutionoffer.getTargetPrice();
    }
    
    public boolean isActualAtTarget () {
        return actualPrice == this.selectedsolutionoffer.getTargetPrice();
    }
    
    public MarketChannelAssignment getMarketChannelCombo(){
        
        return marketChannelAssignment;
                
    }

   
}
