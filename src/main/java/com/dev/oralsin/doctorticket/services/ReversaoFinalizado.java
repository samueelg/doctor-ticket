/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public class ReversaoFinalizado extends DadosFranqueado {
        private String nomePaciente;
    
    public ReversaoFinalizado(String nome, String unidade, String nomePaciente){
        super(nome, unidade,nomePaciente);
        this.nomePaciente = nomePaciente;
    }
        
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    @Override
    public String getMsg() {
        return String.format(
                """
                %s
                
                Foi registrado a Solicitação por telefone ao SAF.
               
                Dúvida/Solicitação: Solicitação de reversão de paciente com status finalizado.
                
                Orientação/Solução: Paciente conforme o solicitado.
                
                Paciente: %s
                
                Solicitante: %s
                
                A sua avaliação é muito importante, se possível, avalie o meu atendimento através da mensagem desse ticket. Obrigado!
                """,saudacao(),getNomePaciente(),getNome());
    }
}
