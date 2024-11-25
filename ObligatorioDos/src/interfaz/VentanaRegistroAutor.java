/*
    Autores:
    Mateo Franciulli 310956
    Ivan Castelli 306188
 */

package interfaz;

import dominio.Autor;
import dominio.Genero;
import dominio.Modelo;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class VentanaRegistroAutor extends javax.swing.JFrame implements Observer{

    private DefaultListModel<String> liGenerosAutorModel = new DefaultListModel<>();
    private DefaultListModel<String> liAutoresRegistradosModel = new DefaultListModel<>();
    private Modelo modelo;
    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroAutor(Modelo modelo) {
        this.modelo = modelo;
        initComponents();
        liGenerosAutor.setModel(liGenerosAutorModel);
        liAutoresRegistrados.setModel(liAutoresRegistradosModel);
        liGenerosAutor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        cargarAutores();
        cargarGeneros();
        modelo.addObserver(this);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lblRegistroAutor = new javax.swing.JLabel();
        lblNombreAutor = new javax.swing.JLabel();
        lblPaisAutor = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        txtNacionalidadAutor = new javax.swing.JTextField();
        lblGenerosAutor = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        liAutoresRegistrados = new javax.swing.JList<>();
        lblPaisAutor1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        liGenerosAutor = new javax.swing.JList<>();
        jbIngresarAutor = new javax.swing.JButton();

        setTitle("Registro de Autor");

        lblRegistroAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegistroAutor.setText("Registro de autor");
        lblRegistroAutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNombreAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreAutor.setText("Nombre del autor :");
        lblNombreAutor.setFocusable(false);

        lblPaisAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaisAutor.setText("Nacionalidad :");
        lblPaisAutor.setFocusable(false);

        txtNombreAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAutorActionPerformed(evt);
            }
        });

        lblGenerosAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGenerosAutor.setText("Géneros:");
        lblGenerosAutor.setFocusable(false);

        jScrollPane3.setViewportView(liAutoresRegistrados);

        lblPaisAutor1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPaisAutor1.setText("Autores registrados:");
        lblPaisAutor1.setFocusable(false);

        jScrollPane4.setViewportView(liGenerosAutor);

        jbIngresarAutor.setText("Ingresar");
        jbIngresarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblRegistroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPaisAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNacionalidadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbIngresarAutor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblGenerosAutor)
                                    .addGap(207, 207, 207)
                                    .addComponent(lblPaisAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRegistroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaisAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIngresarAutor))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenerosAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaisAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAutorActionPerformed
     private void cargarGeneros() {
        liGenerosAutorModel.clear();
        for (Genero genero : modelo.getGeneros()) {
            liGenerosAutorModel.addElement(genero.getNombre());
        }
    }
     
   private void cargarAutores() {
    liAutoresRegistradosModel.clear();
    for (Autor autor : modelo.getAutores()) {
        liAutoresRegistradosModel.addElement(autor.getNombre());
    }
}
    
    
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Autor) {
            cargarAutores();
        }
    }
    private void jbIngresarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarAutorActionPerformed
        String nombre = this.txtNombreAutor.getText();
        String nacionalidad = this.txtNacionalidadAutor.getText();
        List<String> seleccion = liGenerosAutor.getSelectedValuesList();
        ArrayList<Genero> generosSeleccionados = new ArrayList<>();

        for (String generoNombre : seleccion) {
            Genero genero = modelo.obtenerGeneroPorNombre(generoNombre);
            if (genero != null) {
                generosSeleccionados.add(genero);
            }
        }

        if (!modelo.verificoAutores(nombre)) {
            JOptionPane.showMessageDialog(null, "Nombre ya registrado, por favor registre uno válido.");
        } else if (!nombre.matches("[a-zA-Z ]+") || !nacionalidad.matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(null, "Los datos solo admiten letras, ingrese datos válidos");
        } else if (nombre.length() == 0 || nacionalidad.length() == 0) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
        } else if (generosSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione los géneros del autor.");
        } else {
            Autor autor = new Autor(nombre, nacionalidad, generosSeleccionados);
            modelo.agregarAutor(autor);
            cargarAutores();
            JOptionPane.showMessageDialog(null, "Autor añadido:\n" + autor);
        }
        
        // vacío campos
        txtNombreAutor.setText("");
        txtNacionalidadAutor.setText("");
    }//GEN-LAST:event_jbIngresarAutorActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbIngresarAutor;
    private javax.swing.JLabel lblGenerosAutor;
    private javax.swing.JLabel lblNombreAutor;
    private javax.swing.JLabel lblPaisAutor;
    private javax.swing.JLabel lblPaisAutor1;
    private javax.swing.JLabel lblRegistroAutor;
    private javax.swing.JList<String> liAutoresRegistrados;
    private javax.swing.JList<String> liGenerosAutor;
    private javax.swing.JTextField txtNacionalidadAutor;
    private javax.swing.JTextField txtNombreAutor;
    // End of variables declaration//GEN-END:variables

   
}
