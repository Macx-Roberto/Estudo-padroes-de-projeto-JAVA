/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author macxi
 */
public class PoupancaAdapter implements Conta{
    
    
    private final ContaPoupanca contaPoupanca;

    public PoupancaAdapter(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    @Override
    public void mostrarSaldo() {
        contaPoupanca.mostrarValorAcumulado();
    }
    
    
    
    
}
