/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exemplo14_conversor;

/**
 *
 * @author Marcos Melo
 */
public class Classe_Janela extends javax.swing.JFrame {

    /**
     * Creates new form Classe_Janela
     */
    public Classe_Janela() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextFieldDollar = new javax.swing.JTextField();
        jTextFieldEuros = new javax.swing.JTextField();
        jTextFieldReais = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 255, 202));

        jTextFieldDollar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextFieldDollar.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldDollar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDollarKeyReleased(evt);
            }
        });

        jTextFieldEuros.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextFieldEuros.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldEuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEurosKeyReleased(evt);
            }
        });

        jTextFieldReais.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextFieldReais.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldReais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldReaisKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CONVERSOR DE MOEDAS");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("€");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("$");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldReais, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldEuros, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addComponent(jLabel1))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDollar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldReais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEurosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEurosKeyReleased
        String s1 = jTextFieldEuros.getText();
        float f1 = Float.parseFloat(s1);
        
        float dolares = f1*1.2f;
        String sDolares = String.valueOf(dolares);
        jTextFieldDollar.setText(sDolares);
        
        float reais = f1*5.37f;
        String sReais = String.valueOf(reais);
        jTextFieldReais.setText(sReais);
        
    }//GEN-LAST:event_jTextFieldEurosKeyReleased

    private void jTextFieldDollarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDollarKeyReleased
        String s1 = jTextFieldDollar.getText();
        float f1 = Float.parseFloat(s1);
        float tx = f1/1.2f;
        float euros = tx;
        String sEuros = String.valueOf(euros);
        jTextFieldEuros.setText(sEuros);
        
        float reais = tx*5.37f;
        String sReais = String.valueOf(reais);
        jTextFieldReais.setText(sReais);
    }//GEN-LAST:event_jTextFieldDollarKeyReleased

    private void jTextFieldReaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldReaisKeyReleased
        String s1 = jTextFieldReais.getText();
        float f1 = Float.parseFloat(s1);
        float tx = f1/5.37f;
        float euros = tx;
        String sEuros = String.valueOf(euros);
        jTextFieldEuros.setText(sEuros);
        
        float dolares = tx*1.2f; // conversão do valor dolár para o euro
        String sDolares = String.valueOf(dolares);
        jTextFieldDollar.setText(sDolares);
    }//GEN-LAST:event_jTextFieldReaisKeyReleased

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
            java.util.logging.Logger.getLogger(Classe_Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classe_Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classe_Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classe_Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classe_Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDollar;
    private javax.swing.JTextField jTextFieldEuros;
    private javax.swing.JTextField jTextFieldReais;
    // End of variables declaration//GEN-END:variables
}