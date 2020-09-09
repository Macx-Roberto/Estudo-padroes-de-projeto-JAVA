/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.antes;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = dao.buscaPorCpf("99999999999");
        
        FaturaService faturaService = new FaturaService();
        Fatura fatura = faturaService.criarFatura(cliente, 1000.0);
        
        CobrancaService cobrancaService = new CobrancaService();
        cobrancaService.enviarPorEmail(fatura);
    }
    
}
