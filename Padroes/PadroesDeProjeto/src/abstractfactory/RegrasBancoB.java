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
//public class RegrasBancoB implements IntfRegrasFactory {
public class RegrasBancoB extends RegrasFactory {

    @Override
    public CalculoJuros calcularJuros() {
        return new CalculoJurosBancoB();
    }

    @Override
    public CalculoDescontos calcularDescontos() {
        return new CalculoDescontosBancoB();
    }

    @Override
    public CalculoMultas calcularMultas() {
        return new CalculoMultasBancoB();
    }
    
}
