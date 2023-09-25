package com.mycompany.views;

import com.mycompany.sistemadeestudiantes.DAOEstudianteImpl;
import javax.swing.table.DefaultTableModel;
import com.mycompany.intefaces.DAOEstudiante;
import com.mycompany.modelos.Notas;
import java.util.List;

/**
 *
 * @author nbmmll nnnnn
 */
public class VerCalificacionesTercerParcial extends javax.swing.JPanel {

    public VerCalificacionesTercerParcial() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        barraBusqueda.putClientProperty("JTextField.placeholderText", "Ingrese la identidad del estudiante a buscar.");
        btnEditar.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        barraBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        background.setBackground(new java.awt.Color(52, 52, 52));
        background.setPreferredSize(new java.awt.Dimension(750, 430));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identidad Estudiante", "Materia", "Nota", "Parcial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaNotas);
        if (tablaNotas.getColumnModel().getColumnCount() > 0) {
            tablaNotas.getColumnModel().getColumn(0).setHeaderValue("Identidad Estudiante");
            tablaNotas.getColumnModel().getColumn(1).setHeaderValue("Materia");
            tablaNotas.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaNotas.getColumnModel().getColumn(2).setHeaderValue("Nota");
            tablaNotas.getColumnModel().getColumn(3).setMaxWidth(100);
            tablaNotas.getColumnModel().getColumn(3).setHeaderValue("Parcial");
        }

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 750, 150));

        barraBusqueda.setBackground(new java.awt.Color(52, 52, 52));
        barraBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        barraBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        barraBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaActionPerformed(evt);
            }
        });
        background.add(barraBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 460, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        background.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 110, 40));

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        background.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 110, 40));

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido P.", "Apellido M.", "Grado", "Nota General"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEstudiantes);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 110));

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            String id = barraBusqueda.getText();
            DAOEstudiante dao = new DAOEstudianteImpl();
            DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
            DefaultTableModel model2 = (DefaultTableModel) tablaNotas.getModel();
            model.setRowCount(0);
            model2.setRowCount(0);
            int notaGeneral = dao.calcularPromedioPorParcial(id, 3);

            dao.listar(id).forEach((i) -> model.addRow(new Object[]{i.getNombre(), i.getApellidoPaterno(), i.getApellidoMaterno(), i.getGrado(), notaGeneral}));

            List<Notas> notas = dao.listarNotas(id, 3);

            for (int i = 0; i < notas.size(); i++) {

                List<String> materias = notas.get(i).getMaterias();
                List<Integer> notasEstudiante = notas.get(i).getNotas();
                model2.addRow(new Object[]{notas.get(i).getIdEstudiante(), materias.get(i), notasEstudiante.get(i), notas.get(i).getParcial()});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String id = (String) tablaNotas.getValueAt(tablaNotas.getSelectedRow(), 0);
        if (tablaNotas.getSelectedRow() < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el alumno a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DAOEstudiante dao = new DAOEstudianteImpl();
                MenuPrincipalJFrame.mostrarJPanel(new TercerParcialJPanel(dao.buscarNotas(id, 3)));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEstudiantes;
    public javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables
}
