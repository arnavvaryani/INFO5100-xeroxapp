/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.SalesManagement;

import java.util.Comparator;

/**
 *
 * @author ashishnevan
 */
public class SalesSummaryComparator implements Comparator<SalesPersonSummary> {

    @Override
    public int compare(SalesPersonSummary o1, SalesPersonSummary o2) {
        if (o1.frequencyOfSolutionOrdersAboveTarget == o1.frequencyOfSolutionOrdersAboveTarget) {
            return 0;
        }
        else if (o1.frequencyOfSolutionOrdersAboveTarget > o1.frequencyOfSolutionOrdersAboveTarget) {
            return 1;
        }
        else {
            return -1;
        }
    }
    
}
