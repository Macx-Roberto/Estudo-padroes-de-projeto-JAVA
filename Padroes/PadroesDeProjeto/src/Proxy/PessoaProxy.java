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
public class PessoaProxy implements Subject{
    
    private final Integer id;
    private Subject subject;
    
    PessoaProxy(int id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getNome() {
        if (subject == null) {
            subject = PessoaDao.findById(id);
        }
        return subject.getNome();
    }
    
    
}
