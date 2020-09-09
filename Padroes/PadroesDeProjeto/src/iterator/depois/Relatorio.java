/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.depois;

import iterator.antes.Produto;
import java.text.DecimalFormat;

/**
 *
 * @author João Guilherme
 */
public class Relatorio {
    
    public void imprimirProdutos(IteratorProduto<Produto> iterator, String descricao) {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        System.out.println("------ " + descricao + " ------");
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println(produto.getDescricao() + ": " +
                    df.format(produto.getPreco()));
        }
    }
    
}
