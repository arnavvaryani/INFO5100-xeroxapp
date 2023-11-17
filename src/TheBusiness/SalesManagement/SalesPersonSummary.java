/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.SalesManagement;

/**
 *
 * @author ashishnevan
 */
public class SalesPersonSummary {
    SalesPersonProfile salesPerson;
    int totalPricePerformance;
    int frequencyOfSolutionOrdersAboveTarget;
    int totalSolutionOrdersValue;
    
    public SalesPersonSummary(SalesPersonProfile sp) {
        this.salesPerson = sp;
        totalPricePerformance = sp.getTotalPricePerformance();
        frequencyOfSolutionOrdersAboveTarget = sp.getFrequencyOfSolutionOrdersAboveTarget();
        totalSolutionOrdersValue = sp.getTotalSolutionOrdersValue();
    }

    public SalesPersonProfile getSalesPerson() {
        return salesPerson;
    }

    public int getTotalPricePerformance() {
        return totalPricePerformance;
    }

    public int getFrequencyOfSolutionOrdersAboveTarget() {
        return frequencyOfSolutionOrdersAboveTarget;
    }

    public int getTotalSolutionOrdersValue() {
        return totalSolutionOrdersValue;
    }
    
    
}
