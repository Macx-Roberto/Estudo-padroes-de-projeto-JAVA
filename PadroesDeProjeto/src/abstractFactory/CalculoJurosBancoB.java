/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author macxi
 */
public class CalculoJurosBancoB implements CalculoJuros {

    @Override
    public void exibirInfoJuros() {
        System.out.println("Juros banco B: 7% ao ano");
    }
    
}
