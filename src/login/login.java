/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtUSUARIO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtnINICIAR = new javax.swing.JButton();
        jbtnSALIR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpsPASSWORD = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(410, 550));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ACCESO");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(110, 10, 190, 60);

        jtxtUSUARIO.setBackground(new java.awt.Color(204, 204, 255));
        jtxtUSUARIO.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jtxtUSUARIO.setForeground(new java.awt.Color(0, 0, 0));
        jtxtUSUARIO.setBorder(null);
        jtxtUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUSUARIOActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtUSUARIO);
        jtxtUSUARIO.setBounds(120, 310, 210, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Usuario");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(170, 290, 80, 22);

        jbtnINICIAR.setBackground(new java.awt.Color(204, 204, 255));
        jbtnINICIAR.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jbtnINICIAR.setForeground(new java.awt.Color(0, 0, 0));
        jbtnINICIAR.setText("Iniciar sesión");
        jbtnINICIAR.setBorder(null);
        jbtnINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnINICIARActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnINICIAR);
        jbtnINICIAR.setBounds(120, 430, 160, 40);

        jbtnSALIR.setBackground(new java.awt.Color(204, 204, 255));
        jbtnSALIR.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jbtnSALIR.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSALIR.setText("Salir");
        jbtnSALIR.setBorder(null);
        jbtnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSALIRActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnSALIR);
        jbtnSALIR.setBounds(170, 470, 60, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/grupo (2).png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(70, 60, 256, 220);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(120, 340, 210, 20);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(170, 360, 100, 22);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(120, 420, 210, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/llave (1).png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(70, 380, 40, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/usuario-de-perfil (1).png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(70, 300, 40, 40);

        jpsPASSWORD.setBackground(new java.awt.Color(204, 204, 255));
        jpsPASSWORD.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jpsPASSWORD.setBorder(null);
        jPanel3.add(jpsPASSWORD);
        jpsPASSWORD.setBounds(120, 390, 220, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 410, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSALIRActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnSALIRActionPerformed

    private void jtxtUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUSUARIOActionPerformed

    private void jbtnINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnINICIARActionPerformed
        // TODO add your handling code here:
        String pas = new String(jpsPASSWORD.getPassword());
        if (jtxtUSUARIO.getText().equals("admin") && pas.equals("123456")) {
            venta.registro_de_venta registro = new venta.registro_de_venta();
            registro.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus datos correctos");
            jtxtUSUARIO.setText("");
            jpsPASSWORD.setText("");
        }
    }//GEN-LAST:event_jbtnINICIARActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnINICIAR;
    private javax.swing.JButton jbtnSALIR;
    private javax.swing.JPasswordField jpsPASSWORD;
    private javax.swing.JTextField jtxtUSUARIO;
    // End of variables declaration//GEN-END:variables
}
