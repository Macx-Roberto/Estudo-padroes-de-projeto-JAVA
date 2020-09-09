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
public interface IntfRegrasFactory {
    
    CalculoJuros calcularJuros();
    CalculoDescontos calcularDescontos();
    CalculoMultas calcularMultas();
    
}