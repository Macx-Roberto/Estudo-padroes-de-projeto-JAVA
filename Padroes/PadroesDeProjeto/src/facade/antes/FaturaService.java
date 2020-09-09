/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.antes;

import java.text.DecimalFormat;

/**
 *
 * @author João Guilherme
 */
public class FaturaService {
    
    public Fatura criarFatura(Cliente cliente, Double valor) {
        System.out.println("Criando fatura no valor de " +
                new DecimalFormat("R$ #,##0.00").format(valor));
        Fatura fatura = new Fatura();
        fatura.setValor(valor);
        fatura.setCliente(cliente);
        return fatura;
    }
    
}
