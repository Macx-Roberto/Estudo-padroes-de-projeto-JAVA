/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.util.Observable;
import java.util.Random;

/**
 *
 * @author macxi
 */
public class Time extends Observable implements Runnable{
    
    
    private boolean terminouCorrida;
    private String nome;
    private int contagem;
            
    public Time(String nome) {
        new Thread(this, nome).start();
        this.nome = nome;
    }
    
    public boolean isTerminouCorrida() {
        return terminouCorrida;
    }

    public int getContagem() {
        return contagem;
    }

    public String getNome() {
        return nome;
    }
    
    public void inicializar() {
        terminouCorrida = false;
        run();
    }
    
    

    @Override
    public void run() {
        Random random = new Random();
        for (contagem = 0; contagem < 100; contagem++) {
            setChanged();
            notifyObservers();
            try {
                Thread.sleep(random.nextInt(400));
            } catch (InterruptedException e) {
                System.out.println("Terminou por interrupçao");
                return;
            }           
        }
        terminouCorrida = true;
        setChanged();
        notifyObservers();
    }
    
}
