/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samuel
 */
public class TransferenciaPaciente extends DadosFranqueado{
    private String nomePaciente;
    
    public TransferenciaPaciente(String nome, String unidade, String nomePaciente){
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
        return String.format("""
                Bom dia!
                
                Foi registrado a Solicitação por telefone ao SAF.
                
                Dúvida/Solicitação: Solicitação de transferência de paciente.\n
                
                Orientação/Solução: Paciente transferido conforme o solicitado.
                
                Paciente: %s
                
                Solicitante: %s

                A sua avaliação é muito importante, se possível, avalie o meu atendimento através da mensagem desse ticket. Obrigado!
                """,getNomePaciente(),getNome());
    }
}
