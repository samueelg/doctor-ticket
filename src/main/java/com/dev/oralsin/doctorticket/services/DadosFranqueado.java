/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public abstract class DadosFranqueado {
    private String nome;
    private String unidade;
    private String msg;
    private String nomeP;
    
    public DadosFranqueado(String nome, String unidade,String msg){
        this.nome = nome;
        this.unidade = unidade;
        this.msg = msg;
    }
    
        public DadosFranqueado(String nome, String unidade, String nomeP,String msg){
        this.msg = msg;
        this.nome = nome;
        this.unidade = unidade;
        this.nomeP = nomeP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }
    
    
    
}
