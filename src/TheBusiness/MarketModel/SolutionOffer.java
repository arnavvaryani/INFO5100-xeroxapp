/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;
import TheBusiness.ProductManagement.Product;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class SolutionOffer {
    String name;
    ArrayList<Product> products;
    int targetPrice, floorPrice, ceilingPrice, suggestedPrice;//floor, ceiling, and target ideas
    String ad;
    MarketChannelAssignment marketchannelcomb;
    ArrayList<SolutionOrder> solutionorders;
    
    
    public SolutionOffer(MarketChannelAssignment m, String name){
        this.name = name;
        marketchannelcomb = m;
        products = new ArrayList();
        solutionorders = new ArrayList();
        m.addSolutionOffer(this); 
        calcFTCprices();
        suggestedPrice = targetPrice;
    } 
    
    private void calcFTCprices () {
        int f = 0,t = 0,c = 0;
        for (Product p : products) {
            f += p.getFloorPrice();
            t += p.getTargetPrice();
            c += p.getCeilingPrice();
        }
        targetPrice = t;
        floorPrice = f;
        ceilingPrice = c;
    }
    
    public void addProduct(Product p){
        products.add(p);
        calcFTCprices();
    }
//    public void setTotalPrice(int p){
//        price = p;
//        
//    }
//    public int getSolutionPrice(){
//        return price;
//    }

    public String getName() {
        return name;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }
    
    
    public int getRevenues(){
        int sum = 0;
        for(SolutionOrder so: solutionorders){
            sum = sum + so.getActualPrice();
        }
        return sum;
    }
    
    public int getSolutionOfferPricePerformance () {
//    calc priceperformance of all solutionorders placed of this solutionoffer
        int sum = 0;
        for (SolutionOrder so: solutionorders) {
            sum += so.calculatePricePerformance();
        }
        return sum;
    }
    
    public int getFrequencyAboveTarget() {
        int sum = 0;
        for(SolutionOrder so: solutionorders){
            if ( so.isActualAboveTarget() ){
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    public int getFrequencyBelowTarget() {
        int sum = 0;
        for(SolutionOrder so: solutionorders){
            if ( so.isActualBelowTarget() ){
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    public void addSolutionOrder(SolutionOrder so){
        solutionorders.add(so);
        suggestedPrice = calculateSuggestedPrice();
    }
    
    public int calculateSuggestedPrice() {
        int averagePerformance = Math.floorDiv(getSolutionOfferPricePerformance(), solutionorders.size());
        this.suggestedPrice = targetPrice + averagePerformance;
        return suggestedPrice;
    }
    // this will allow one to retrieve all offers meant for this market/channel combo
    public boolean isSolutionOfferMatchMarketChannel(MarketChannelAssignment mca){
        
        if (marketchannelcomb==mca) return true;
        else return false;
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String a){ //this an amazing solution for people like
        ad = a;
    }

    public int getSuggestedPrice() {
        return suggestedPrice;
    }
    
    
}
