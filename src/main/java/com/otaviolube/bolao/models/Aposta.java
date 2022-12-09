/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.bolao.models;

/**
 *
 * @author joaog
 */
public class Aposta {
    Rodadas Rodada;
    String Palpite;
    String Status;
    int Pontuacao;

    public Aposta(Rodadas Rodada, String Palpite, String Status, int Pontuacao) {
        this.Rodada = Rodada;
        this.Palpite = Palpite;
        this.Status = Status;
        this.Pontuacao = Pontuacao;
    }

    public Rodadas getRodada() {
        return Rodada;
    }

    public void setRodada(Rodadas Rodada) {
        this.Rodada = Rodada;
    }

    public String getPalpite() {
        return Palpite;
    }

    public void setPalpite(String Palpite) {
        this.Palpite = Palpite;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(int Pontuacao) {
        this.Pontuacao = Pontuacao;
    }
    
    
}
