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
public abstract class RegrasFactory {
    
    public abstract CalculoJuros calcularJuros();
    public abstract CalculoDescontos calcularDescontos();
    public abstract CalculoMultas calcularMultas();
    
    public static RegrasFactory criarRegras(String tipo) {
        switch (tipo) {
           case "A": return new RegrasBancoA();
           case "B": return new RegrasBancoB();
        }
        return null;
    }
    
}
