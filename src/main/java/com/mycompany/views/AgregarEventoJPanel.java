package com.mycompany.views;

import com.mycompany.intefaces.DAOEventos;
import com.mycompany.modelos.Eventos;
import com.mycompany.sistemadeestudiantes.DAOEventosImpl;

public class AgregarEventoJPanel extends javax.swing.JPanel {

    boolean edicion = false;
    Eventos eventoEdicion;

    public AgregarEventoJPanel() {
        initComponents();
        initStyles();
    }

    public AgregarEventoJPanel(Eventos evento) {
        edicion = true;
        eventoEdicion = evento;
        initComponents();
        initStyles();
    }

    private void initStyles() {
        titulo.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");
        jLabel1.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");
        jLabel2.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");
        btnAgregarEvento.putClientProperty("FlatLaf.style", "Font: bold $h1.regular.font");

        if (edicion) {
            titulo.setText("Edición de Evento");
            btnAgregarEvento.setText("Guardar");
            if (eventoEdicion != null) {
                nombreEventoTxt.setText(eventoEdicion.getNombreEvento());
                fechaEventoTxt.setText(eventoEdicion.getFechaEvento());

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        fechaEventoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreEventoTxt = new javax.swing.JTextField();
        btnAgregarEvento = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(52, 52, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Agregar Evento");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fechaEventoTxt.setBackground(new java.awt.Color(52, 52, 52));
        fechaEventoTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaEventoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fechaEventoTxt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        fechaEventoTxt.setSelectionColor(new java.awt.Color(255, 153, 0));
        jPanel1.add(fechaEventoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 240, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Evento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha del Evento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        nombreEventoTxt.setBackground(new java.awt.Color(52, 52, 52));
        nombreEventoTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreEventoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nombreEventoTxt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        nombreEventoTxt.setSelectionColor(new java.awt.Color(255, 153, 0));
        jPanel1.add(nombreEventoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 40));

        btnAgregarEvento.setBackground(new java.awt.Color(255, 153, 0));
        btnAgregarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEvento.setText("Agregar evento");
        btnAgregarEvento.setBorder(null);
        btnAgregarEvento.setBorderPainted(false);
        btnAgregarEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed

        String nombreEvento = nombreEventoTxt.getText();
        String fechaEvento = fechaEventoTxt.getText();
        if (nombreEvento.isEmpty() || fechaEvento.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        Eventos evento = edicion ? eventoEdicion : new Eventos();
        evento.setNombreEvento(nombreEvento);
        evento.setFechaEvento(fechaEvento);
        try {
            DAOEventos dao = new DAOEventosImpl();
            if (!edicion) {
                dao.agregarEvento(evento);
            } else {
                dao.editarEvento(evento);
            }
            String mensajeExito = edicion ? "editado" : "agregado";
            javax.swing.JOptionPane.showMessageDialog(this, "Se ha " + mensajeExito + " con éxito el evento. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            fechaEventoTxt.setText("");
            nombreEventoTxt.setText("");
        } catch (Exception e) {
            String mensajeError = edicion ? "editar" : "agregar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ha ocurrido un error al " + mensajeError + " el evento. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarEventoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JTextField fechaEventoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreEventoTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
