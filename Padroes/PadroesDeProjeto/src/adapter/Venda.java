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
public class Venda implements Documento {

    @Override
    public Documento abrirDocumento() {
        System.out.println("Documento aberto venda");
        return this;
    }

    @Override
    public Documento venderItem() {
        System.out.println("Vender Item");
        return this;
    }

    @Override
    public Documento fazerPagamento() {
        System.out.println("Pago");
        return this;
    }

    @Override
    public Documento fecharDocumento() {
        System.out.println("Documento fechado venda");
        return this;
    }
    
}
