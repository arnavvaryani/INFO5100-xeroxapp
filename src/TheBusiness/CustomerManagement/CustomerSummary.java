/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import TheBusiness.OrderManagement.Order;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class CustomerSummary {
    CustomerProfile customer;
    int ordertotal;
    int solutionOrderTotal;
    int customerPricePerformaceSolution;
    int solutionOrdersAboveTarget;
    int solutionOrdersBelowTarget;
    int solutionOrdersAtTarget;

    public CustomerSummary(CustomerProfile cp){
        this.customer = cp;
        this.solutionOrderTotal = customer.getSolutionOrdersTotal();
        this.customerPricePerformaceSolution = customer.getTotalPricePerforamanceSolution();
        this.solutionOrdersAboveTarget = customer.FrequencyOfSolutionOrdersAboveTarget();
        this.solutionOrdersBelowTarget = customer.FrequencyOfSolutionOrdersBelowTarget();
        this.solutionOrdersAtTarget = customer.FrequencyOfSolutionOrdersAtTarget();
    }
    
    public CustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    public int getSolutionOrderTotal() {
        return solutionOrderTotal;
    }

    public int getCustomerPricePerformaceSolution() {
        return customerPricePerformaceSolution;
    }

    public int getFrequencyOfSolutionOrdersAboveTarget() {
        return solutionOrdersAboveTarget;
    }

    public int getSolutionOrdersBelowTarget() {
        return solutionOrdersBelowTarget;
    }

    public int getSolutionOrdersAtTarget() {
        return solutionOrdersAtTarget;
    }
    
}
