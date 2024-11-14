/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Modelo;

/**
 *
 * @author Usuario
 */
public class VentanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu() {
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

        jmbBarraMenu = new javax.swing.JMenuBar();
        jmRegistro = new javax.swing.JMenu();
        jitemRegistroEditorial = new javax.swing.JMenuItem();
        jItemRegistroGenero = new javax.swing.JMenuItem();
        jItemRegistroAutor = new javax.swing.JMenuItem();
        jItemRegistroLibro = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmRegistrarVenta = new javax.swing.JMenuItem();
        jmAnularVenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmConsultaVentas = new javax.swing.JMenuItem();
        jmConsultaLibros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de librerías - Realizado por: Mateo Franciulli 310956, Iván Castelli 306188");

        jmRegistro.setText("Registros");
        jmRegistro.setActionCommand("Registro");

        jitemRegistroEditorial.setText("Registro Editorial");
        jitemRegistroEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitemRegistroEditorialActionPerformed(evt);
            }
        });
        jmRegistro.add(jitemRegistroEditorial);

        jItemRegistroGenero.setText("Registro Género");
        jItemRegistroGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRegistroGeneroActionPerformed(evt);
            }
        });
        jmRegistro.add(jItemRegistroGenero);

        jItemRegistroAutor.setText("Registro Autor");
        jItemRegistroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRegistroAutorActionPerformed(evt);
            }
        });
        jmRegistro.add(jItemRegistroAutor);

        jItemRegistroLibro.setText("Registro Libro");
        jItemRegistroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRegistroLibroActionPerformed(evt);
            }
        });
        jmRegistro.add(jItemRegistroLibro);

        jmbBarraMenu.add(jmRegistro);

        jMenu5.setText("Ventas");

        jmRegistrarVenta.setText("Registrar Venta");
        jmRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jmRegistrarVenta);

        jmAnularVenta.setText("Anular Venta");
        jmAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAnularVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jmAnularVenta);

        jmbBarraMenu.add(jMenu5);

        jMenu6.setText("Consultas");

        jmConsultaVentas.setText("Consulta de Ventas");
        jmConsultaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaVentasActionPerformed(evt);
            }
        });
        jMenu6.add(jmConsultaVentas);

        jmConsultaLibros.setText("Consulta de Libros");
        jmConsultaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaLibrosActionPerformed(evt);
            }
        });
        jMenu6.add(jmConsultaLibros);

        jmbBarraMenu.add(jMenu6);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jitemRegistroEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitemRegistroEditorialActionPerformed
    Modelo modelo = new Modelo(); 
    VentanaRegistroEditorial ventana = new VentanaRegistroEditorial();
    ventana.setVisible(true);

    }//GEN-LAST:event_jitemRegistroEditorialActionPerformed

    private void jItemRegistroGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRegistroGeneroActionPerformed
        VentanaRegistroGenero ventana = new VentanaRegistroGenero();
        ventana.setVisible(true);
    }//GEN-LAST:event_jItemRegistroGeneroActionPerformed

    private void jItemRegistroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRegistroAutorActionPerformed
        VentanaRegistroAutor ventana = new VentanaRegistroAutor();
        ventana.setVisible(true);
    }//GEN-LAST:event_jItemRegistroAutorActionPerformed

    private void jItemRegistroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRegistroLibroActionPerformed
        VentanaRegistroLibro ventana = new VentanaRegistroLibro();
        ventana.setVisible(true);
    }//GEN-LAST:event_jItemRegistroLibroActionPerformed

    private void jmRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarVentaActionPerformed
        VentanaRegistrarVentas ventana = new VentanaRegistrarVentas();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmRegistrarVentaActionPerformed

    private void jmAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAnularVentaActionPerformed
        VentanaAnularVenta ventana = new VentanaAnularVenta();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmAnularVentaActionPerformed

    private void jmConsultaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaLibrosActionPerformed
        VentanaConsultaLibros ventana = new VentanaConsultaLibros();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmConsultaLibrosActionPerformed

    private void jmConsultaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaVentasActionPerformed
       VentanaConsultaVentas ventana = new VentanaConsultaVentas();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmConsultaVentasActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jItemRegistroAutor;
    private javax.swing.JMenuItem jItemRegistroGenero;
    private javax.swing.JMenuItem jItemRegistroLibro;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jitemRegistroEditorial;
    private javax.swing.JMenuItem jmAnularVenta;
    private javax.swing.JMenuItem jmConsultaLibros;
    private javax.swing.JMenuItem jmConsultaVentas;
    private javax.swing.JMenuItem jmRegistrarVenta;
    private javax.swing.JMenu jmRegistro;
    private javax.swing.JMenuBar jmbBarraMenu;
    // End of variables declaration//GEN-END:variables
}
