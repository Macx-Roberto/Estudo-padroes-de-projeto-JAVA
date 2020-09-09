/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.antes;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        Produto[] lanches = new ProdutosCafeteria().getProdutos();
        List<Produto> produtos = new ProdutosSupermercado().getProdutos();
        
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        System.out.println("------ PRODUTOS CAFETERIA ------");
        for (int i = 0; i < lanches.length; i++) {
            System.out.println(lanches[i].getDescricao() + ": " +
                    df.format(lanches[i].getPreco()));
        }
        
        System.out.println("------ PRODUTOS SUPERMERCADO ------");
        for (Produto produto : produtos) {
            System.out.println(produto.getDescricao() + ": " +
                    df.format(produto.getPreco()));
        }
    }
    
}
