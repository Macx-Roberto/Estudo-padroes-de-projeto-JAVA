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
public class CalculoJurosBancoA implements CalculoJuros {

    @Override
    public void exibirInfoJuros() {
        System.out.println("Juros do Banco A: 8% ao ano");
    }
    
}
