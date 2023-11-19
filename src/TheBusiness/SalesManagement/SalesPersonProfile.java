/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SalesManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class SalesPersonProfile extends Profile {
    ArrayList<Order> salesorders;
    ArrayList<SolutionOrder> solutionorders;


    public SalesPersonProfile(Person p) {

        super(p); 
        salesorders = new ArrayList();
        solutionorders = new ArrayList();

    }

    public ArrayList<Order> getSalesorders() {
        return salesorders;
    }

    public void setSalesorders(ArrayList<Order> salesorders) {
        this.salesorders = salesorders;
    }

    public ArrayList<SolutionOrder> getSolutionorders() {
        return solutionorders;
    }

    public void setSolutionorders(ArrayList<SolutionOrder> solutionorders) {
        this.solutionorders = solutionorders;
    }
    
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }
    
    public void addSolutionOrder(SolutionOrder so){
        solutionorders.add(so);
    }
    
    public int getTotalSolutionOrdersValue() {
        int sum = 0;
        for (SolutionOrder so: solutionorders) {
            sum += so.getActualPrice();
        }
        return sum;
    }
    
    public int getTotalPricePerformance() {
        int sum = 0;
        for (SolutionOrder so: solutionorders) {
            sum += so.calculatePricePerformance();
        }
        return sum;
    }
    
    public int getFrequencyOfSolutionOrdersAboveTarget() {
        int sum = 0;
        for (SolutionOrder so: solutionorders) {
            if (so.isActualAboveTarget()) {
                sum += 1;
            }
        }
        return sum;
    }
    
    @Override
    public String getRole(){
        return  "Sales";
    }

}
