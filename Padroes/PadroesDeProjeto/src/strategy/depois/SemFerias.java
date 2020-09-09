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
public class SemFerias implements Ferias {

    @Override
    public void calcularFerias() {
        System.out.println("Sem férias");
        SingletonLog.getInstance()
                .doLog("Sem cálculo de férias");
    }
    
}
