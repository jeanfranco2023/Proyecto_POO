/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package venta;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import javax.swing.UIManager;

/**
 *
 * @author PC
 */
public class registro_de_venta extends javax.swing.JFrame {

    /**
     * Creates new form registro_de_venta
     */
    DefaultTableModel modelo = new DefaultTableModel();

    public registro_de_venta() {
        initComponents();
        this.setLocationRelativeTo(null);
        String ids[] = {"Nombre", "DNI", "Telefono", "Producto", "Marca", "N° de unidades"};
        modelo.setColumnIdentifiers(ids);
        jTable1.setModel(modelo);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNOMBRE = new javax.swing.JTextField();
        jtxtTELEFONO = new javax.swing.JTextField();
        jtxtDNI = new javax.swing.JTextField();
        jtxtUNIDADES = new javax.swing.JTextField();
        jcbxPRODUCTO = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        tabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnELIMINAR_TODO = new javax.swing.JButton();
        jbtnAGREGAR_PEDIDO = new javax.swing.JButton();
        jbtnELIMINAR_FILA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbtnGENERAR_BOLETA = new javax.swing.JButton();
        jbtnSALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 540));

        jPanel1.setBackground(new java.awt.Color(0, 123, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(599, 427));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 3, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IMPORTADORA EXPRESS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 480, 70);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel2.setText("N° de unidades");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 260, 130, 30);

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 80, 30);

        jLabel4.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 140, 80, 30);

        jLabel5.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel5.setText("DNI");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 180, 80, 30);

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel6.setText("Producto");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 220, 80, 30);

        jtxtNOMBRE.setBackground(new java.awt.Color(0, 123, 255));
        jtxtNOMBRE.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jtxtNOMBRE.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNOMBRE.setBorder(null);
        jtxtNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNOMBREActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtNOMBRE);
        jtxtNOMBRE.setBounds(170, 90, 240, 30);

        jtxtTELEFONO.setBackground(new java.awt.Color(0, 123, 255));
        jtxtTELEFONO.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jtxtTELEFONO.setForeground(new java.awt.Color(0, 0, 0));
        jtxtTELEFONO.setBorder(null);
        jPanel1.add(jtxtTELEFONO);
        jtxtTELEFONO.setBounds(170, 130, 240, 30);

        jtxtDNI.setBackground(new java.awt.Color(0, 123, 255));
        jtxtDNI.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jtxtDNI.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDNI.setBorder(null);
        jPanel1.add(jtxtDNI);
        jtxtDNI.setBounds(170, 170, 240, 30);

        jtxtUNIDADES.setBackground(new java.awt.Color(0, 123, 255));
        jtxtUNIDADES.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jtxtUNIDADES.setForeground(new java.awt.Color(0, 0, 0));
        jtxtUNIDADES.setBorder(null);
        jPanel1.add(jtxtUNIDADES);
        jtxtUNIDADES.setBounds(170, 250, 240, 30);

        jcbxPRODUCTO.setBackground(new java.awt.Color(0, 123, 255));
        jcbxPRODUCTO.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jcbxPRODUCTO.setForeground(new java.awt.Color(0, 0, 0));
        jcbxPRODUCTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pantalon", "Polos", "Buzos", "Poleras", "Casacas" }));
        jPanel1.add(jcbxPRODUCTO);
        jcbxPRODUCTO.setBounds(170, 220, 240, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(170, 280, 240, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(170, 120, 240, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(170, 160, 240, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(170, 200, 240, 10);

        jTable1.setBackground(new java.awt.Color(0, 123, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setViewportView(jTable1);

        jPanel1.add(tabla);
        tabla.setBounds(10, 350, 660, 110);

        jbtnELIMINAR_TODO.setBackground(new java.awt.Color(0, 123, 255));
        jbtnELIMINAR_TODO.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jbtnELIMINAR_TODO.setForeground(new java.awt.Color(0, 0, 0));
        jbtnELIMINAR_TODO.setText("Eliminar todo");
        jbtnELIMINAR_TODO.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbtnELIMINAR_TODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnELIMINAR_TODOActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnELIMINAR_TODO);
        jbtnELIMINAR_TODO.setBounds(440, 300, 150, 40);

        jbtnAGREGAR_PEDIDO.setBackground(new java.awt.Color(0, 123, 255));
        jbtnAGREGAR_PEDIDO.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jbtnAGREGAR_PEDIDO.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAGREGAR_PEDIDO.setText("Agregar pedido");
        jbtnAGREGAR_PEDIDO.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbtnAGREGAR_PEDIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAGREGAR_PEDIDOActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAGREGAR_PEDIDO);
        jbtnAGREGAR_PEDIDO.setBounds(40, 300, 150, 40);

        jbtnELIMINAR_FILA.setBackground(new java.awt.Color(0, 123, 255));
        jbtnELIMINAR_FILA.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jbtnELIMINAR_FILA.setForeground(new java.awt.Color(0, 0, 0));
        jbtnELIMINAR_FILA.setText("Eliminar fila");
        jbtnELIMINAR_FILA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbtnELIMINAR_FILA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnELIMINAR_FILAActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnELIMINAR_FILA);
        jbtnELIMINAR_FILA.setBounds(240, 300, 150, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venta/registro-en-linea (1).png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 40, 260, 256);

        jbtnGENERAR_BOLETA.setBackground(new java.awt.Color(0, 123, 255));
        jbtnGENERAR_BOLETA.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jbtnGENERAR_BOLETA.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGENERAR_BOLETA.setText("Generar boleta");
        jbtnGENERAR_BOLETA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbtnGENERAR_BOLETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGENERAR_BOLETAActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGENERAR_BOLETA);
        jbtnGENERAR_BOLETA.setBounds(120, 470, 150, 40);

        jbtnSALIR.setBackground(new java.awt.Color(0, 123, 255));
        jbtnSALIR.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jbtnSALIR.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSALIR.setText("Salir");
        jbtnSALIR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbtnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSALIRActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSALIR);
        jbtnSALIR.setBounds(370, 470, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNOMBREActionPerformed

    private void jbtnAGREGAR_PEDIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAGREGAR_PEDIDOActionPerformed
        // TODO add your handling code here:
        int confirmacion;
        String nombre = jtxtNOMBRE.getText();
        int DNI = Integer.valueOf(jtxtDNI.getText());
        int telefono = Integer.valueOf(jtxtTELEFONO.getText());
        int unidades = Integer.valueOf(jtxtUNIDADES.getText());
        String nombre_producto = jcbxPRODUCTO.getSelectedItem().toString();
        clases.producto p = new clases.producto(telefono, nombre_producto, DNI, unidades, nombre);
        modelo.addRow(new Object[]{nombre, DNI, telefono, nombre_producto, p.getMarca(), unidades});
        clases.cliente c = new clases.cliente(nombre, DNI, telefono);
        String arreglo[]={"Si","No"};
        confirmacion = JOptionPane.showOptionDialog(null,"¿Desea mantener al mismo cliente?","elige una opcion",0,JOptionPane.QUESTION_MESSAGE,null,arreglo,"Si");
        if (confirmacion==1) {
            jtxtNOMBRE.setText(nombre);
            jtxtTELEFONO.setText("" + c.getTelefono());
            jtxtDNI.setText("" + c.getDNI());
            jcbxPRODUCTO.setSelectedItem(0);
            jtxtUNIDADES.setText("");
        } else if (confirmacion==2) {
            jtxtTELEFONO.setText("");
            jtxtDNI.setText("");
            jcbxPRODUCTO.setSelectedItem(0);
            jtxtNOMBRE.setText("");
            jtxtUNIDADES.setText("");
        }

    }//GEN-LAST:event_jbtnAGREGAR_PEDIDOActionPerformed

    private void jbtnELIMINAR_FILAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnELIMINAR_FILAActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            modelo.removeRow(jTable1.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_jbtnELIMINAR_FILAActionPerformed

    private void jbtnELIMINAR_TODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnELIMINAR_TODOActionPerformed
        int cant = jTable1.getRowCount();
        for (int i = cant - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_jbtnELIMINAR_TODOActionPerformed

    private void jbtnGENERAR_BOLETAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGENERAR_BOLETAActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jbtnGENERAR_BOLETAActionPerformed

    private void jbtnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSALIRActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAGREGAR_PEDIDO;
    private javax.swing.JButton jbtnELIMINAR_FILA;
    private javax.swing.JButton jbtnELIMINAR_TODO;
    private javax.swing.JButton jbtnGENERAR_BOLETA;
    private javax.swing.JButton jbtnSALIR;
    private javax.swing.JComboBox<String> jcbxPRODUCTO;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtNOMBRE;
    private javax.swing.JTextField jtxtTELEFONO;
    private javax.swing.JTextField jtxtUNIDADES;
    private javax.swing.JScrollPane tabla;
    // End of variables declaration//GEN-END:variables
}
