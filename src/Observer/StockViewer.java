/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author timotin
 */

import java.util.Iterator;
import java.util.Map;

public class StockViewer implements  IObserver{
    public void update(Map<String, Double> stocklist) {
        System.out.println("StockViewer: stocklist is changed:");
        Iterator iterator = stocklist.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer" + key + " - $" + value);
        }
    }
}
