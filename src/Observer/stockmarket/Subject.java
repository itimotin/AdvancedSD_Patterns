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

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void dettach(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyUpdate() {
        System.out.println("Notify Update");
    }
}

