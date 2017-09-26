/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativaula_21_09;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel_Nascimento
 */
public class Dados {
    private String latitude;
    private String longitude;
    private String descricao;
    private Date dataEvento;

    public Dados(String latitude, String longitude, String descricao) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.descricao = descricao;
    }

    Dados() {
       this.latitude = null;
       this.longitude = null;
       this.descricao = null;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
    
}
