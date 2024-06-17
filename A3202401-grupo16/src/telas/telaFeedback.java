package telas;

import javax.swing.JOptionPane;
import model.metodos;
import model.feedback;

public class telaFeedback extends javax.swing.JFrame {
    
    private String cnpjLogado;

    public telaFeedback(String cnpjLogado) {
        initComponents();
        this.cnpjLogado = cnpjLogado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFeedback = new javax.swing.JPanel();
        lFeedback = new javax.swing.JLabel();
        bEnviarFeedback = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        tFeedback = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFeedback.setBackground(new java.awt.Color(211, 242, 238));
        pFeedback.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pFeedback.setToolTipText("");

        lFeedback.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lFeedback.setForeground(new java.awt.Color(0, 0, 0));
        lFeedback.setText("Deixe-nos um feedback!");

        bEnviarFeedback.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        bEnviarFeedback.setText("Enviar");
        bEnviarFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarFeedbackActionPerformed(evt);
            }
        });

        bVoltar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        tFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFeedbackLayout = new javax.swing.GroupLayout(pFeedback);
        pFeedback.setLayout(pFeedbackLayout);
        pFeedbackLayout.setHorizontalGroup(
            pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFeedbackLayout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFeedback)
                    .addGroup(pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFeedbackLayout.createSequentialGroup()
                            .addComponent(tFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFeedbackLayout.createSequentialGroup()
                            .addComponent(bEnviarFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(169, 169, 169)))))
        );
        pFeedbackLayout.setVerticalGroup(
            pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFeedbackLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lFeedback)
                .addGap(37, 37, 37)
                .addComponent(tFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(bEnviarFeedback)
                .addGap(20, 20, 20)
                .addComponent(bVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarFeedbackActionPerformed
        feedback Feedback = new feedback();
        Feedback.setFeedbackCnpj(cnpjLogado);
        Feedback.setFeedbackFeedbackcliente(tFeedback.getText());
        metodos model = new metodos();
        model.insereFeedback(Feedback);
        JOptionPane.showMessageDialog(rootPane, "Enviado, agradecemos o feedback!");
        tFeedback.setText("");
    }//GEN-LAST:event_bEnviarFeedbackActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        telaMenu pi = new telaMenu(cnpjLogado);/*abre telaMenu*/
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFeedbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFeedbackActionPerformed

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
            java.util.logging.Logger.getLogger(telaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFeedback(cnpjLogado).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEnviarFeedback;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lFeedback;
    private javax.swing.JPanel pFeedback;
    private javax.swing.JTextField tFeedback;
    // End of variables declaration//GEN-END:variables
}
