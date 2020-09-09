/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

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
        addProduto("Alface", 0.5, "VERDURAS");
        addProduto("Agrião", 1.0, "VERDURAS");
        addProduto("Laranja", 2.8, "FRUTAS");
        addProduto("Maça", 2.5, "FRUTAS");
        addProduto("Tomate", 10.0, "ORGANICAS");
    }
    
    public void addProduto(String descricao, Double preco, String setor) {
        produtos.add(new Produto(descricao, preco, setor));
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public IteratorProduto<Produto> createIterator() {
        return new SupermercadoIterator(produtos);
    }
    
}
