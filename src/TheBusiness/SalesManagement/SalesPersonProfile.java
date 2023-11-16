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
    ArrayList<SolutionOrder> solutionsalesorders;


    public SalesPersonProfile(Person p) {

        super(p); 
        salesorders = new ArrayList();
        solutionsalesorders = new ArrayList();

    }
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }
    
    public void addSolutionSalesOrder(SolutionOrder so){
        solutionsalesorders.add(so);
    }
    
    @Override
    public String getRole(){
        return  "Sales";
    }

}
