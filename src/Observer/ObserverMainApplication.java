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

import Observer.IObserver;
import Observer.StockBuyer;
import Observer.StockViewer;
import Observer.stockmarket.StockMarket;

public class ObserverMainApplication {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        IObserver stockBuyer = new StockBuyer();
        IObserver stockViewer = new StockViewer();

        stockMarket.attach(stockBuyer);
        stockMarket.attach(stockViewer);

        stockMarket.addStock("ORC", 12.23);
        stockMarket.addStock("MSC", 45.78);

        stockMarket.update("ORC", 12.34);
        stockMarket.update("MSC", 44.68);
    }
}
