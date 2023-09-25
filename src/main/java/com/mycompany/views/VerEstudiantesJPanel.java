package com.mycompany.views;

import com.mycompany.sistemadeestudiantes.DAOEstudianteImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.intefaces.DAOEstudiante;
import java.util.ArrayList;
import java.util.List;

public class VerEstudiantesJPanel extends javax.swing.JPanel {

    boolean maestro = false;

    public VerEstudiantesJPanel() {
        initComponents();
        cargarEstudiantes();
        initStyles();
    }

    public VerEstudiantesJPanel(int num) {
        maestro = true;
        initComponents();
        cargarEstudiantes();
        initStyles();
    }

    private void cargarEstudiantes() {
        try {
            DAOEstudiante dao = new DAOEstudianteImpl();
            DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
            model.setRowCount(0);
            int notaGeneral1 = dao.calcularPromedioPorParcial("", 1);
            int notaGeneral2 = dao.calcularPromedioPorParcial("", 2);
            int notaGeneral3 = dao.calcularPromedioPorParcial("", 3);
            int notaGeneral4 = dao.calcularPromedioPorParcial("", 4);
            int notaGeneral = (notaGeneral1 + notaGeneral2 + notaGeneral3 + notaGeneral4) / 4;

            dao.listar("").forEach((i) -> model.addRow(new Object[]{i.getId(), i.getNombre(), i.getApellidoPaterno(), i.getApellidoMaterno(), i.getGrado(), notaGeneral, i.getEncargado(), i.getTelEncargado(), i.getObservacionMedica()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void initStyles() {
        btnBuscar.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        btnBorrar.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        barraBusqueda.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del estudiante a buscar.");
        btnEditar.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        barraBusqueda = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        background.setBackground(new java.awt.Color(52, 52, 52));

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido P.", "Apellido M.", "Grado", "Nota General", "Encargado", "Tel. Encargado", "Observación Med."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEstudiantes);
        if (tablaEstudiantes.getColumnModel().getColumnCount() > 0) {
            tablaEstudiantes.getColumnModel().getColumn(4).setMaxWidth(80);
            tablaEstudiantes.getColumnModel().getColumn(5).setMaxWidth(110);
        }

        barraBusqueda.setBackground(new java.awt.Color(52, 52, 52));
        barraBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        barraBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        barraBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 153, 0));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void barraBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBusquedaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        if (maestro) {
            javax.swing.JOptionPane.showMessageDialog(this, "No tiene los permisos para borrar estudiantes. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            DAOEstudiante dao = new DAOEstudianteImpl();
            DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();

            if (tablaEstudiantes.getSelectedRows().length < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Selecciona al menos una fila chinchulin. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                List<Integer> rowsToRemove = new ArrayList<>();

                for (int i : tablaEstudiantes.getSelectedRows()) {
                    Object[] options = {"Sí", "No."};
                    int n = JOptionPane.showOptionDialog(this, "¿Confirma eliminar al/los estudiante(s)?\n ", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    if (n == JOptionPane.YES_OPTION) {
                        try {
                            dao.eliminar((String) tablaEstudiantes.getValueAt(i, 0));
                            rowsToRemove.add(i);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }

                for (int i = rowsToRemove.size() - 1; i >= 0; i--) {
                    model.removeRow(rowsToRemove.get(i));
                }
            }
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            String id = barraBusqueda.getText();
            DAOEstudiante dao = new DAOEstudianteImpl();
            DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
            model.setRowCount(0);

            int notaGeneral1 = dao.calcularPromedioPorParcial(id, 1);
            int notaGeneral2 = dao.calcularPromedioPorParcial(id, 2);
            int notaGeneral3 = dao.calcularPromedioPorParcial(id, 3);
            int notaGeneral4 = dao.calcularPromedioPorParcial(id, 4);
            int notaGeneral = (notaGeneral1 + notaGeneral2 + notaGeneral3 + notaGeneral4) / 4;
            dao.listar(id).forEach((i) -> model.addRow(new Object[]{i.getId(), i.getNombre(), i.getApellidoPaterno(), i.getApellidoMaterno(), i.getGrado(), notaGeneral, i.getEncargado(), i.getTelEncargado(), i.getObservacionMedica()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (maestro) {
            javax.swing.JOptionPane.showMessageDialog(this, "No tiene los permisos para editar estudiantes. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            String estudianteId = (String) tablaEstudiantes.getValueAt(tablaEstudiantes.getSelectedRow(), 0);
            if (tablaEstudiantes.getSelectedRow() < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el alumno a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    DAOEstudiante dao = new DAOEstudianteImpl();
                    MenuPrincipalJFrame.mostrarJPanel(new MatricularEstudiantesJPanel(dao.buscar(estudianteId)));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }


    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
