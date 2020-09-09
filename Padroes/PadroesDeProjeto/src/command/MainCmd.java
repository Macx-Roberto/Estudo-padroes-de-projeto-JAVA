/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author João Guilherme
 */
public class MainCmd {
    
    public static void main(String[] args) {
        Command comandoAtual = new NoCommand();
        for (String comando : args) {
            if ("undo".equals(comando)) {
                System.out.println("Desfazendo...");
                comandoAtual.undo();
            } else {
                comandoAtual = CommandFactory.getCommand(comando);
                comandoAtual.execute();
            }            
        }
    }
    
}
