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
public class CalculoMultasBancoA implements CalculoMultas{

    @Override
    public void exibirInfoMultas() {
        System.out.println("Multas Banco A: 2% ao dia");
    }
    
}
