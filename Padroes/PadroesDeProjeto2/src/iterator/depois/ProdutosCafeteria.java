/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.depois;

import iterator.antes.*;

/**
 *
 * @author João Guilherme
 */
public class ProdutosCafeteria {
    
    private static final int TAMANHO_MAXIMO = 5;
    private int index = 0;
    private Produto[] lanches;
    
    public ProdutosCafeteria() {
        lanches = new Produto[TAMANHO_MAXIMO];
        addProduto("Café", 0.5);
        addProduto("Bauru", 1.0);
        addProduto("Pão de Queijo", 4.8);
        addProduto("Pastel", 2.5);
        addProduto("Bolo", 12.4);
    }
    
    public void addProduto(String descricao, Double preco) {
        if (index < TAMANHO_MAXIMO) {
            Produto produto = new Produto(descricao, preco);
            lanches[index++] = produto;
        }
    }
    
    public Produto[] getProdutos() {
        return lanches;
    }
    
    public IteratorProduto<Produto> createIterator() {
        return new CafeteriaIterator(lanches);
    }
    
}
