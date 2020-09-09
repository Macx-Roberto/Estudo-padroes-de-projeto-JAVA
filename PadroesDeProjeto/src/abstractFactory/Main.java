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
public class Main {

    public static void exibirInfos(RegrasFactory regras) {
        CalculoJuros juros  = regras.getCalculoJuros();
        CalculoDescontos desc = regras.getDescontos();
        CalculoMultas multas  = regras.getCalculoMultas();
        
        juros.exibirInfoJuros();
        desc.exibirInfoDescontos();
        multas.exibirInfoMultas();
    }
    
    
    public static void main(String[] args) {
        RegrasFactory regras = new RegrasBancoA();
        exibirInfos(regras);
        regras = new RegrasBancoB();
        exibirInfos(regras);
    }
    
}
