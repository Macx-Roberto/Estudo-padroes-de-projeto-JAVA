/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author macxi
 */
public class Pessoa implements Subject{

    private final Integer id;
    private final String nome;

    public Pessoa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }   
    
    @Override
    public Integer getId() {
       return id;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
}
