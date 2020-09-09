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
public class AdapterOs implements Documento{
    
    private final OrdemServico ordem;

    public AdapterOs(OrdemServico ordem) {
        this.ordem = ordem;
    }
       

    @Override
    public Documento abrirDocumento() {
        ordem.abreOs();
        return this;
    }

    @Override
    public Documento venderItem() {
        ordem.vendeServico();
        return this;
    }

    @Override
    public Documento fazerPagamento() {
        ordem.acertaOs();
        return this;
    }

    @Override
    public Documento fecharDocumento() {
        ordem.fechaOs();
        return this;
    }
    
    
    
}
