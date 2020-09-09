/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import strategy.depois.Contratado;
import strategy.depois.Estagiario;
import strategy.depois.Funcionario;
import strategy.depois.Vendedor;

/**
 *
 * @author João Guilherme
 */
public class FuncionarioInternoFactory extends FuncionarioFactory {

    @Override
    protected Funcionario createFuncionario(String tipo) {
        switch (tipo) {
            case "ESTAGIARIO":
                return new Estagiario();
            case "CONTRATADO":
                return new Contratado();
            case "VENDEDOR":
                return new Vendedor();
            default:
                return null;
        }
    }
    
}
