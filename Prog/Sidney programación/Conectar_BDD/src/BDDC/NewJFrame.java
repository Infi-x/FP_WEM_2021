/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dedei
 */
public class NewJFrame extends javax.swing.JFrame {

    Acceso_BDD base;

    public NewJFrame() {
        this.setLocationRelativeTo(null);
        base = new Acceso_BDD();
        initComponents();
        select.add(contactos);
        select.add(correos);
        select.add(telefonos);
        select.add(consulta);
        select.add(insertar);
        select.add(updates);
        select.add(deletes);
        this.busqueda.setEnabled(false);
        this.consulta.setEnabled(false);
        this.contactos.setEnabled(false);
        this.telefonos.setEnabled(false);
        this.correos.setEnabled(false);
        this.insertar.setEnabled(false);
        this.ejecutar.setEnabled(false);
        this.tablasI.setEnabled(false);
        this.updates.setEnabled(false);
        this.deletes.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        select = new javax.swing.ButtonGroup();
        Boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextPane();
        Salir = new javax.swing.JButton();
        ejecutar = new javax.swing.JButton();
        contactos = new javax.swing.JRadioButton();
        correos = new javax.swing.JRadioButton();
        consulta = new javax.swing.JRadioButton();
        insertar = new javax.swing.JRadioButton();
        telefonos = new javax.swing.JRadioButton();
        tablasI = new javax.swing.JComboBox<>();
        updates = new javax.swing.JRadioButton();
        busqueda = new javax.swing.JTextField();
        deletes = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agenda");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        Boton.setText("Iniciar");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        Texto.setEditable(false);
        jScrollPane1.setViewportView(Texto);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        ejecutar.setText("Realizar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        contactos.setText("Contactos");
        contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactosActionPerformed(evt);
            }
        });

        correos.setText("Correos");
        correos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correosActionPerformed(evt);
            }
        });

        consulta.setText("Consulta Ex.");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        insertar.setText("Insertar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        telefonos.setText("Telefonos");
        telefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonosActionPerformed(evt);
            }
        });

        tablasI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Contactos", "Correos", "Telefonos", " " }));

        updates.setText("Actualizar Datos");
        updates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesActionPerformed(evt);
            }
        });

        deletes.setText("Borrar registro");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactos)
                            .addComponent(correos)
                            .addComponent(telefonos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consulta)
                            .addComponent(insertar)
                            .addComponent(updates))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tablasI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ejecutar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(deletes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton)
                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contactos)
                        .addComponent(consulta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tablasI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ejecutar))
                    .addComponent(insertar)
                    .addComponent(correos))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(telefonos)
                    .addComponent(updates)
                    .addComponent(deletes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        LogIn log = new LogIn(this, true);
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        String nombre = log.getUser();
        String contra = log.getContra();
        if (nombre.equalsIgnoreCase("No") || contra.equalsIgnoreCase("No")) {
            Texto.setText("Vuelva a intentarlo");
        } else {
            base.setUser(nombre);
            base.setPass(contra);
            Texto.setText(base.Conectar());
            if (Texto.getText().toString().equalsIgnoreCase("Conexion establecida")) {
                this.consulta.setEnabled(true);
                this.contactos.setEnabled(true);
                this.telefonos.setEnabled(true);
                this.correos.setEnabled(true);
                this.insertar.setEnabled(true);
                this.ejecutar.setEnabled(true);
                this.updates.setEnabled(true);
                this.deletes.setEnabled(true);
            }

        }

    }//GEN-LAST:event_BotonActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        if (base.isEstado()) {
            base.cerrar();
        }
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        this.busqueda.setEnabled(true);
        this.tablasI.setEnabled(false);

    }//GEN-LAST:event_consultaActionPerformed

    private void telefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonosActionPerformed
        this.busqueda.setEnabled(false);
        this.tablasI.setEnabled(false);

    }//GEN-LAST:event_telefonosActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        this.tablasI.setEnabled(true);
        this.busqueda.setEnabled(false);

    }//GEN-LAST:event_insertarActionPerformed

    private void correosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correosActionPerformed
        this.busqueda.setEnabled(false);
        this.tablasI.setEnabled(false);

    }//GEN-LAST:event_correosActionPerformed

    private void contactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactosActionPerformed
        this.busqueda.setEnabled(false);
        this.tablasI.setEnabled(false);

    }//GEN-LAST:event_contactosActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        if (contactos.isSelected()) {
            Texto.setText(base.hacerConsultaContactos());
        } else if (correos.isSelected()) {
            Texto.setText(base.hacerConsultaCorreos());
        } else if (telefonos.isSelected()) {
            Texto.setText(base.hacerConsultaTelefonos());
        } else if (this.insertar.isSelected()) {
            if (this.tablasI.getSelectedItem().toString().equalsIgnoreCase("Seleccione")) {
                Texto.setText("Por favor, selecione una opción");
            } else {
                realizarInsert();
            }
        } else if (consulta.isSelected()) {
            String aux = base.ConsultaPorPersona(this.busqueda.getText().toString());
            Texto.setText(aux);
        } else if (updates.isSelected()) {
            this.realizarUpdate();
            //JOptionPane.showMessageDialog(null, "Opción aun no disponible", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else if (deletes.isSelected()) {
            this.realizarDelete();
            //JOptionPane.showMessageDialog(null, "Opción aun no disponible", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Texto.setText("Por favor, selecione una opción");
        }
        busqueda.setText("");
        select.clearSelection();
        tablasI.setEnabled(false);
        busqueda.setEnabled(false);

    }//GEN-LAST:event_ejecutarActionPerformed

    private void updatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesActionPerformed
        this.tablasI.setEnabled(false);
        this.busqueda.setEnabled(false);
    }//GEN-LAST:event_updatesActionPerformed

    private void deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesActionPerformed
        this.tablasI.setEnabled(false);
        this.busqueda.setEnabled(false);
    }//GEN-LAST:event_deletesActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden
    private void realizarInsert() {
        String tabla = this.tablasI.getSelectedItem().toString();
        Inserts inser = new Inserts(tabla, base);
        inser.setLocationRelativeTo(null);
        inser.setVisible(true);
        base = inser.getCon();
        Texto.setText("");
    }

    private void realizarUpdate() {
        updates up = new updates(this, true, base);
        up.setLocationRelativeTo(null);
        up.setVisible(true);
        base = up.getCon();
        Texto.setText("");
    }

    private void realizarDelete() {
        deletes del = new deletes(this, true, base);
        del.setLocationRelativeTo(null);
        del.setVisible(true);
        base = del.getCon();
        Texto.setText("");
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame el = new NewJFrame();
                el.setVisible(true);
                el.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JButton Salir;
    private javax.swing.JTextPane Texto;
    private javax.swing.JTextField busqueda;
    private javax.swing.JRadioButton consulta;
    private javax.swing.JRadioButton contactos;
    private javax.swing.JRadioButton correos;
    private javax.swing.JRadioButton deletes;
    private javax.swing.JButton ejecutar;
    private javax.swing.JRadioButton insertar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup select;
    private javax.swing.JComboBox<String> tablasI;
    private javax.swing.JRadioButton telefonos;
    private javax.swing.JRadioButton updates;
    // End of variables declaration//GEN-END:variables
}
