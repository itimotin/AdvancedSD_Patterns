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

import Observer.IObserver;

public class StockMarket extends AbstractMarket {
    public void addStock(String stockSymbol, Double price) {
        getStocklist().put(stockSymbol, price);
    }

    public void update(String stockSymbol, Double price) {
        getStocklist().put(stockSymbol, price);
        notifyUpdate();
        for (IObserver observer : observers) {
            observer.update(getStocklist());
        }
    }
}

