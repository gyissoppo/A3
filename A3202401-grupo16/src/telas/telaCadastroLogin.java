package telas;

import javax.swing.JOptionPane;
import model.metodos;
import model.usuario;

public class telaCadastroLogin extends javax.swing.JFrame {
    
    public telaCadastroLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCadastro = new javax.swing.JPanel();
        lCadastro = new javax.swing.JLabel();
        lEmpresaCadastro = new javax.swing.JLabel();
        lCnpjCadastro = new javax.swing.JLabel();
        bCadastroLogin = new javax.swing.JButton();
        lEmailCadastro = new javax.swing.JLabel();
        lTelefoneCadastro = new javax.swing.JLabel();
        tSenhaCadastro = new javax.swing.JPasswordField();
        lSenhaCadastro = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        tConfirmaCadastro = new javax.swing.JPasswordField();
        lConfirmaCadastro = new javax.swing.JLabel();
        tCnpjCadastro = new javax.swing.JTextField();
        tEmpresaCadastro = new javax.swing.JTextField();
        tTelefoneCadastro = new javax.swing.JTextField();
        tEmailCadastro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCadastro.setBackground(new java.awt.Color(211, 242, 238));
        pCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pCadastro.setToolTipText("");

        lCadastro.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lCadastro.setText("Cadastre-se");

        lEmpresaCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lEmpresaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lEmpresaCadastro.setText("Nome da empresa:");

        lCnpjCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lCnpjCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lCnpjCadastro.setText("CNPJ:");

        bCadastroLogin.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        bCadastroLogin.setText("Cadastrar");
        bCadastroLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastroLoginActionPerformed(evt);
            }
        });

        lEmailCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lEmailCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lEmailCadastro.setText("E-mail:");

        lTelefoneCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lTelefoneCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lTelefoneCadastro.setText("Telefone:");

        lSenhaCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lSenhaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lSenhaCadastro.setText("Senha:");

        bVoltar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lConfirmaCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lConfirmaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lConfirmaCadastro.setText("Confirme sua senha:");

        tCnpjCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCnpjCadastroActionPerformed(evt);
            }
        });

        tEmpresaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpresaCadastroActionPerformed(evt);
            }
        });

        tTelefoneCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelefoneCadastroActionPerformed(evt);
            }
        });

        tEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCadastroLayout = new javax.swing.GroupLayout(pCadastro);
        pCadastro.setLayout(pCadastroLayout);
        pCadastroLayout.setHorizontalGroup(
            pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bCadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pCadastroLayout.createSequentialGroup()
                            .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pCadastroLayout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(lTelefoneCadastro))
                                .addComponent(lEmailCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lSenhaCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pCadastroLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(lCadastro))
                        .addGroup(pCadastroLayout.createSequentialGroup()
                            .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lEmpresaCadastro)
                                .addComponent(lCnpjCadastro))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tCnpjCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(tEmpresaCadastro))))
                    .addGroup(pCadastroLayout.createSequentialGroup()
                        .addComponent(lConfirmaCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
            .addGroup(pCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCadastroLayout.setVerticalGroup(
            pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lCadastro)
                .addGap(62, 62, 62)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEmpresaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEmpresaCadastro))
                .addGap(18, 18, 18)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCnpjCadastro)
                    .addComponent(tCnpjCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefoneCadastro)
                    .addComponent(tTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmailCadastro)
                    .addComponent(tEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenhaCadastro)
                    .addComponent(tSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConfirmaCadastro)
                    .addComponent(tConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(bCadastroLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastroLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastroLoginActionPerformed
        usuario Usuario = new usuario();
        String senha, confirme;
        senha = new String(tSenhaCadastro.getPassword());
        confirme = new String(tConfirmaCadastro.getPassword());
        if (senha.trim().equals("") || confirme.trim().equals("")
                || !senha.equals(confirme)) {
            JOptionPane.showMessageDialog(rootPane, "As senhas não são iguais.");
        }
        else {
            Usuario.setNomeEmpresa(tEmpresaCadastro.getText());
            Usuario.setCnpj(tCnpjCadastro.getText());
            Usuario.setCelular(tTelefoneCadastro.getText());
            Usuario.setEmail(tEmailCadastro.getText());
            Usuario.setSenha(senha);
            metodos model = new metodos();
            model.insereUsuario(Usuario);
            JOptionPane.showMessageDialog(rootPane, "Usuario adicionado!");
            new telaLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bCadastroLoginActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        telaLogin pi = new telaLogin();/*abre telaLogin*/
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tCnpjCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCnpjCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCnpjCadastroActionPerformed

    private void tEmpresaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpresaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpresaCadastroActionPerformed

    private void tTelefoneCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefoneCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefoneCadastroActionPerformed

    private void tEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastroLogin;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lCadastro;
    private javax.swing.JLabel lCnpjCadastro;
    private javax.swing.JLabel lConfirmaCadastro;
    private javax.swing.JLabel lEmailCadastro;
    private javax.swing.JLabel lEmpresaCadastro;
    private javax.swing.JLabel lSenhaCadastro;
    private javax.swing.JLabel lTelefoneCadastro;
    private javax.swing.JPanel pCadastro;
    private javax.swing.JTextField tCnpjCadastro;
    private javax.swing.JPasswordField tConfirmaCadastro;
    private javax.swing.JTextField tEmailCadastro;
    private javax.swing.JTextField tEmpresaCadastro;
    private javax.swing.JPasswordField tSenhaCadastro;
    private javax.swing.JTextField tTelefoneCadastro;
    // End of variables declaration//GEN-END:variables
}
