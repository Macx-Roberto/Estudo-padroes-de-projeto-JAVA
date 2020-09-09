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
public class CalculoDescontosBancosA implements CalculoDescontos{

    @Override
    public void exibirInfoDescontos() {
        System.out.println("Descontos Banco A: 5%");
    }
    
}
