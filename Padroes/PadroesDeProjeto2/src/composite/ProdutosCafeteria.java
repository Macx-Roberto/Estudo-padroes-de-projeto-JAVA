/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

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
        addProduto("Café", 0.5, "BEBIDAS");
        addProduto("Bauru", 1.0, "SALGADOS");
        addProduto("Pão de Queijo", 4.8, "SALGADOS");
        addProduto("Pastel", 2.5, "SALGADOS");
        addProduto("Bolo", 12.4, "DOCES");
    }
    
    public void addProduto(String descricao, Double preco, String setor) {
        if (index < TAMANHO_MAXIMO) {
            Produto produto = new Produto(descricao, preco, setor);
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
