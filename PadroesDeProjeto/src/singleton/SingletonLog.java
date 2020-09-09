/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 *
 * @author João Guilherme
 */
public class SingletonLog {
    
    private static int contador = 0;
    private static SingletonLog instancia; // objeto com acesso privado
    
    // Construtor privado
    private SingletonLog() {
        // o construtor deve ser criado para suprimir o construtor padrão que é público
        // o contador foi incluído para comprovar que é criada apenas uma instancia
        contador++;
    }
    
    // Retorna a instância única da classe SingletonLog
    public static SingletonLog getInstance() {
        if (instancia == null) {
            instancia = new SingletonLog();
        }
        return instancia;
    }
    
    // Faz o log de eventos da aplicação
    public void doLog(String descricaoEvento) {
        File arquivo = new File("oparacoes.log");
        try (FileWriter fileWriter = new FileWriter(arquivo, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);) {
            printWriter.println(Calendar.getInstance() + " - " +
                    descricaoEvento);
            System.out.println("Número de instâncias (SingletonLog): " + contador);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
