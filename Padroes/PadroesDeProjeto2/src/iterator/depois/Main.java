/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.depois;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.imprimirProdutos(new ProdutosCafeteria().createIterator(),
                "PRODUTOS CAFETERIA");
        relatorio.imprimirProdutos(new ProdutosSupermercado().createIterator(),
                "PRODUTOS SUPERMERCADO");
    }
    
}
