/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Modelo;
import java.awt.Image;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class VentanaRegistroLibro extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroLibro(Modelo modelo) {
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

        jLabel1 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        lblRegistroEditorial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liEditorialesLibro = new javax.swing.JList<>();
        lblEditorialLibro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        liGenerosLibro = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        liAutoresLibro = new javax.swing.JList<>();
        lblGeneroLibro = new javax.swing.JLabel();
        lblAutorLibro = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblPrecioCosto = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtIsbn1 = new javax.swing.JTextField();
        txtPrecioCosto1 = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        lblEjemplares = new javax.swing.JLabel();
        txtEjemplares = new javax.swing.JTextField();
        jbIngresarLibro = new javax.swing.JButton();
        labelFoto = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setTitle("Registro de Libro");

        lblRegistroEditorial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegistroEditorial.setText("Registro de Libro");
        lblRegistroEditorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setViewportView(liEditorialesLibro);

        lblEditorialLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEditorialLibro.setText("Editorial:");
        lblEditorialLibro.setFocusable(false);

        jScrollPane3.setViewportView(liGenerosLibro);

        jScrollPane4.setViewportView(liAutoresLibro);

        lblGeneroLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGeneroLibro.setText("Género :");
        lblGeneroLibro.setFocusable(false);

        lblAutorLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAutorLibro.setText("Autor :");
        lblAutorLibro.setFocusable(false);

        lblPrecioVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioVenta.setText("Precio de venta :");
        lblPrecioVenta.setFocusable(false);

        lblPrecioCosto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioCosto.setText("Precio de costo :");
        lblPrecioCosto.setFocusable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setText("Título :");
        lblTitulo.setFocusable(false);

        lblIsbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIsbn.setText("isbn :");
        lblIsbn.setFocusable(false);

        txtIsbn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbn1ActionPerformed(evt);
            }
        });

        txtPrecioCosto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCosto1ActionPerformed(evt);
            }
        });

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        lblFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFoto.setText("Foto :");
        lblFoto.setFocusable(false);

        btnFoto.setText("Seleccionar Foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        lblEjemplares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEjemplares.setText("Cantidad de ejemplares :");
        lblEjemplares.setFocusable(false);

        txtEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEjemplaresActionPerformed(evt);
            }
        });

        jbIngresarLibro.setText("Ingresar");

        labelFoto.setText("        Sin Foto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblRegistroEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEditorialLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGeneroLibro)
                        .addGap(123, 123, 123)
                        .addComponent(lblAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIsbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEjemplares)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEjemplares)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbIngresarLibro)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRegistroEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIsbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIngresarLibro)
                    .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsbn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbn1ActionPerformed

    private void txtPrecioCosto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCosto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCosto1ActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void txtEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEjemplaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEjemplaresActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));

        int resultado = selectorArchivo.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = selectorArchivo.getSelectedFile();
            ImageIcon iconoImagen = new ImageIcon(archivoSeleccionado.getAbsolutePath());

            Image imagen = iconoImagen.getImage();
            Image imagenEscalada = imagen.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
            labelFoto.setIcon(new ImageIcon(imagenEscalada));
            labelFoto.setText("");
        }

    }//GEN-LAST:event_btnFotoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbIngresarLibro;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel lblAutorLibro;
    private javax.swing.JLabel lblEditorialLibro;
    private javax.swing.JLabel lblEjemplares;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGeneroLibro;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblPrecioCosto;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblRegistroEditorial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> liAutoresLibro;
    private javax.swing.JList<String> liEditorialesLibro;
    private javax.swing.JList<String> liGenerosLibro;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtIsbn1;
    private javax.swing.JTextField txtPrecioCosto1;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
