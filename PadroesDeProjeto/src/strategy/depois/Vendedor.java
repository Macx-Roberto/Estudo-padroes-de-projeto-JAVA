/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.depois;

/**
 *
 * @author João Guilherme
 */
public class Vendedor extends Funcionario {
    
    public Vendedor() {
        salario = new SalarioPorComissao();
        ferias = new ComFerias();
    }
    
}
