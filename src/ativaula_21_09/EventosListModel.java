/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativaula_21_09;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
/**
 *
 * @author Gabriel_Nascimento
 */
public class EventosListModel implements ListModel<Dados>{
    private final List<Dados> dados;
    private final List<ListDataListener> dataListeners;

    public EventosListModel(List<Dados> dados) {
        this.dados = dados;
        this.dataListeners = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return dados.size();
    }

    @Override
    public Dados getElementAt(int index) {
        return dados.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
         this.dataListeners.remove(l);
    }
    
    
}
