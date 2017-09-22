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
    private Double latitude;
    private Double longitude;
    private String descricao;
    private Date dataEvento;

    public Dados(Double latitude, Double longitude, String descricao) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.descricao = descricao;
    }

    Dados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
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
    
}
