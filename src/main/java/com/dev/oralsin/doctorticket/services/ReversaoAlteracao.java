/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public class ReversaoAlteracao extends DadosFranqueado{
        private String nomePaciente;
    
    public ReversaoAlteracao(String nome, String unidade, String nomePaciente){
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
        return "Bom dia! \n"
                + "\n"
                + "Foi registrado a Solicitação por telefone ao SAF. \n"
                + "\n"
                + "Dúvida/Solicitação: Solicitação de reversão de contrato em processo de alteração.\n"
                + "\n"
                + "Orientação/Solução: Alteração revertida conforme o solicitado.\n"
                + "\n"
                + "Paciente: " + getNomePaciente() + "\n"
                + "\n"
                + "Solicitante: " + getNome() + "\n"
                + "\n"
                + "A sua avaliação é muito importante, se possível, avalie o meu atendimento através da mensagem desse ticket. Obrigado!\n";
    }
}
