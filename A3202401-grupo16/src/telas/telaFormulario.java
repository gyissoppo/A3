package telas;

import javax.swing.JOptionPane;
import model.formulario;
import model.metodos;

public class telaFormulario extends javax.swing.JFrame {

    private String cnpjLogado;
        
    public telaFormulario(String cnpjLogado) {
        initComponents();
        this.cnpjLogado = cnpjLogado;
        metodos model = new metodos();
        preencheCampos();
    }
    
    private void preencheCampos() {
        metodos model = new metodos();
        formulario Formulario = model.consultaFormulario(cnpjLogado);
        if (Formulario != null) {
            tPergunta1.setText(Formulario.getFormularioPergunta1());
            tPergunta2.setText(Formulario.getFormularioPergunta2());
            tPergunta3.setText(Formulario.getFormularioPergunta3());
            tPergunta4nome.setText(Formulario.getFormularioPergunta4nome());
            tPergunta4email.setText(Formulario.getFormularioPergunta4email());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do formulário!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFormulario = new javax.swing.JPanel();
        lFormulario2 = new javax.swing.JLabel();
        lPergunta1 = new javax.swing.JLabel();
        lPergunta2 = new javax.swing.JLabel();
        bEnviarFormulario = new javax.swing.JButton();
        lPergunta4email = new javax.swing.JLabel();
        lPergunta41 = new javax.swing.JLabel();
        lFormulario1 = new javax.swing.JLabel();
        lSenha2 = new javax.swing.JLabel();
        lPergunta3 = new javax.swing.JLabel();
        lPergunta4nome = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        tPergunta3 = new javax.swing.JTextField();
        tPergunta1 = new javax.swing.JTextField();
        tPergunta2 = new javax.swing.JTextField();
        tPergunta4nome = new javax.swing.JTextField();
        tPergunta4email = new javax.swing.JTextField();
        bExcluirFormulario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFormulario.setBackground(new java.awt.Color(211, 242, 238));
        pFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pFormulario.setToolTipText("");

        lFormulario2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lFormulario2.setForeground(new java.awt.Color(0, 0, 0));
        lFormulario2.setText("mais sobre você!");

        lPergunta1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lPergunta1.setForeground(new java.awt.Color(0, 0, 0));
        lPergunta1.setText("Quais sistemas utilizam atualmente na empresa?");

        lPergunta2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lPergunta2.setForeground(new java.awt.Color(0, 0, 0));
        lPergunta2.setText("Se não todas, quais ou qual área pretende modernizar?");

        bEnviarFormulario.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bEnviarFormulario.setActionCommand("Enviar");
        bEnviarFormulario.setLabel("Enviar");
        bEnviarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarFormularioActionPerformed(evt);
            }
        });

        lPergunta4email.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lPergunta4email.setForeground(new java.awt.Color(0, 0, 0));
        lPergunta4email.setText("E-mail:");

        lPergunta41.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lPergunta41.setForeground(new java.awt.Color(0, 0, 0));
        lPergunta41.setText("Qual o nome e e-mail do responsável pelo acompanhamento das");
        lPergunta41.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lFormulario1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lFormulario1.setForeground(new java.awt.Color(0, 0, 0));
        lFormulario1.setText("Deixe-nos saber um pouco");
        lFormulario1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lSenha2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lSenha2.setForeground(new java.awt.Color(0, 0, 0));
        lSenha2.setText("melhorias à serem implementadas pela CEGL Solutions ?");

        lPergunta3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lPergunta3.setForeground(new java.awt.Color(0, 0, 0));
        lPergunta3.setText("Quais os principais problemas encontrados hoje na empresa/área? ");

        lPergunta4nome.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lPergunta4nome.setForeground(new java.awt.Color(0, 0, 0));
        lPergunta4nome.setText("Nome:");

        bVoltar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        tPergunta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPergunta3ActionPerformed(evt);
            }
        });

        tPergunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPergunta1ActionPerformed(evt);
            }
        });

        tPergunta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPergunta2ActionPerformed(evt);
            }
        });

        tPergunta4nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPergunta4nomeActionPerformed(evt);
            }
        });

        tPergunta4email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPergunta4emailActionPerformed(evt);
            }
        });

        bExcluirFormulario.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bExcluirFormulario.setText("Limpar campos");
        bExcluirFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFormularioLayout = new javax.swing.GroupLayout(pFormulario);
        pFormulario.setLayout(pFormularioLayout);
        pFormularioLayout.setHorizontalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                .addComponent(lFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(235, 235, 235))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                .addComponent(lFormulario2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294))))
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addComponent(bVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(bExcluirFormulario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPergunta3)
                            .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lSenha2)
                                .addComponent(lPergunta41)
                                .addComponent(lPergunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lPergunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                    .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lPergunta4email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lPergunta4nome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tPergunta4nome, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tPergunta4email, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tPergunta3)
                                .addComponent(tPergunta1)
                                .addComponent(tPergunta2))))
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(bEnviarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        pFormularioLayout.setVerticalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lFormulario2)
                .addGap(57, 57, 57)
                .addComponent(lPergunta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPergunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lPergunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPergunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lPergunta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPergunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lPergunta41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSenha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPergunta4nome)
                    .addComponent(tPergunta4nome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPergunta4email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPergunta4email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(bEnviarFormulario)
                .addGap(18, 18, 18)
                .addComponent(bExcluirFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarFormularioActionPerformed
        formulario Formulario = new formulario();
        Formulario.setFormularioCnpj(cnpjLogado);
        Formulario.setFormularioPergunta1(tPergunta1.getText());
        Formulario.setFormularioPergunta2(tPergunta2.getText());
        Formulario.setFormularioPergunta3(tPergunta3.getText());
        Formulario.setFormularioPergunta4nome(tPergunta4nome.getText());
        Formulario.setFormularioPergunta4email(tPergunta4email.getText());
        metodos model = new metodos();
        model.insereFormulario(Formulario);
        JOptionPane.showMessageDialog(rootPane, "Enviado, agradecemos o feedback!");
    }//GEN-LAST:event_bEnviarFormularioActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        telaMenu pi = new telaMenu(cnpjLogado);/*abre telaMenu*/
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tPergunta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPergunta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPergunta3ActionPerformed

    private void tPergunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPergunta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPergunta1ActionPerformed

    private void tPergunta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPergunta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPergunta2ActionPerformed

    private void tPergunta4nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPergunta4nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPergunta4nomeActionPerformed

    private void tPergunta4emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPergunta4emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPergunta4emailActionPerformed

    private void bExcluirFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirFormularioActionPerformed
        try {
            metodos model = new metodos();
            model.deletaFormulario(cnpjLogado); 
            JOptionPane.showMessageDialog(this, "Respostas excluídas! Responda as perguntas novamente.");
            tPergunta1.setText("");
            tPergunta2.setText("");
            tPergunta3.setText("");
            tPergunta4nome.setText("");
            tPergunta4email.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir respostas.");
        }
    }//GEN-LAST:event_bExcluirFormularioActionPerformed

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
            java.util.logging.Logger.getLogger(telaFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFormulario().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEnviarFormulario;
    private javax.swing.JButton bExcluirFormulario;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lFormulario1;
    private javax.swing.JLabel lFormulario2;
    private javax.swing.JLabel lPergunta1;
    private javax.swing.JLabel lPergunta2;
    private javax.swing.JLabel lPergunta3;
    private javax.swing.JLabel lPergunta41;
    private javax.swing.JLabel lPergunta4email;
    private javax.swing.JLabel lPergunta4nome;
    private javax.swing.JLabel lSenha2;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JTextField tPergunta1;
    private javax.swing.JTextField tPergunta2;
    private javax.swing.JTextField tPergunta3;
    private javax.swing.JTextField tPergunta4email;
    private javax.swing.JTextField tPergunta4nome;
    // End of variables declaration//GEN-END:variables
}
