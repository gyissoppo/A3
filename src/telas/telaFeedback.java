package telas;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class telaFeedback extends javax.swing.JFrame {
    
    public void fecharJanela(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public telaFeedback() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFeedback = new javax.swing.JPanel();
        lFeedback = new javax.swing.JLabel();
        tFeedback = new javax.swing.JPasswordField();
        bEnviarFeedback = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

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

        javax.swing.GroupLayout pFeedbackLayout = new javax.swing.GroupLayout(pFeedback);
        pFeedback.setLayout(pFeedbackLayout);
        pFeedbackLayout.setHorizontalGroup(
            pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFeedbackLayout.createSequentialGroup()
                .addGroup(pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFeedbackLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lFeedback))
                    .addGroup(pFeedbackLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(bEnviarFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFeedbackLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(tFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFeedbackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVoltar)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        pFeedbackLayout.setVerticalGroup(
            pFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFeedbackLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lFeedback)
                .addGap(62, 62, 62)
                .addComponent(tFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(bEnviarFeedback)
                .addGap(20, 20, 20)
                .addComponent(bVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEnviarFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarFeedbackActionPerformed

    }//GEN-LAST:event_bEnviarFeedbackActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        fecharJanela();
        telaMenu pi = new telaMenu();/*abre telaMenu*/
        pi.setVisible(true);
    }//GEN-LAST:event_bVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(telaFeedback1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFeedback1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFeedback1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFeedback1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEnviarFeedback;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lFeedback;
    private javax.swing.JPanel pFeedback;
    private javax.swing.JPasswordField tFeedback;
    // End of variables declaration//GEN-END:variables
}
