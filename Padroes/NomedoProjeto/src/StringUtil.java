/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macxi
 */
public class StringUtil implements IStringUtil{

    @Override
    public String ecoar(String str) {
        return str;
    }

    @Override
    public String inverter(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    @Override
    public String inverterPalavra(String str) {
        String aStr[] = str.split(" ");
        str = "";
        for (int i = 0; i < aStr.length; i++) {
            str = str.concat(new StringBuffer(aStr[i]).reverse().toString().concat(" "));
        }
        return str;
    }

    @Override
    public boolean isPalindroma(String str) {
        return str.equals(new StringBuffer(str).reverse().toString());
    }

    @Override
    public boolean isPangram(String str) {
           
        return true;
    }
    
}
