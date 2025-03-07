/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev.oralsin.doctorticket.forms;

import com.dev.oralsin.doctorticket.models.Alteracao;
import com.dev.oralsin.doctorticket.models.AutDiretor;
import com.dev.oralsin.doctorticket.models.Cancelamento;
import com.dev.oralsin.doctorticket.models.DadosFranqueado;
import com.dev.oralsin.doctorticket.models.Email;
import com.dev.oralsin.doctorticket.models.ReversaoAlteracao;
import com.dev.oralsin.doctorticket.models.ReversaoFinalizado;
import com.dev.oralsin.doctorticket.models.TransferenciaPaciente;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
                try {
            // Caminho do Chrome
            String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

            // Parâmetros para abrir o Chrome com debugging ativado
            String[] command = {
                chromePath,
                "--remote-debugging-port=9222",
                "--user-data-dir=C:\\chrome-profile"
            };

            // Iniciar o processo do Chrome
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.start();

            System.out.println("Chrome iniciado com depuração!");

        } catch (IOException e) {
            System.out.println("Não foi possivel inicializar o navegador");
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        unidadeInput = new javax.swing.JTextField();
        nomeFranqueadoInput = new javax.swing.JTextField();
        nomeFranqueado = new javax.swing.JLabel();
        nomeUnidade = new javax.swing.JLabel();
        nomePacienteInput = new javax.swing.JTextField();
        nomePaciente = new javax.swing.JLabel();
        buttonTransferencia = new javax.swing.JButton();
        buttonCancelamento = new javax.swing.JButton();
        buttonFinalizado = new javax.swing.JButton();
        buttonAlteracao = new javax.swing.JButton();
        buttonRevAlteracao = new javax.swing.JButton();
        buttomEmail = new javax.swing.JButton();
        buttonAut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        title.setText("DoctorTicket");

        unidadeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadeInputActionPerformed(evt);
            }
        });

        nomeFranqueadoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFranqueadoInputActionPerformed(evt);
            }
        });

        nomeFranqueado.setText("Nome do Franqueado");

        nomeUnidade.setText("Unidade");

        nomePacienteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePacienteInputActionPerformed(evt);
            }
        });

        nomePaciente.setText("Nome do Paciente (Se houver)");

        buttonTransferencia.setText("Transferência de Paciente");
        buttonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferenciaActionPerformed(evt);
            }
        });

        buttonCancelamento.setText("Reversão de Cancelamento");
        buttonCancelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelamentoActionPerformed(evt);
            }
        });

        buttonFinalizado.setText("Reversão de Finalizado");
        buttonFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizadoActionPerformed(evt);
            }
        });

        buttonAlteracao.setText("Alteração de Contrato");
        buttonAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlteracaoActionPerformed(evt);
            }
        });

        buttonRevAlteracao.setText("Reversão de Alteração");
        buttonRevAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRevAlteracaoActionPerformed(evt);
            }
        });

        buttomEmail.setText("E-mail sem domínio");
        buttomEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomEmailActionPerformed(evt);
            }
        });

        buttonAut.setText("Autorização do Diretor");
        buttonAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomePaciente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomePacienteInput)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeFranqueadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeFranqueado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeUnidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonAut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonRevAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonFinalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonCancelamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttomEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFranqueado)
                    .addComponent(nomeUnidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFranqueadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(nomePaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRevAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttomEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAut, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unidadeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadeInputActionPerformed

    private void nomeFranqueadoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFranqueadoInputActionPerformed
        //Input do nome do franqueado
    }//GEN-LAST:event_nomeFranqueadoInputActionPerformed

    private void nomePacienteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePacienteInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePacienteInputActionPerformed

    private void buttonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferenciaActionPerformed
        //Botão para ir para a tela de Transferencia
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
            if (nomeF.isEmpty() || unidade.isEmpty() || nomeP.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        TransferenciaPaciente tp = new TransferenciaPaciente(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(tp);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        
    }//GEN-LAST:event_buttonTransferenciaActionPerformed

    private void buttonCancelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelamentoActionPerformed
                //Botão para ir para a tela de Reversão de cancelamento
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
            if (nomeF.isEmpty() || unidade.isEmpty() || nomeP.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        Cancelamento cancelamento = new Cancelamento(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(cancelamento);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
            
    }//GEN-LAST:event_buttonCancelamentoActionPerformed

    private void buttonFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizadoActionPerformed
                //Botão para ir para a tela de Transferencia
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
            if (nomeF.isEmpty() || unidade.isEmpty() || nomeP.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        ReversaoFinalizado finalizado = new ReversaoFinalizado(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(finalizado);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        
    }//GEN-LAST:event_buttonFinalizadoActionPerformed

    private void buttonAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlteracaoActionPerformed
                        //Botão para ir para a tela de Transferencia
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
            if (nomeF.isEmpty() || unidade.isEmpty() || nomeP.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        Alteracao alteracao = new Alteracao(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(alteracao);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
          
    }//GEN-LAST:event_buttonAlteracaoActionPerformed

    private void buttonRevAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRevAlteracaoActionPerformed
                        //Botão para ir para a tela de Transferencia
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
            if (nomeF.isEmpty() || unidade.isEmpty() || nomeP.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        ReversaoAlteracao revA = new ReversaoAlteracao(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(revA);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);     
    }//GEN-LAST:event_buttonRevAlteracaoActionPerformed

    private void buttomEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomEmailActionPerformed
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
        Email email = new Email(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(email);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);    
        
    }//GEN-LAST:event_buttomEmailActionPerformed

    private void buttonAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAutActionPerformed
        String nomeF = nomeFranqueadoInput.getText();
        String unidade = unidadeInput.getText();
        String nomeP = nomePacienteInput.getText();
        
        AutDiretor diretor = new AutDiretor(nomeF,unidade,nomeP);
        
        FormSubmit form = new FormSubmit(diretor);
        this.dispose();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);    
        
    }//GEN-LAST:event_buttonAutActionPerformed

        private void abrirTela2(DadosFranqueado dados) {
        FormSubmit tela2 = new FormSubmit(dados);
        tela2.setVisible(true);
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMain form = new FormMain();
                form.setVisible(true);
                form.setLocationRelativeTo(null);
                form.setResizable(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttomEmail;
    private javax.swing.JButton buttonAlteracao;
    private javax.swing.JButton buttonAut;
    private javax.swing.JButton buttonCancelamento;
    private javax.swing.JButton buttonFinalizado;
    private javax.swing.JButton buttonRevAlteracao;
    private javax.swing.JButton buttonTransferencia;
    private javax.swing.JLabel nomeFranqueado;
    private javax.swing.JTextField nomeFranqueadoInput;
    private javax.swing.JLabel nomePaciente;
    private javax.swing.JTextField nomePacienteInput;
    private javax.swing.JLabel nomeUnidade;
    private javax.swing.JLabel title;
    private javax.swing.JTextField unidadeInput;
    // End of variables declaration//GEN-END:variables
}
