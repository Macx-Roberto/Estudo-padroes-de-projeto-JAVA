/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author macxi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Image icon = new ProxyImage("icon.png");
        Image logo = new ProxyImage("logo.png");
        Image fundo = new ProxyImage("Fundo.jpeg");
        
        icon.Display();
        logo.Display();
        fundo.Display();
        logo.Display();
        
        
        
        
    }
    
}
