/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.MarketModel;

import java.util.Comparator;

/**
 *
 * @author ashishnevan
 */
public class SolutionOfferComparator implements Comparator<SolutionOffer>{

    @Override
    public int compare(SolutionOffer o1, SolutionOffer o2) {
        if (o1.getFrequencyAboveTarget() == o2.getFrequencyAboveTarget()) {
            return 0;
        }
        else if (o1.getFrequencyAboveTarget() < o2.getFrequencyAboveTarget()) {
            return 1;
        }
        else {
            return -1;
        }
    }
    
}
