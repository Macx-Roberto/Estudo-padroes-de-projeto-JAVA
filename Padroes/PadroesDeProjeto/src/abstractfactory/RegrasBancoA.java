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
//public class RegrasBancoA implements RegrasFactory {
public class RegrasBancoA extends RegrasFactory {

    @Override
    public CalculoJuros calcularJuros() {
        return new CalculoJurosBancoA();
    }

    @Override
    public CalculoDescontos calcularDescontos() {
        return new CalculoDescontosBancoA();
    }

    @Override
    public CalculoMultas calcularMultas() {
        return new CalculoMultasBancoA();
    }
    
}
