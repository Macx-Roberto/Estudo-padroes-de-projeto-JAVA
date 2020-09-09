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
public class Main {
    
    public static void exibirInfos(RegrasFactory regras) {
        CalculoJuros juros = regras.calcularJuros();
        CalculoDescontos descontos = regras.calcularDescontos();
        CalculoMultas multas = regras.calcularMultas();
        
        juros.exibirInfoJuros();
        descontos.exibirInfoDescontos();
        multas.exibirInfoMultas();
    }
    
    public static void main(String[] args) {
        RegrasFactory regras = RegrasFactory.criarRegras("A");
        exibirInfos(regras);
        regras = RegrasFactory.criarRegras("B");
        exibirInfos(regras);
    }
    
}
