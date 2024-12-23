/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.oralsin.doctorticket.services;

/**
 *
 * @author samue
 */
public class Alteracao extends DadosFranqueado{
        private String nomePaciente;
    
    public Alteracao(String nome, String unidade, String nomePaciente){
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
                + "Dúvida/Solicitação: Duvida sobre como realizar alteração de contrato.\n"
                + "\n"
                + "Orientação/Solução: Orientado via AnyDesk o passo a passo para realizar a alteração do contrato.\n"
                + "\n"
                + "Paciente: " + getNomePaciente() + "\n"
                + "\n"
                + "Solicitante: " + getNome() + "\n"
                + "\n"
                + "A sua avaliação é muito importante, se possível, avalie o meu atendimento através da mensagem desse ticket. Obrigado!\n";
    }
}
