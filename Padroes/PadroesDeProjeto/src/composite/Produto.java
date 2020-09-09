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
public class Produto extends ComponentesSetor {
    
    private String descricao;
    private Double preco;
    private String setor;

    public Produto(String descricao, Double preco, String setor) {
        this.descricao = descricao;
        this.preco = preco;
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void print(String separator) {
        System.out.println(separator + " " + descricao);
    }
    
}
