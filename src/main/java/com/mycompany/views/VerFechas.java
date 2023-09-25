package com.mycompany.views;

import com.mycompany.intefaces.DAOEventos;
import com.mycompany.sistemadeestudiantes.DAOEventosImpl;
import javax.swing.table.DefaultTableModel;

public class VerFechas extends javax.swing.JPanel {

    public VerFechas() {
        initComponents();
        initStyles();
        cargarEventos();
    }

    private void initStyles() {
        btnAgregar.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");
        btnEditar.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");
        btnEliminar.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");
    }

    private void cargarEventos() {
        try {
            DAOEventos dao = new DAOEventosImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listarEventos("").forEach((i) -> {
                model.addRow(new Object[]{i.getNombreEvento(), i.getFechaEvento()});
            });
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al cargar los eventos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        tablaEventos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(52, 52, 52));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Evento", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaEventos.setViewportView(jTable1);

        bg.add(tablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 620, 270));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Evento");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 150, 50));

        btnAgregar.setBackground(new java.awt.Color(255, 153, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Evento");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 50));

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Evento");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        bg.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (jTable1.getSelectedRow() < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Elija al menos un evento a borrar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DAOEventos dao = new DAOEventosImpl();
                String nombreEvento = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                javax.swing.JOptionPane.showMessageDialog(this, "Evento(s) borrado(s) con éxito. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                dao.eliminarEvento(nombreEvento);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al borrar el evento. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        MenuPrincipalJFrame.mostrarJPanel(new AgregarEventoJPanel());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (jTable1.getSelectedRow() < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Elija un evento a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DAOEventos dao = new DAOEventosImpl();
                String nombreEvento = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                MenuPrincipalJFrame.mostrarJPanel(new AgregarEventoJPanel(dao.buscarEvento(nombreEvento)));
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al editar el evento. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tablaEventos;
    // End of variables declaration//GEN-END:variables
}
