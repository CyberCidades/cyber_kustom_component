/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.example;

/**
 *
 * @author daniel
 */
public class ExampleKPanel extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ExampleKPanel() {
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

        kPanel1 = new br.com.cyber.componente.KPanel();
        jPanel1 = new javax.swing.JPanel();
        kButton1 = new br.com.cyber.componente.KButton();
        kButton2 = new br.com.cyber.componente.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kPanel1.setBackground(new java.awt.Color(102, 102, 255));
        kPanel1.setCaption("A virtude do ser humano e a cagada do programador");
        kPanel1.setFinalColor(new java.awt.Color(255, 0, 102));
        kPanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        kPanel1.setInitialColor(new java.awt.Color(51, 51, 255));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        kButton1.setForeground(new java.awt.Color(255, 255, 255));
        kButton1.setText("Confirmar");
        kButton1.setCorborda(java.awt.Color.white);
        kButton1.setOpaque(false);
        kButton1.setTheme(br.com.cyber.componente.KButton.ThemeOption.SUCCESS_ICON);
        jPanel1.add(kButton1);

        kButton2.setForeground(new java.awt.Color(255, 255, 255));
        kButton2.setText("Cancelar");
        kButton2.setCorborda(java.awt.Color.white);
        kButton2.setOpaque(false);
        kButton2.setTheme(br.com.cyber.componente.KButton.ThemeOption.ERROR_ICON);
        jPanel1.add(kButton2);

        javax.swing.GroupLayout kPanel1Layout = new javax.swing.GroupLayout(kPanel1);
        kPanel1.setLayout(kPanel1Layout);
        kPanel1Layout.setHorizontalGroup(
            kPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        kPanel1Layout.setVerticalGroup(
            kPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanel1Layout.createSequentialGroup()
                .addGap(0, 305, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ExampleKPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExampleKPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExampleKPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExampleKPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExampleKPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private br.com.cyber.componente.KButton kButton1;
    private br.com.cyber.componente.KButton kButton2;
    private br.com.cyber.componente.KPanel kPanel1;
    // End of variables declaration//GEN-END:variables
}
