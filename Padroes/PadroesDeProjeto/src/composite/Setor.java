/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Guilherme
 */
public class Setor extends ComponentesSetor {
    
    private final List<ComponentesSetor> componentes = new ArrayList<>();
    private String descricao;
    
    public Setor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void add(ComponentesSetor componente) {
        componentes.add(componente);
    }

    @Override
    public void remove(ComponentesSetor componente) {
        componentes.remove(componente);
    }

    @Override
    public ComponentesSetor getChild(int i) {
        return componentes.get(i);
    }

    @Override
    public void print(String separator) {
        System.out.println(separator + " " + descricao);
        separator += "-";
        for (ComponentesSetor componente : componentes) {
            componente.print(separator);
        }
    }
    
}
