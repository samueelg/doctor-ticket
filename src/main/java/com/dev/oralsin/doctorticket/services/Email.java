/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public class Email {
    private String msg;

    public Email(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return "Olá, tudo bem?"
                + "\n"
                + "Por padrões de segurança da franquia, para atender sua solicitação, precisamos que este e-mail seja de domínio @oralsin \n"
                + "\n"
                + "Caso não possua um, favor solicitar que o seu diretor faça a solicitação.\n"
                + "\n"
                + "Ficamos no aguardo para que possamos te atender da melhor forma!";
    }
}
