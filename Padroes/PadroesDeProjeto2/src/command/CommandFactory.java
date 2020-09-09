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
public class CommandFactory {
    
    public static Command getCommand(String nome) {
        switch (nome) {
            case "ligar-alarme":
                return new LigaAlarmeCommand(new Alarme());
            case "desligar-alarme":
                return new DesligaAlarmeCommand(new Alarme());
            default:
                return new NoCommand();
        }
    }
    
}
