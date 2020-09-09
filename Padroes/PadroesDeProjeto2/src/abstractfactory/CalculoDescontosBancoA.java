/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author João Guilherme
 */
public class CalculoDescontosBancoA implements CalculoDescontos {

    @Override
    public void exibirInfoDescontos() {
        System.out.println("Descontos do Banco A: 9% a vista");
    }
    
}
