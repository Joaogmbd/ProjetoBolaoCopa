/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

import java.util.Date;

/**
 *
 * @author joaog
 */
public class Rodadas {
    Partida Partidas;
    Date data_limite;

    public Rodadas(Partida Partidas, Date data_limite) {
        this.Partidas = Partidas;
        this.data_limite = data_limite;
    }

    public Partida getPartidas() {
        return Partidas;
    }

    public void setPartidas(Partida Partidas) {
        this.Partidas = Partidas;
    }

    public Date getData_limite() {
        return data_limite;
    }

    public void setData_limite(Date data_limite) {
        this.data_limite = data_limite;
    }
    
    
}
