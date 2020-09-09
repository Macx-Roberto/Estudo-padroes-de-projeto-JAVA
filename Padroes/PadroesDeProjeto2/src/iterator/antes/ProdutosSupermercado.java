/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.antes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Guilherme
 */
public class ProdutosSupermercado {
    
    private List<Produto> produtos;
    
    public ProdutosSupermercado() {
        produtos = new ArrayList<>();
        addProduto("Alface", 0.5);
        addProduto("Agrião", 1.0);
        addProduto("Laranja", 2.8);
        addProduto("Maça", 2.5);
        addProduto("Tomate", 10.0);
    }
    
    public void addProduto(String descricao, Double preco) {
        produtos.add(new Produto(descricao, preco));
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
}
