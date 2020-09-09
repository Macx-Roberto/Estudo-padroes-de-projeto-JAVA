/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import mvc.model.Time;

/**
 *
 * @author macxi
 */
public class ControleCorrida {
    
    
    private final Time time1;
    private final Time time2;
    private String nomeVencedor;

    public ControleCorrida(String nomeTime1, String nomeTime2) {
        this.time1 =  new Time(nomeTime1);
        this.time2 =  new Time(nomeTime1);
        nomeVencedor = null;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public String getNomeVencedor() {
        return nomeVencedor;
    }

    public void setNomeVencedor(String nomeVencedor) {
        this.nomeVencedor = nomeVencedor;
    }
    
    public void iniciarCorrida() {
        time1.inicializar();
        time2.inicializar();
    }
            
    
    
}
