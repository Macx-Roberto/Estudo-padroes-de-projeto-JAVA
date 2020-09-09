/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.antes;

/**
 *
 * @author João Guilherme
 */
public class Contratado extends Funcionario {

    @Override
    public void calcularSalario() {
        System.out.println("Salário do contratado - Salário Fixo");
    }
    
}
