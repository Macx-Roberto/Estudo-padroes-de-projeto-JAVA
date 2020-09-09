/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.depois;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        new CobrancaFacade().realizarCobranca("99999999999", 1000.0);
    }
    
}
