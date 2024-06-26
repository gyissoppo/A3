package telas;

public class telaMenu extends javax.swing.JFrame {
    
    private String cnpjLogado;
        
    public telaMenu(String cnpjLogado) {
        initComponents();   
        this.cnpjLogado = cnpjLogado;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initComponents();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bFormulario = new javax.swing.JButton();
        bFeedback = new javax.swing.JButton();
        bChat = new javax.swing.JButton();
        bMeusdados = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pMenu.setBackground(new java.awt.Color(211, 242, 238));
        pMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pMenu.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bem vindo(a) ao portal do cliente CEGL Solutions!");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("O que podemos fazer por você hoje?");

        bFormulario.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bFormulario.setActionCommand("Formulario");
        bFormulario.setLabel("Responda algumas perguntas sobre melhorias para sua empresa");
        bFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFormularioActionPerformed(evt);
            }
        });

        bFeedback.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bFeedback.setText("Enviar feedback");
        bFeedback.setActionCommand("Feedback");
        bFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFeedbackActionPerformed(evt);
            }
        });

        bChat.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bChat.setText("Fale com um de nossos especialistas");
        bChat.setActionCommand("Chat");
        bChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChatActionPerformed(evt);
            }
        });

        bMeusdados.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bMeusdados.setText("Meus dados");
        bMeusdados.setActionCommand("Meusdados");
        bMeusdados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMeusdadosActionPerformed(evt);
            }
        });

        bLogout.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                        .addComponent(bLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bMeusdados)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(pMenuLayout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel2)))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                                        .addComponent(bChat, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107))
                                    .addComponent(bFormulario, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                                .addComponent(bFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(310, 310, 310))))))
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addComponent(bChat)
                        .addGap(47, 47, 47)
                        .addComponent(bFormulario)
                        .addGap(41, 41, 41)
                        .addComponent(bFeedback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(bMeusdados))
                    .addGroup(pMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bLogout)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFormularioActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {/*abre telaFormulario*/
                new telaFormulario(cnpjLogado).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_bFormularioActionPerformed

    private void bFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFeedbackActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {/*abre telaFeedback*/
            public void run() {
                new telaFeedback(cnpjLogado).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_bFeedbackActionPerformed

    private void bChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChatActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {/*abre telaChat*/
            public void run() {
                new telaChat(cnpjLogado).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_bChatActionPerformed

    private void bMeusdadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMeusdadosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMeusdados(cnpjLogado).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_bMeusdadosActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        telaLogin pi = new telaLogin();/*abre telaLogin*/
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenu(cnpjlogado).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChat;
    private javax.swing.JButton bFeedback;
    private javax.swing.JButton bFormulario;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bMeusdados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pMenu;
    // End of variables declaration//GEN-END:variables
}
