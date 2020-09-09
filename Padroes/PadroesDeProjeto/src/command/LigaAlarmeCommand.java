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
public class LigaAlarmeCommand implements Command {
    
    public final Alarme alarme;
    
    public LigaAlarmeCommand(Alarme alarme) {
        this.alarme = alarme;
    }

    @Override
    public void execute() {
        alarme.ativar();
    }

    @Override
    public void undo() {
        alarme.desativar();
    }
    
}
