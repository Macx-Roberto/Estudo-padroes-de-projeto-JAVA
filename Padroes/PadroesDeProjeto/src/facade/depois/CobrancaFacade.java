/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.depois;

import facade.antes.Cliente;
import facade.antes.ClienteDAO;
import facade.antes.CobrancaService;
import facade.antes.Fatura;
import facade.antes.FaturaService;

/**
 *
 * @author João Guilherme
 */
public class CobrancaFacade {
    
    public Cliente buscaPorCpf(String cpf) {
        return new ClienteDAO().buscaPorCpf(cpf);
    }
    
    public Fatura criarFatura(Cliente cliente, Double valor) {
        return new FaturaService().criarFatura(cliente, valor);
    }
    
    public void realizarCobranca(String cpf, Double valor) {
        Cliente cliente = buscaPorCpf(cpf);
        Fatura fatura = criarFatura(cliente, valor);
        new CobrancaService().enviarPorEmail(fatura);
    }
    
}
