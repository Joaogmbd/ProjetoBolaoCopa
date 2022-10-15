/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

/**
 *
 * @author joaog
 */
public class Selecao {
    int id_selecao;
    String Nome;

    public Selecao(int id_selecao, String Nome) {
        this.id_selecao = id_selecao;
        this.Nome = Nome;
    }

    public int getId_selecao() {
        return id_selecao;
    }

    public void setId_selecao(int id_selecao) {
        this.id_selecao = id_selecao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
}
