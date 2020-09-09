/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

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
    
    public void imprimirSetoresSupermercado(IteratorProduto<Produto> iterator) {
        ComponentesSetor setores = new Setor("SETORES SUPERMERCADO");
        ComponentesSetor frutas = new Setor("FRUTAS");
        ComponentesSetor verduras = new Setor("VERDURAS");
        ComponentesSetor organicas = new Setor("ORGANICAS");
        
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            switch (produto.getSetor()) {
                case "FRUTAS":
                    frutas.add(produto);
                    break;
                case "VERDURAS":
                    verduras.add(produto);
                    break;
                case "ORGANICAS":
                    organicas.add(produto);
                    break;
                default:
                    setores.add(produto);
            }
        }
        
        setores.add(frutas);
        setores.add(verduras);
        verduras.add(organicas);
        
        setores.print("-");
    }
    
}
