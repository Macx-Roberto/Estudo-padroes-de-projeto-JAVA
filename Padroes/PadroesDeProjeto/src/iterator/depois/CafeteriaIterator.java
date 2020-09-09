/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.depois;

import iterator.antes.Produto;

/**
 *
 * @author João Guilherme
 */
public class CafeteriaIterator implements IteratorProduto<Produto> {
    
    private final Produto[] lanches;
    private int index = 0;
    
    public CafeteriaIterator(Produto[] lanches) {
        this.lanches = lanches;
    }

    @Override
    public boolean hasNext() {
        return index < lanches.length;
    }

    @Override
    public Produto next() {
        return lanches[index++];
    }
    
}
