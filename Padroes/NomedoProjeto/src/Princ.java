/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macxi
 */
public class Princ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IStringUtil str = new StringUtil();
        System.out.println(str.ecoar("banana acida"));
        System.out.println(str.inverter("Invertido"));              
        System.out.println(str.inverterPalavra("CADA PALAVRA INVERTIDA"));
        if (str.isPalindroma("arara")){
            System.out.println("arara é palindroma");
        }
        if (!str.isPalindroma("BANANA")) {
            System.out.println("banana nao e palintona");
        }
        
    }
    
}
