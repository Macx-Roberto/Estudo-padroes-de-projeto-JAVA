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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Subject pessoa1 = new PessoaProxy(1);
        Subject pessoa2 = new PessoaProxy(2);
        Subject pessoa3 = new PessoaProxy(3);
        
        
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Nome: " + pessoa3.getNome());
    }
    
}
