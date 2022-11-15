/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Services.TelefonoService;
import classes.Telefono;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shajinder
 */
public class DarDeAltaTelefono extends javax.swing.JFrame {

    /**
     * Creates new form DarDeAltaTelefono
    
     */
    
    private TelefonoService telefonoService;
    public DarDeAltaTelefono() {
        initComponents();
        this.telefonoService = new TelefonoService();
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
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();
        jButtonCrearTelefono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(1, 21, 48));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 21, 48));
        jLabel1.setText("Dar de alta un teléfono ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 610, 110));

        jTextFieldNombre.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 219, 219)));
        jTextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNombreMouseClicked(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 270, 40));

        jTextFieldPrecio.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPrecio.setText("Precio");
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 219, 219)));
        jTextFieldPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPrecioMouseClicked(evt);
            }
        });
        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 270, 40));

        jTextFieldStock.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldStock.setText("Stock");
        jTextFieldStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 219, 219)));
        jTextFieldStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldStockMouseClicked(evt);
            }
        });
        jPanel1.add(jTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 270, 40));

        jTextFieldPeso.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPeso.setText("Peso");
        jTextFieldPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 219, 219)));
        jTextFieldPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPesoMouseClicked(evt);
            }
        });
        jPanel1.add(jTextFieldPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 270, 40));

        jButtonVolver.setBackground(new java.awt.Color(1, 21, 48));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("Volver");
        jButtonVolver.setAlignmentX(0.5F);
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 170, 50));

        jButtonCrearTelefono.setBackground(new java.awt.Color(1, 21, 48));
        jButtonCrearTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCrearTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrearTelefono.setText("Crear telefono");
        jButtonCrearTelefono.setAlignmentX(0.5F);
        jButtonCrearTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCrearTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCrearTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMouseClicked
        // TODO add your handling code here:
        jTextFieldNombre.setText("");
    }//GEN-LAST:event_jTextFieldNombreMouseClicked

    private void jTextFieldPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPrecioMouseClicked
        // TODO add your handling code here:
        jTextFieldPrecio.setText("");
    }//GEN-LAST:event_jTextFieldPrecioMouseClicked

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
        jTextFieldPrecio.setText("");
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStockMouseClicked

    private void jTextFieldPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesoMouseClicked
        // TODO add your handling code here:
        jTextFieldPeso.setText("");
    }//GEN-LAST:event_jTextFieldPesoMouseClicked

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCrearTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearTelefonoActionPerformed
        // TODO add your handling code here:
        String nombre = jTextFieldNombre.getText();
        int stock = Integer.valueOf(jTextFieldStock.getText());
        float peso = Float.valueOf(jTextFieldPeso.getText());
        float precio = Float.valueOf(jTextFieldPrecio.getText());
        LocalDate fechaAlta = LocalDate.now();
        Telefono telefono = new Telefono(nombre, precio, stock, peso);
        telefono.setFechaDeAlta(fechaAlta);
        System.out.println(telefono.getFechaDeAlta());
        try {
            this.telefonoService.insertarTelefono(telefono);
        } catch (SQLException ex) {
            Logger.getLogger(DarDeAltaTelefono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DarDeAltaTelefono.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCrearTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(DarDeAltaTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarDeAltaTelefono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearTelefono;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
