/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import strategy.depois.Funcionario;
import strategy.depois.Terceirizado;
import strategy.depois.Voluntario;

/**
 *
 * @author João Guilherme
 */
public class FuncionarioExternoFactory extends FuncionarioFactory {

    @Override
    protected Funcionario createFuncionario(String tipo) {
        switch (tipo) {
            case "VOLUNTARIO":
                return new Voluntario();
            case "TERCEIRIZADO":
                return new Terceirizado();
            default:
                return null;
        }
    }
    
}
