/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public class Email extends DadosFranqueado{
    private String msg;

    public Email(String nome, String unidade, String msg) {
        super(nome, unidade, msg);
    }

    public String getMsg() {
        return String.format(
                """
                Olá, tudo bem?
                
                Por padrões de segurança da franquia, para atender sua solicitação, precisamos que este e-mail seja de domínio @oralsin.
                
                Caso não possua um, favor solicitar que o seu diretor faça a solicitação.
                
                Ficamos no aguardo para que possamos te atender da melhor forma!
                """);
    }
}
