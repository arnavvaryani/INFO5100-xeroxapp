/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import TheBusiness.SolutionOrders.SolutionOrder;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelAssignment {

    Market market;
    Channel channel;
    int adbudget;
    //int targetrevenue;
    ArrayList<SolutionOffer> solutionofferlist;
    ArrayList<SolutionOrder> solutionorderlist;

    public MarketChannelAssignment(Market m, Channel c) {

        market = m;
        channel = c;
        solutionofferlist = new ArrayList();
        solutionorderlist = new ArrayList();

    }

    public ArrayList<SolutionOffer> getSolutionofferlist() {
        return solutionofferlist;
    }

    public void setSolutionofferlist(ArrayList<SolutionOffer> solutionofferlist) {
        this.solutionofferlist = solutionofferlist;
    }

    public ArrayList<SolutionOrder> getSolutionorderlist() {
        return solutionorderlist;
    }

    public void setSolutionorderlist(ArrayList<SolutionOrder> solutionorderlist) {
        this.solutionorderlist = solutionorderlist;
    }

    public void addSolutionOffer(SolutionOffer soffer) {

        solutionofferlist.add(soffer);

    }

    public void addSolutionOrder(SolutionOrder so) {

        solutionorderlist.add(so);

    }

    public int getMcaPricePerformance() {
        int sum = 0;
        for (SolutionOrder so : solutionorderlist) {
            sum += so.calculatePricePerformance();
        }
        return sum;
    }

    public ArrayList<SolutionOffer> getTop3Solutions() {
        if (solutionofferlist.size() > 3) {
            solutionofferlist.sort(new SolutionOfferComparator());
            solutionofferlist.subList(0, 2);
        }
        return solutionofferlist;
    }

    public boolean matches(Market m, Channel c) {

        if (market == m && channel == c) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMarketMatch(Market m) {

        if (market == m) {
            return true;
        }

        return false;
    }

    public Market getMarket() {
        return market;
    }

    public Channel getChannel() {
        return channel;
    }

    public boolean isChannelMatch(Channel c) {

        if (channel == c) {
            return true;
        }
        return false;
    }
}
