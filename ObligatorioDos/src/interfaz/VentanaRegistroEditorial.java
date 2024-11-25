
/*
    Autores:
    Mateo Franciulli 310956
    Ivan Castelli 306188
 */

package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaRegistroEditorial extends javax.swing.JFrame implements Observer {
    
    
    private DefaultListModel<String> liEditorialesIngresadasModel = new DefaultListModel<>();
    private DefaultListModel<String> liPaisEditorialRegistradaModel = new DefaultListModel<>();
    private Modelo modelo;
    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroEditorial(Modelo modelo) {
        this.modelo = modelo; 
        initComponents();
        liEditorialesIngresadas.setModel(liEditorialesIngresadasModel);
        liPaisEditorialRegistrada.setModel(liPaisEditorialRegistradaModel);
        cargarEditoriales();
        modelo.addObserver(this); // Añadir la ventana como observador
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistroEditorial = new javax.swing.JLabel();
        lblNombreEditorial = new javax.swing.JLabel();
        lblPaisEditorial = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        txtPaisEditorial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        liEditorialesIngresadas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        liPaisEditorialRegistrada = new javax.swing.JList<>();
        lblEditorialesRegistradas = new javax.swing.JLabel();
        jbIngresarEditorial = new javax.swing.JButton();

        setTitle("Registro de Editorial");

        lblRegistroEditorial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegistroEditorial.setText("Registro de editorial ");
        lblRegistroEditorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNombreEditorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreEditorial.setText("Nombre de editorial :");
        lblNombreEditorial.setFocusable(false);

        lblPaisEditorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaisEditorial.setText("País de la editorial :");
        lblPaisEditorial.setFocusable(false);

        txtNombreEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditorialActionPerformed(evt);
            }
        });

        txtPaisEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisEditorialActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(liEditorialesIngresadas);

        jScrollPane2.setViewportView(liPaisEditorialRegistrada);

        lblEditorialesRegistradas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEditorialesRegistradas.setText("Editoriales registradas:");
        lblEditorialesRegistradas.setFocusable(false);

        jbIngresarEditorial.setText("Ingresar");
        jbIngresarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditorialesRegistradas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblPaisEditorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEditorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPaisEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistroEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(jbIngresarEditorial)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRegistroEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaisEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaisEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIngresarEditorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditorialesRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void cargarEditoriales() {
        liEditorialesIngresadasModel.clear();
        liPaisEditorialRegistradaModel.clear();
        for (Editorial editorial : modelo.getEditoriales()) {
            liEditorialesIngresadasModel.addElement(editorial.getNombre());
            liPaisEditorialRegistradaModel.addElement(editorial.getPais());
        }
    }

  @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Editorial) {
            Editorial editorial = (Editorial) arg;
            liEditorialesIngresadasModel.addElement(editorial.getNombre());
            liPaisEditorialRegistradaModel.addElement(editorial.getPais());
        }
    }

    
    private void jbIngresarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarEditorialActionPerformed
        String nombre = this.txtNombreEditorial.getText();
        String pais = this.txtPaisEditorial.getText();

        if (!modelo.verificoEditorial(nombre)) {
            JOptionPane.showMessageDialog(null, "Nombre ya registrado, por favor registre uno válido.");
        } else if (!pais.matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(null,"Los datos solo admiten letras, ingrese datos válidos");
        } else if (nombre.length() == 0 || pais.length() == 0) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
        } else {
            Editorial editorial = new Editorial(nombre, pais);
            modelo.agregarEditorial(editorial);
            JOptionPane.showMessageDialog(null, "Nueva Editorial creada:\n" + editorial);
            
        }

        txtNombreEditorial.setText("");
        txtPaisEditorial.setText("");
        

    }//GEN-LAST:event_jbIngresarEditorialActionPerformed

    private void txtNombreEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditorialActionPerformed
        
    }//GEN-LAST:event_txtNombreEditorialActionPerformed

    private void txtPaisEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisEditorialActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbIngresarEditorial;
    private javax.swing.JLabel lblEditorialesRegistradas;
    private javax.swing.JLabel lblNombreEditorial;
    private javax.swing.JLabel lblPaisEditorial;
    private javax.swing.JLabel lblRegistroEditorial;
    private javax.swing.JList<String> liEditorialesIngresadas;
    private javax.swing.JList<String> liPaisEditorialRegistrada;
    private javax.swing.JTextField txtNombreEditorial;
    private javax.swing.JTextField txtPaisEditorial;
    // End of variables declaration//GEN-END:variables

}
