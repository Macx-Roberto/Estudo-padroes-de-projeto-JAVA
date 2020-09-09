/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.depois;

import singleton.SingletonLog;

/**
 *
 * @author João Guilherme
 */
public class SalarioPorHora implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Salário por hora");
        SingletonLog.getInstance()
                .doLog("Cálculo de salário por hora");
    }
    
}
