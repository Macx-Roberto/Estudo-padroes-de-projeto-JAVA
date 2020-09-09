/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author macxi
 */
public class ContaSalario implements Conta {

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo conta salario");
    }
    
    
}
