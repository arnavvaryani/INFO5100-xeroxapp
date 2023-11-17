/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.SalesManagement;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ashishnevan
 */
public class SalesPersonsReport {
    ArrayList<SalesPersonSummary> summaries;
    
    public SalesPersonsReport () {
        summaries = new ArrayList<>();
    }
    
    public SalesPersonSummary addSalesPersonSummary(SalesPersonProfile sp){
        SalesPersonSummary summary = new SalesPersonSummary(sp);
        summaries.add(summary);
        return summary;
    }
    
    public ArrayList<SalesPersonSummary> getSummariesSortedByFrequencyAboveTarget() {
        Collections.sort(summaries, new SalesSummaryComparator());
        return summaries;
    }
}
