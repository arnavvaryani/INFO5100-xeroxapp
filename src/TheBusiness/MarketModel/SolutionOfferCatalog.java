/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class SolutionOfferCatalog {

    ArrayList<SolutionOffer> solutionoffers;

    public SolutionOfferCatalog() {
        solutionoffers = new ArrayList();
    }
    
    public SolutionOffer newSolutionOffer(MarketChannelAssignment mca, String name){
        
        SolutionOffer so = new SolutionOffer(mca, name);
        solutionoffers.add(so);
//        mca.addSolutionOffer(so);
        
        return so;
    }
    
    public ArrayList<SolutionOffer> goodPerformingSolutionOffers() {
        ArrayList<SolutionOffer> goodPerformingSolutionOffers = new ArrayList<>();
        for (SolutionOffer so: solutionoffers) {
            if (so.getSuggestedPrice() > so.getTargetPrice()) {
                goodPerformingSolutionOffers.add(so);
            }
        }
        return goodPerformingSolutionOffers;
    }
    
    public ArrayList<SolutionOffer> poorPerformingSolutionOffers() {
        ArrayList<SolutionOffer> poorPerformingSolutionOffers = new ArrayList<>();
        for (SolutionOffer so: solutionoffers) {
            if (so.getSuggestedPrice() < so.getTargetPrice()) {
                poorPerformingSolutionOffers.add(so);
            }
        }
        return poorPerformingSolutionOffers;
    }
    

    //return all solution offers that match m/c combination
    public ArrayList<SolutionOffer> findSolutionsForMarketChannelCombo(MarketChannelAssignment mcc) {
        ArrayList<SolutionOffer> foundsolutions = new ArrayList();

        for (SolutionOffer so : solutionoffers) {

            if (so.isSolutionOfferMatchMarketChannel(mcc) == true) {
                foundsolutions.add(so);
            }
            //find all solution offers available in the market/channel combin
        }
        return foundsolutions;

    }

}
