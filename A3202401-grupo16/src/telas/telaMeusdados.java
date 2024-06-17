package telas;

import javax.swing.JOptionPane;
import model.metodos;
import model.usuario;

public class telaMeusdados extends javax.swing.JFrame {
    
    private String cnpjLogado;
    
    public telaMeusdados(String cnpjLogado) {
           initComponents();
           this.cnpjLogado = cnpjLogado;
           preencheCampos();
    }
    
    private void preencheCampos() {
        metodos model = new metodos();
        usuario Usuario = model.consultaUsuario(cnpjLogado);
        if (Usuario != null) {
            tEmpresaDados.setText(Usuario.getNomeEmpresa());
            tCnpjDados.setText(Usuario.getCnpj());
            tTelefoneDados.setText(Usuario.getCelular());
            tEmailDados.setText(Usuario.getEmail());
            tSenhaDados.setText(Usuario.getSenha());
            tConfirmaDados.setText(Usuario.getSenha());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do usuário!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMeusdados = new javax.swing.JPanel();
        lMeusdados = new javax.swing.JLabel();
        bAtualizardados = new javax.swing.JButton();
        bExcluirdados = new javax.swing.JButton();
        tSenhaDados = new javax.swing.JPasswordField();
        lSenhaDados = new javax.swing.JLabel();
        lEmailDados = new javax.swing.JLabel();
        lTelefoneDados = new javax.swing.JLabel();
        lCnpjDados = new javax.swing.JLabel();
        lEmpresaDados = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        tEmpresaDados = new javax.swing.JTextField();
        tCnpjDados = new javax.swing.JTextField();
        tTelefoneDados = new javax.swing.JTextField();
        tEmailDados = new javax.swing.JTextField();
        tConfirmaDados = new javax.swing.JPasswordField();
        lConfirmaDados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pMeusdados.setBackground(new java.awt.Color(211, 242, 238));
        pMeusdados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pMeusdados.setToolTipText("");

        lMeusdados.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lMeusdados.setForeground(new java.awt.Color(0, 0, 0));
        lMeusdados.setText("Meus dados");

        bAtualizardados.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        bAtualizardados.setText("Atualizar dados");
        bAtualizardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizardadosActionPerformed(evt);
            }
        });

        bExcluirdados.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        bExcluirdados.setText("Excluir conta");
        bExcluirdados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirdadosActionPerformed(evt);
            }
        });

        lSenhaDados.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lSenhaDados.setForeground(new java.awt.Color(0, 0, 0));
        lSenhaDados.setText("Senha:");

        lEmailDados.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lEmailDados.setForeground(new java.awt.Color(0, 0, 0));
        lEmailDados.setText("E-mail:");

        lTelefoneDados.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lTelefoneDados.setForeground(new java.awt.Color(0, 0, 0));
        lTelefoneDados.setText("Telefone:");

        lCnpjDados.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lCnpjDados.setForeground(new java.awt.Color(0, 0, 0));
        lCnpjDados.setText("CNPJ:");

        lEmpresaDados.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lEmpresaDados.setForeground(new java.awt.Color(0, 0, 0));
        lEmpresaDados.setText("Nome da empresa:");

        bVoltar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        tEmpresaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpresaDadosActionPerformed(evt);
            }
        });

        tCnpjDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCnpjDadosActionPerformed(evt);
            }
        });

        tTelefoneDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelefoneDadosActionPerformed(evt);
            }
        });

        tEmailDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailDadosActionPerformed(evt);
            }
        });

        lConfirmaDados.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lConfirmaDados.setForeground(new java.awt.Color(0, 0, 0));
        lConfirmaDados.setText("Confirme sua senha:");

        javax.swing.GroupLayout pMeusdadosLayout = new javax.swing.GroupLayout(pMeusdados);
        pMeusdados.setLayout(pMeusdadosLayout);
        pMeusdadosLayout.setHorizontalGroup(
            pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeusdadosLayout.createSequentialGroup()
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMeusdadosLayout.createSequentialGroup()
                        .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMeusdadosLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(lTelefoneDados))
                            .addComponent(lEmailDados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lSenhaDados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lConfirmaDados, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bAtualizardados)
                            .addGroup(pMeusdadosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(bExcluirdados, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tSenhaDados, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(tEmailDados)
                            .addComponent(tTelefoneDados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tConfirmaDados)))
                    .addGroup(pMeusdadosLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lEmpresaDados)
                            .addComponent(lCnpjDados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tEmpresaDados, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(tCnpjDados)))
                    .addGroup(pMeusdadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVoltar))
                    .addGroup(pMeusdadosLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lMeusdados)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        pMeusdadosLayout.setVerticalGroup(
            pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMeusdadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMeusdados)
                .addGap(55, 55, 55)
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmpresaDados)
                    .addComponent(tEmpresaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCnpjDados)
                    .addComponent(tCnpjDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefoneDados)
                    .addComponent(tTelefoneDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmailDados)
                    .addComponent(tEmailDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenhaDados)
                    .addComponent(tSenhaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pMeusdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConfirmaDados)
                    .addComponent(tConfirmaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(bAtualizardados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bExcluirdados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(bVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMeusdados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMeusdados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAtualizardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizardadosActionPerformed
        usuario Usuario = new usuario();
        String senha, confirme;
        senha = new String(tSenhaDados.getPassword());
        confirme = new String(tConfirmaDados.getPassword());
        if (senha.trim().equals("") || confirme.trim().equals("")
            || !senha.equals(confirme)) {
            JOptionPane.showMessageDialog(rootPane, "As senhas não são iguais.");
        } else {
            Usuario.setNomeEmpresa(tEmpresaDados.getText());
            Usuario.setCnpj(tCnpjDados.getText());
            Usuario.setCelular(tTelefoneDados.getText());
            Usuario.setEmail(tEmailDados.getText());
            Usuario.setSenha(senha);
            metodos model = new metodos();
            model.atualizaUsuario(Usuario, cnpjLogado);
            JOptionPane.showMessageDialog(rootPane, "Dados atualizados!");
        }
    }//GEN-LAST:event_bAtualizardadosActionPerformed

    private void bExcluirdadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirdadosActionPerformed
        try {
            Integer resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
            if (resposta == 0) {
                metodos model = new metodos();
                model.deletaUsuario(cnpjLogado);
                JOptionPane.showMessageDialog(rootPane, "Usuário excluído com sucesso!");
                this.dispose();
                telaLogin tela = new telaLogin();
                tela.setVisible(true);
            } else {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir usuário");
        }
    }//GEN-LAST:event_bExcluirdadosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        metodos met = new metodos();
        usuario user = met.consultaUsuario(this.cnpjLogado);
        tEmpresaDados.setText(user.getNomeEmpresa());
    }//GEN-LAST:event_formWindowOpened

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        telaMenu pi = new telaMenu(cnpjLogado);/*abre telaMenu*/
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tEmpresaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpresaDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpresaDadosActionPerformed

    private void tCnpjDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCnpjDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCnpjDadosActionPerformed

    private void tTelefoneDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefoneDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefoneDadosActionPerformed

    private void tEmailDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailDadosActionPerformed

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
            java.util.logging.Logger.getLogger(telaMeusdados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMeusdados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMeusdados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMeusdados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String cnpjLogado = "123"; // Exemplo: CNPJ obtido após login
                new telaMeusdados(cnpjLogado).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizardados;
    private javax.swing.JButton bExcluirdados;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lCnpjDados;
    private javax.swing.JLabel lConfirmaDados;
    private javax.swing.JLabel lEmailDados;
    private javax.swing.JLabel lEmpresaDados;
    private javax.swing.JLabel lMeusdados;
    private javax.swing.JLabel lSenhaDados;
    private javax.swing.JLabel lTelefoneDados;
    private javax.swing.JPanel pMeusdados;
    private javax.swing.JTextField tCnpjDados;
    private javax.swing.JPasswordField tConfirmaDados;
    private javax.swing.JTextField tEmailDados;
    private javax.swing.JTextField tEmpresaDados;
    private javax.swing.JPasswordField tSenhaDados;
    private javax.swing.JTextField tTelefoneDados;
    // End of variables declaration//GEN-END:variables
}
