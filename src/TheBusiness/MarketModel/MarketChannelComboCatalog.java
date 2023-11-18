/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelComboCatalog {

    private ArrayList<Market> markets;
    private ArrayList<Channel> channels;
    ArrayList<MarketChannelAssignment> mcalist;

    public MarketChannelComboCatalog() {

        mcalist = new ArrayList();
        markets = new ArrayList();
        channels = new ArrayList();
    }

    public MarketChannelAssignment newMarketChannelCombo(Market m, Channel c) {
        MarketChannelAssignment mcc = new MarketChannelAssignment(m, c);
        mcalist.add(mcc);
        if (!markets.contains(m)) {
            markets.add(m);
        }
        if (!channels.contains(c)) {
            channels.add(c);
        }
        return mcc;

    }

    public MarketChannelAssignment findMarketChannelCombo(Market m, Channel c) {

        for (MarketChannelAssignment mca : mcalist) {
            if (mca.matches(m, c)) {
                return mca;
            }
        }
        return null;

    }
    
    public int getPricePerformanceByMarket(Market m) {
        int sum = 0;
        for (MarketChannelAssignment mca: mcalist) {
            if (mca.isMarketMatch(m)) {
                sum += mca.getMcaPricePerformance();
            }
        }
        return sum;
    }
    
    
    public int getPricePerformanceByChannel(Channel c) {
        int sum = 0;
        for (MarketChannelAssignment mca: mcalist) {
            if (mca.isChannelMatch(c)) {
                sum += mca.getMcaPricePerformance();
            }
        }
        return sum;
    }
    
    public Map<Integer,Market> getPricePerformanceOfEachMarkets() {
        int sum = 0;
        TreeMap<Integer, Market> MarketsAndPricePerformances = new TreeMap<>();
        for (Market m: markets) {
            MarketsAndPricePerformances.put(getPricePerformanceByMarket(m), m);
        }
        return MarketsAndPricePerformances.descendingMap();
    }
    
}
