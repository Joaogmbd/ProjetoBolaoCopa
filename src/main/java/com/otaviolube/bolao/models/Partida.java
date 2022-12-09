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
public class Partida {
    Selecao Mandante;
    int gols_visitante;
    int gols_mandante;
    Date tempo;
    Selecao Visitante;

    public Partida(Selecao Mandante, int gols_visitante, int gols_mandante, Date tempo, Selecao Visitante) {
        this.Mandante = Mandante;
        this.gols_visitante = gols_visitante;
        this.gols_mandante = gols_mandante;
        this.tempo = tempo;
        this.Visitante = Visitante;
    }
    
    public Selecao getMandante() {
        return Mandante;
    }

    public void setMandante(Selecao Mandante) {
        this.Mandante = Mandante;
    }

    public int getGols_visitante() {
        return gols_visitante;
    }

    public void setGols_visitante(int gols_visitante) {
        this.gols_visitante = gols_visitante;
    }

    public int getGols_mandante() {
        return gols_mandante;
    }

    public void setGols_mandante(int gols_mandante) {
        this.gols_mandante = gols_mandante;
    }

    public Date getTempo() {
        return tempo;
    }

    public void setTempo(Date tempo) {
        this.tempo = tempo;
    }

    public Selecao getVisitante() {
        return Visitante;
    }

    public void setVisitante(Selecao Visitante) {
        this.Visitante = Visitante;
    }
    
    
}
