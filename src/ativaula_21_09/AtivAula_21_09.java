/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativaula_21_09;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel_Nascimento
 */
public class AtivAula_21_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller janela = new Controller(getSampleData());
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setSize(500,250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private static List<Dados> getSampleData(){
        
       Dados d1 = new Dados();
       Dados d2 = new Dados();
       Dados d3 = new Dados();
       
        List<Dados> dados = new ArrayList<>();
     
        
        return dados;
    }
  
}
