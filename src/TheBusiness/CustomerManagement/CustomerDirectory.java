/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import TheBusiness.Business.Business;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.Personnel.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CustomerDirectory {

    Business business;
    ArrayList<CustomerProfile> customerlist;

    public CustomerDirectory(Business d) {

        business = d;
        customerlist = new ArrayList();

    }

    public CustomerProfile newCustomerProfile(Person p, Channel channel, Market m) {

        CustomerProfile sp = new CustomerProfile(p, channel, m);
        customerlist.add(sp);
        return sp;
    }

    public CustomerProfile findCustomer(String id) {

        for (CustomerProfile sp : customerlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

    public CustomersReport generatCustomerPerformanceReport() {
//        CustomersReport customersreport = new CustomersReport();
//
//        for (CustomerProfile cp : customerlist) {
//
//            CustomerSummary cs = new CustomerSummary(cp);
//            customersreport.addCustomerSummary(cs);
//        }
//        return customersreport;
//    }
        CustomersReport cr = new CustomersReport();
        for (CustomerProfile cp : customerlist) {
            cr.addCustomerSummary(cp);
        }
        return cr;
    }
}
