/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author João Guilherme
 */
public interface Subject {
    
    void registerObserver(ObserverProduto observer);
    void removeObserver(ObserverProduto observer);
    void notifyObservers();
    
}
