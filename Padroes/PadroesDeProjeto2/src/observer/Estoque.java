/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Guilherme
 */
public class Estoque implements Subject {
    
    private final List<ObserverProduto> observers = new ArrayList<>();
    private Double quantidadeEstoque;
    private Produto produto;

    @Override
    public void registerObserver(ObserverProduto observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverProduto observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(produto, quantidadeEstoque));
    }
    
    public void setEstoque(Produto produto, Double quantidadeEstoque) {
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        // notifica os observadores
        notifyObservers();
    }
    
}
