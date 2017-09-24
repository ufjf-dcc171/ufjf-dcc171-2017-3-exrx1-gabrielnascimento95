/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativaula_21_09;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Gabriel_Nascimento
 */
public class Controller extends JFrame{
    private final List<Dados> eventos;
    private final JList<Dados> lstEventos = new JList<>(new DefaultListModel<>());
    private final JButton criarEvento = new JButton("Criar Turma");
    private final JButton editarEvento = new JButton("Editar Turma");
    private final JButton excluirEvento = new JButton("Excluir Turma");
    //private final Controller janelaDados = new Controller();
    
    public Controller(List<Dados> sampleData){
        super("Controle de eventos de raios");
        this.eventos = sampleData;
        lstEventos.setModel(new EventosListModel(eventos));
        add(new JScrollPane(lstEventos), BorderLayout.WEST);
        JPanel botoes = new JPanel(new GridLayout(1,3));
        botoes.add(criarEvento);
        botoes.add(editarEvento);
        botoes.add(excluirEvento);
        add(botoes, BorderLayout.SOUTH);
        
        lstEventos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstEventos.addListSelectionListener(new ListSelectionListener(){
        
        
        @Override
           public void valueChanged(ListSelectionEvent e){        
                Dados selecionada = lstEventos.getSelectedValue();
                if(selecionada != null){
                    System.out.println(selecionada);
                }else{
                    ListModel<Dados> DefaultListModel = null;
                    lstEventos.setModel(new DefaultListModel<>());
                }
           }
        });
        
        criarEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double latitude = Double.parseDouble(JOptionPane.showInputDialog("Latitude: "));
                Double longitude = Double.parseDouble(JOptionPane.showInputDialog("Longitude: "));
                String descricao = JOptionPane.showInputDialog("Descrição: ");
                //Date data = new Date();
                if(!descricao.isEmpty() && descricao != null){
                    Dados t = new Dados(latitude, longitude, descricao);
                    eventos.add(t);
                    lstEventos.updateUI();
                }
            }
        });
        
        excluirEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lstEventos.isSelectionEmpty()){
                    return;
                }else{
                    eventos.remove(lstEventos.getSelectedValue());
                    lstEventos.clearSelection();
                    lstEventos.updateUI();
                }
                
            }
        });
       
    }
}
