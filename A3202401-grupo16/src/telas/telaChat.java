package telas;

import java.util.List;
import model.metodos;
import model.chat;

public class telaChat extends javax.swing.JFrame {

    String cnpjLogado;

    public telaChat(String cnpjLogado) {
        initComponents();
        this.cnpjLogado = cnpjLogado;
        preencheTextarea();
    }

    private void preencheTextarea() {
        metodos model = new metodos();
        List<chat> listaChats = model.consultaChat(cnpjLogado);
        taChat.setText("");
        for (chat mensagem : listaChats) {
            taChat.append(mensagem.getChatMensagem() + "\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pChat = new javax.swing.JPanel();
        lChat = new javax.swing.JLabel();
        bEnviarChat = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        tChat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taChat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pChat.setBackground(new java.awt.Color(211, 242, 238));
        pChat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pChat.setToolTipText("");

        lChat.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lChat.setForeground(new java.awt.Color(0, 0, 0));
        lChat.setText("Chat");
        lChat.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bEnviarChat.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        bEnviarChat.setText("Enviar");
        bEnviarChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarChatActionPerformed(evt);
            }
        });

        bVoltar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        tChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tChatActionPerformed(evt);
            }
        });

        taChat.setEditable(false);
        taChat.setBackground(new java.awt.Color(211, 242, 238));
        taChat.setColumns(20);
        taChat.setRows(5);
        jScrollPane2.setViewportView(taChat);

        javax.swing.GroupLayout pChatLayout = new javax.swing.GroupLayout(pChat);
        pChat.setLayout(pChatLayout);
        pChatLayout.setHorizontalGroup(
            pChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pChatLayout.createSequentialGroup()
                .addComponent(tChat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEnviarChat))
            .addGroup(pChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pChatLayout.createSequentialGroup()
                        .addComponent(bVoltar)
                        .addGap(115, 115, 115)
                        .addComponent(lChat)
                        .addGap(0, 216, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pChatLayout.setVerticalGroup(
            pChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lChat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVoltar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bEnviarChat, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(tChat)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarChatActionPerformed
        chat Chat = new chat();
        Chat.setChatCnpj(cnpjLogado);
        Chat.setChatMensagem(tChat.getText());
        metodos model = new metodos();
        model.insereChat(Chat);
        preencheTextarea();
        tChat.setText("");
    }//GEN-LAST:event_bEnviarChatActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        telaMenu pi = new telaMenu(cnpjLogado);/*abre telaMenu*/
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tChatActionPerformed

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
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaChat().setVisible(true);
            }
        });*/
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEnviarChat;
    private javax.swing.JButton bVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lChat;
    private javax.swing.JPanel pChat;
    private javax.swing.JTextField tChat;
    private javax.swing.JTextArea taChat;
    // End of variables declaration//GEN-END:variables
}
