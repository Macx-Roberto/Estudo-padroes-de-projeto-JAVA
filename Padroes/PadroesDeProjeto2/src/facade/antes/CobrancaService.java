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
public class CobrancaService {
    
    public void enviarPorEmail(Fatura fatura) {
        System.out.println("Anexando fatura no valor de " +
                new DecimalFormat("R$ #,##0.00").format(fatura.getValor()));
        System.out.println("Enviando e-mail para " + fatura.getCliente().getEmail());
    }
    
}
