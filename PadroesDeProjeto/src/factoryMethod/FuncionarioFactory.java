/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import strategy.depois.Funcionario;

/**
 *
 * @author macxi
 */
public abstract class FuncionarioFactory {
    
    protected abstract Funcionario createFuncionario(String tipo);
    
    public Funcionario fazerPagamento(String tipo) {
        Funcionario funcionario = createFuncionario(tipo);
        funcionario.calcularSalario();
        funcionario.calcularFerias();
        return funcionario;
    }
        
    
}
