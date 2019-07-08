/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.stockmarket;

/**
 *
 * @author timotin
 */

import java.util.HashMap;
import java.util.Map;

public abstract  class AbstractMarket extends Subject {
    private Map<String, Double> stocklist = new HashMap<>();

    public Map<String, Double> getStocklist(){
        return stocklist;
    }

}
