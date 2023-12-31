/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import TheBusiness.MarketModel.Channel;
import java.util.ArrayList;
import TheBusiness.MarketModel.Market;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class CustomerProfile extends Profile {

    ArrayList<Order> orders;
    Market market;
    ArrayList<SolutionOrder> solutionOrders;
    Person person;
    Channel channel;

    public CustomerProfile(Person p, Channel channel, Market market) {
        super(p);
        person = p;
        orders = new ArrayList();
        solutionOrders = new ArrayList();
        this.channel = channel;
        this.market = market;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public int getTotalPricePerformance() {

        //for each order in the customer orderlist 
        //calculate order price performance and add it to the sum
        int sum = 0;
        for (Order o : orders) {
            sum += o.getOrderPricePerformance();
        }
        return sum;
    }

    public int getTotalPricePerforamanceSolution() {
        int sum = 0;
        for (SolutionOrder so : solutionOrders) {
//            sum += so.getOrderPricePerformance();
        }
        return sum;
    }

    public int getNumberOfOrdersAboveTotalTarget() {
        //for each order in the customer order list 
        //calculate if order is positive (actual order total is greater than sum of item targets
        //if yes then add 1 to total 
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int getNumberOfOrdersBelowTotalTarget() {
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == false) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int FrequencyOfSolutionOrdersAboveTarget() {
        //for each order in the customer order list 
        //calculate if order is positive (actual order total is greater than sum of item targets
        //if yes then add 1 to total 
        int sum = 0;
        for (SolutionOrder so : solutionOrders) {
            if (so.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int FrequencyOfSolutionOrdersBelowTarget() {
        int sum = 0;
        for (SolutionOrder so : solutionOrders) {
            if (so.isActualBelowTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int FrequencyOfSolutionOrdersAtTarget() {
        int sum = 0;
        for (SolutionOrder so : solutionOrders) {
            if (so.isActualAtTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }
    //for each order in the customer order list 
    //calculate if order is negative
    //if yes then add 1 to total 

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order o) {
        orders.add(o);
    }

    public void addCustomerSolutionOrder(SolutionOrder so) {
        solutionOrders.add(so);
    }

    public int getSolutionOrdersTotal() {
        int sum = 0;
        for (SolutionOrder so : solutionOrders) {
            sum += so.getActualPrice();
        }
        return sum;
    }

    public String getCustomerId() {
        return person.getPersonId();
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String getRole() {
//        return "Sales";
        return "Customer";
    }

    @Override
    public String toString() {
        return person.getPersonId();
    }
}
