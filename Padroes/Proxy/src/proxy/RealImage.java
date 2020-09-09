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
public class RealImage implements Image{
    
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void Display() {
        System.out.println("Exibindo arquivo: " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Carregando arquivo: " + filename);
    }
    
}
