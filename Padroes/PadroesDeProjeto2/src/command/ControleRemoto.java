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
public class ControleRemoto {
    
    private static final int NUM_BOTOES = 1;
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;
    
    public ControleRemoto() {
        onCommands = new Command[NUM_BOTOES];
        offCommands = new Command[NUM_BOTOES];
        for (int i=0; i<NUM_BOTOES; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    
    public void setCommand(int indice, Command onCommand, Command offCommand) {
        onCommands[indice] = onCommand;
        offCommands[indice] = offCommand;
    }
    
    public void executeOnCommand(int indice) {
        undoCommand = onCommands[indice];
        undoCommand.execute();
    }
    
    public void executeOffCommand(int indice) {
        undoCommand = offCommands[indice];
        undoCommand.execute();
    }
    
    public void undo() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---- Controle Remoto ----\n");
        for (int i=0; i<NUM_BOTOES; i++) {
            sb.append(String.format("[botão %d] %s\t%s\n", i,
                    onCommands[i].getClass().getSimpleName(),
                    offCommands[i].getClass().getSimpleName()));
        }
        return sb.toString();
    }
    
}
