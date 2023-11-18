/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kal bugrara
 */
public class CustomersReport {
    ArrayList<CustomerSummary> summaries;
    
    public CustomersReport(){
        this.summaries = new ArrayList<>();
    }
    
    public CustomerSummary addCustomerSummary(CustomerProfile cp){
        CustomerSummary summary = new CustomerSummary(cp);
        summaries.add(summary);
        return summary;
    }
    
    public ArrayList<CustomerSummary> getSummariesSortedFrequencyAboveTarget() {
        Collections.sort(summaries, new SummaryComparator());
        return summaries;
    }
}
