/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalvan
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        setSize(550,750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BSupervisor = new javax.swing.JButton();
        BSair = new javax.swing.JButton();
        BAgente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);

        BSupervisor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BSupervisor.setText("Supervisor");
        BSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSupervisorActionPerformed(evt);
            }
        });
        getContentPane().add(BSupervisor);
        BSupervisor.setBounds(290, 260, 140, 100);

        BSair.setText("Sair");
        BSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSairActionPerformed(evt);
            }
        });
        getContentPane().add(BSair);
        BSair.setBounds(360, 590, 51, 23);

        BAgente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BAgente.setText("Agente ");
        BAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgenteActionPerformed(evt);
            }
        });
        getContentPane().add(BAgente);
        BAgente.setBounds(90, 260, 140, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Bem Vindo ao DHK Software");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 90, 330, 31);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 530, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgenteActionPerformed
        new TelaAgente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BAgenteActionPerformed

    private void BSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BSairActionPerformed

    private void BSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSupervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSupervisorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgente;
    private javax.swing.JButton BSair;
    private javax.swing.JButton BSupervisor;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
