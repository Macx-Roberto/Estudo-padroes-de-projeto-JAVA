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
public class OrdemServico {

    public OrdemServico() {
    }
    
    public void abreOs() {
        System.out.println("Documento aberto Ordem Servico");
    }
    
    public void vendeServico() {
        System.out.println("Venda serviço");
    }
    
    public void acertaOs() {
        System.out.println("Ordem serviço paga");
    }
    
    public void fechaOs() {
        System.out.println("Documento fechado Ordem Servico");
    }
}
