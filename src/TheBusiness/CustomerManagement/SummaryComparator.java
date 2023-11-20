/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.CustomerManagement;

import java.util.Comparator;

/**
 *
 * @author ashishnevan
 */
public class SummaryComparator implements Comparator<CustomerSummary> {

    @Override
    public int compare(CustomerSummary o1, CustomerSummary o2) {
        if (o1.getFrequencyOfSolutionOrdersAboveTarget() == o2.getFrequencyOfSolutionOrdersAboveTarget()) 
            return 0; 
        else if (o1.getFrequencyOfSolutionOrdersAboveTarget() < o2.getFrequencyOfSolutionOrdersAboveTarget()) 
            return 1; 
        else
            return -1;
    }
    
}
