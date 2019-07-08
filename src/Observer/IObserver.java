/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timotin
 */
package Observer;

import java.util.Map;

public interface IObserver {
    void update(Map<String, Double> stocklist);
}
