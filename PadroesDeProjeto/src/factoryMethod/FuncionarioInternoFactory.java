/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import strategy.depois.Contratado;
import strategy.depois.Estagiario;
import strategy.depois.Funcionario;
import strategy.depois.Terceirizado;
import strategy.depois.Vendedor;
import strategy.depois.Voluntario;

/**
 *
 * @author macxi
 */
public class FuncionarioInternoFactory extends FuncionarioFactory{

    @Override
    protected Funcionario createFuncionario(String tipo) {
        switch(tipo) {
            case "ESTAGIARIO"   : return new Estagiario();
            case "CONTRATADO"   : return new Contratado();
            case "VENDEDOR"     : return new Vendedor();
            default: return null;
        }
    }
}
