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
public class DesligaAlarmeCommand implements Command {
    
    private final Alarme alarme;
    
    public DesligaAlarmeCommand(Alarme alarme) {
        this.alarme = alarme;
    }

    @Override
    public void execute() {
        alarme.desativar();
    }

    @Override
    public void undo() {
        alarme.ativar();
    }
    
}
