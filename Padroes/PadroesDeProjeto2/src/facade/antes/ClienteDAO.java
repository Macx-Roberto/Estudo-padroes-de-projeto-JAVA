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
public class ClienteDAO {
    
    public Cliente buscaPorCpf(String cpf) {
        System.out.println("Buscando cliente com cpf " + cpf);
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setEmail("email@email.com");
        return cliente;
    }
    
}
