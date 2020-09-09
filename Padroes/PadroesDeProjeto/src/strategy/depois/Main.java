/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.depois;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        Funcionario c = new Contratado();
        System.out.println("Contratado:");
        c.calcularSalario();
        c.calcularFerias();
        
        Funcionario e = new Estagiario();
        System.out.println("Estagiário:");
        e.calcularSalario();
        e.calcularFerias();
        
        Funcionario v = new Voluntario();
        System.out.println("Voluntário:");
        v.calcularSalario();
        v.calcularFerias();
        
        Funcionario ve = new Vendedor();
        System.out.println("Vendedor:");
        ve.calcularSalario();
        ve.calcularFerias();
        
        Funcionario t = new Terceirizado();
        System.out.println("Terceirizado:");
        t.calcularSalario();
        t.calcularFerias();
    }
    
}
