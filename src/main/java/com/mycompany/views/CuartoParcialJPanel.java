package com.mycompany.views;

import com.mycompany.intefaces.DAOEstudiante;
import com.mycompany.modelos.Notas;
import com.mycompany.sistemadeestudiantes.DAOEstudianteImpl;
import com.mycompany.utils.Utils;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextField;

public class CuartoParcialJPanel extends javax.swing.JPanel {

    boolean edicion = false;
    Notas editarNota = null;

    public CuartoParcialJPanel() {
        initComponents();
        initStyles();
    }

    public CuartoParcialJPanel(Notas nota) {
        initComponents();
        edicion = true;
        editarNota = nota;
        initStyles();
    }

    private void initStyles() {
        btnRegistrar.putClientProperty("FlatLaf.style", "Font: bold $h2.regular.font");

        if (edicion) {
            titulo1.setText("Notas Segundo Parcial (EDICIÓN)");
            btnRegistrar.setText("Actualizar Nota");

            if (editarNota != null) {
                identidadTxt.setText(editarNota.getIdEstudiante());
                identidadTxt.setEnabled(false);
                JTextField[] campos = {materia1Txt, materia2Txt, materia3Txt, materia4Txt, materia5Txt, materia6Txt, materia7Txt, materia8Txt};
                if (editarNota.getNotas() != null && editarNota.getNotas().size() == campos.length) {
                    String[] materias = {
                        materia1Label.getText(), materia2Label.getText(), materia3Label.getText(), materia4Label.getText(),
                        materia5Label.getText(), materia6Label.getText(), materia7Label.getText(), materia8Label.getText()
                    };

                    for (int i = 0; i < materias.length; i++) {
                        try {
                            int nota = editarNota.getNotas().get(i);
                            campos[i].setText(String.valueOf(nota));
                        } catch (Exception e) {
                            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al editar la nota. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        materia1Label = new javax.swing.JLabel();
        materia1Txt = new javax.swing.JTextField();
        materia2Label = new javax.swing.JLabel();
        materia2Txt = new javax.swing.JTextField();
        materia3Txt = new javax.swing.JTextField();
        materia3Label = new javax.swing.JLabel();
        materia4Txt = new javax.swing.JTextField();
        materia4Label = new javax.swing.JLabel();
        materia7Txt = new javax.swing.JTextField();
        materia7Label = new javax.swing.JLabel();
        materia6Txt = new javax.swing.JTextField();
        materia6Label = new javax.swing.JLabel();
        materia5Label = new javax.swing.JLabel();
        materia5Txt = new javax.swing.JTextField();
        materia8Label = new javax.swing.JLabel();
        materia8Txt = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        identidadTxt = new javax.swing.JTextField();
        titulo9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 430));

        background.setBackground(new java.awt.Color(52, 52, 52));

        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Notas Segundo Parcial");

        materia1Label.setForeground(new java.awt.Color(255, 255, 255));
        materia1Label.setText("Materia 14");

        materia1Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia1Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia1Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia1Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia1Txt.setSelectionColor(new java.awt.Color(255, 153, 0));
        materia1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materia1TxtActionPerformed(evt);
            }
        });

        materia2Label.setForeground(new java.awt.Color(255, 255, 255));
        materia2Label.setText("Materia 24");

        materia2Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia2Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia2Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia2Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia2Txt.setSelectionColor(new java.awt.Color(255, 153, 0));
        materia2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materia2TxtActionPerformed(evt);
            }
        });

        materia3Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia3Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia3Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia3Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia3Txt.setSelectionColor(new java.awt.Color(255, 153, 0));

        materia3Label.setForeground(new java.awt.Color(255, 255, 255));
        materia3Label.setText("Materia 34");

        materia4Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia4Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia4Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia4Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia4Txt.setSelectionColor(new java.awt.Color(255, 153, 0));

        materia4Label.setForeground(new java.awt.Color(255, 255, 255));
        materia4Label.setText("Materia 44");

        materia7Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia7Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia7Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia7Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia7Txt.setSelectionColor(new java.awt.Color(255, 153, 0));

        materia7Label.setForeground(new java.awt.Color(255, 255, 255));
        materia7Label.setText("Materia 74");

        materia6Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia6Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia6Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia6Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia6Txt.setSelectionColor(new java.awt.Color(255, 153, 0));

        materia6Label.setForeground(new java.awt.Color(255, 255, 255));
        materia6Label.setText("Materia 64");

        materia5Label.setForeground(new java.awt.Color(255, 255, 255));
        materia5Label.setText("Materia 54");

        materia5Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia5Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia5Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia5Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia5Txt.setSelectionColor(new java.awt.Color(255, 153, 0));

        materia8Label.setForeground(new java.awt.Color(255, 255, 255));
        materia8Label.setText("Materia 84");

        materia8Txt.setBackground(new java.awt.Color(52, 52, 52));
        materia8Txt.setForeground(new java.awt.Color(255, 255, 255));
        materia8Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        materia8Txt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        materia8Txt.setSelectionColor(new java.awt.Color(255, 153, 0));

        btnRegistrar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar Nota");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        identidadTxt.setBackground(new java.awt.Color(52, 52, 52));
        identidadTxt.setForeground(new java.awt.Color(255, 255, 255));
        identidadTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        identidadTxt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        identidadTxt.setSelectionColor(new java.awt.Color(255, 153, 0));

        titulo9.setForeground(new java.awt.Color(255, 255, 255));
        titulo9.setText("Estudiante:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(materia5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(materia5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(materia6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(materia6Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(materia7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(materia7Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(materia8Label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(materia4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(materia8Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo1)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia1Label)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia5Label)))
                .addGap(4, 4, 4)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia2Label)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia6Label)))
                .addGap(4, 4, 4)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia6Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia3Label)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia7Label)))
                .addGap(4, 4, 4)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia7Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia4Label)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia8Label)))
                .addGap(4, 4, 4)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(materia8Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(titulo9)
                        .addGap(14, 14, 14)
                        .addComponent(identidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void materia2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materia2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materia2TxtActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String id = identidadTxt.getText();
        String materia1 = materia1Txt.getText();
        String materia2 = materia2Txt.getText();
        String materia3 = materia3Txt.getText();
        String materia4 = materia4Txt.getText();
        String materia5 = materia5Txt.getText();
        String materia6 = materia6Txt.getText();
        String materia7 = materia7Txt.getText();
        String materia8 = materia8Txt.getText();

        if (materia1.isEmpty() || materia2.isEmpty() || materia3.isEmpty() || materia4.isEmpty() || materia5.isEmpty() || materia8.isEmpty()
                || materia7.isEmpty() || materia8.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. ", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            materia1Txt.requestFocus();
            return;
        } else if (!Utils.isNumeric(materia1) || !Utils.isNumeric(materia2) || !Utils.isNumeric(materia3) || !Utils.isNumeric(materia4)
                || !Utils.isNumeric(materia5) || !Utils.isNumeric(materia6) || !Utils.isNumeric(materia7) || !Utils.isNumeric(materia8)) {
            javax.swing.JOptionPane.showMessageDialog(this, "La nota tiene que ser un número entero. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            materia1Txt.requestFocus();
            return;
        } else if (id.length() < 13 || id.length() > 13) {
            javax.swing.JOptionPane.showMessageDialog(this, "La identidad es de longitud 13. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        List<String> materias = Arrays.asList(materia1Label.getText(), materia2Label.getText(), materia3Label.getText(), materia4Label.getText(),
                materia5Label.getText(), materia6Label.getText(), materia7Label.getText(), materia8Label.getText());
        List<Integer> notas = Arrays.asList(Integer.parseInt(materia1), Integer.parseInt(materia2), Integer.parseInt(materia3), Integer.parseInt(materia4), Integer.parseInt(materia5),
                Integer.parseInt(materia6), Integer.parseInt(materia7), Integer.parseInt(materia8));
        Notas notasEstudiantes = edicion ? editarNota : new Notas();
        DAOEstudiante dao = new DAOEstudianteImpl();
        notasEstudiantes.setIdEstudiante(id);
        notasEstudiantes.setMaterias(materias);
        notasEstudiantes.setNotas(notas);
        notasEstudiantes.setParcial(4);
        try {
            if (!edicion) {
                dao.subirNotas(notasEstudiantes);
                javax.swing.JOptionPane.showMessageDialog(this, "Subidas las notas del cuarto parcial al estudiante con identidad: " + id + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                materia1Txt.setText("");
                materia2Txt.setText("");
                materia3Txt.setText("");
                materia4Txt.setText("");
                materia5Txt.setText("");
                materia6Txt.setText("");
                materia7Txt.setText("");
                materia8Txt.setText("");
                identidadTxt.setText("");
            } else {
                dao.editarNotas(notasEstudiantes);
                System.out.println(notasEstudiantes.getNotas());
                System.out.println(notasEstudiantes.getMaterias());
                javax.swing.JOptionPane.showMessageDialog(this, "Editadas las notas del cuartos parcial al estudiante con identidad: " + id + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                materia1Txt.setText("");
                materia2Txt.setText("");
                materia3Txt.setText("");
                materia4Txt.setText("");
                materia5Txt.setText("");
                materia6Txt.setText("");
                materia7Txt.setText("");
                materia8Txt.setText("");
                identidadTxt.setText("");
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar/editar la nota. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void materia1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materia1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materia1TxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField identidadTxt;
    private javax.swing.JLabel materia1Label;
    private javax.swing.JTextField materia1Txt;
    private javax.swing.JLabel materia2Label;
    private javax.swing.JTextField materia2Txt;
    private javax.swing.JLabel materia3Label;
    private javax.swing.JTextField materia3Txt;
    private javax.swing.JLabel materia4Label;
    private javax.swing.JTextField materia4Txt;
    private javax.swing.JLabel materia5Label;
    private javax.swing.JTextField materia5Txt;
    private javax.swing.JLabel materia6Label;
    private javax.swing.JTextField materia6Txt;
    private javax.swing.JLabel materia7Label;
    private javax.swing.JTextField materia7Txt;
    private javax.swing.JLabel materia8Label;
    private javax.swing.JTextField materia8Txt;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo9;
    // End of variables declaration//GEN-END:variables
}
