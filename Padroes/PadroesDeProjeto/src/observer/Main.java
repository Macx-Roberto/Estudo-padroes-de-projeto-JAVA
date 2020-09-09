/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("------ OBSERVER ------");
        Estoque estoque = new Estoque();
        MonitoraEstoque monitora = new MonitoraEstoque(estoque);
        Produto produto = new Produto("Arroz", 5.0);
        estoque.setEstoque(produto, 4.0);
        estoque.setEstoque(produto, 1.0);
    }
    
}
