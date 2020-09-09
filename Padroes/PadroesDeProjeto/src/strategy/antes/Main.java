/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.antes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author João Guilherme
 */
public class Main {
    
    public static void main(String[] args) {
        Funcionario c = new Contratado();
        c.calcularSalario();
        
        Funcionario e = new Estagiario();
        e.calcularSalario();
    }    
    
}
