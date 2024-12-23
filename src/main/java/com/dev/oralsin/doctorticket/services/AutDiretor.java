/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public class AutDiretor extends DadosFranqueado{
        private String msg;

    public AutDiretor(String nome, String unidade, String msg) {
        super(nome, unidade, msg);
    }


    public String getMsg() {
        return """
               Olá, tudo bem?
               
               Para realizarmos a sua solicitação, será necessário a autorização do diretor da unidade.
               
               Podendo colocar o diretor em cópia e solicitar que responda o e-mail com um OK.
               
               Ficamos no aguardo da autorização!
               """;
    }
}
