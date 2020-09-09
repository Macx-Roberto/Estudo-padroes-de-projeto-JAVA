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
public class Main {

    public static void main(String[] args) {
        FuncionarioFactory fabrica = new FuncionarioInternoFactory();
        Funcionario estagiario   = fabrica.createFuncionario("ESTAGIARIO");
        Funcionario contratado   = fabrica.fazerPagamento("CONTRATADO");
        Funcionario vendedor     = fabrica.fazerPagamento("VENDEDOR");
        
        fabrica = new FuncionarioExternoFactory();
        Funcionario voluntario   = fabrica.fazerPagamento("VOLUNTARIO");
        Funcionario terceirizado = fabrica.fazerPagamento("TERCEIRIZADO");
    }
}
