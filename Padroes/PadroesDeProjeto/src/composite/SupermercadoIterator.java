/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.List;

/**
 *
 * @author João Guilherme
 */
public class SupermercadoIterator implements IteratorProduto<Produto> {
    
    private List<Produto> produtos;
    private int index = 0;
    
    public SupermercadoIterator(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean hasNext() {
        return index < produtos.size();
    }

    @Override
    public Produto next() {
        return produtos.get(index++);
    }
    
}
