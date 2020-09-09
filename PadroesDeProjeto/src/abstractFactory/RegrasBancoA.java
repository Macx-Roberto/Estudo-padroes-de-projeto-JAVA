/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author macxi
 */
public class RegrasBancoA implements RegrasFactory{

    @Override
    public CalculoJuros getCalculoJuros() {
        return new CalculoJurosBancoA();
    }

    @Override
    public CalculoDescontos getDescontos() {
        return new CalculoDescontosBancosA();
    }

    @Override
    public CalculoMultas getCalculoMultas() {
        return new CalculoMultasBancoA();
    }
    
}
