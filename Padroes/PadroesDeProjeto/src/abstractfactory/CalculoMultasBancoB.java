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
public class CalculoMultasBancoB implements CalculoMultas {

    @Override
    public void exibirInfoMultas() {
        System.out.println("Multas do Banco B: 4% ao dia");
    }
    
}
