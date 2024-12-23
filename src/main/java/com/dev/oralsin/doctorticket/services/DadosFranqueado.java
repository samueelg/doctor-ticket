/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

import java.time.LocalDate;
import java.time.LocalTime;

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
        
        public String verificaTempo(LocalTime horario){
        if (horario.isBefore(LocalTime.NOON)) {
            return "Bom dia, tudo bem?";
        } else if (horario.isBefore(LocalTime.of(19, 0))) {
            return "Boa tarde, tudo bem?";
        } else {
            return "Boa noite, tudo bem?";
        }
    }
                public String saudacao(){
            LocalTime agora = LocalTime.now();
            
            return verificaTempo(agora);
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
