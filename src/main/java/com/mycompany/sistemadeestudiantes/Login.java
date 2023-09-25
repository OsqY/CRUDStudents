package com.mycompany.sistemadeestudiantes;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.intefaces.DAOVerificacion;
import com.mycompany.modelos.Usuario;
import com.mycompany.views.MenuPrincipalJFrame;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        initStyles();
        this.setLocationRelativeTo(this);
    }

    private void initStyles() {
        titulo.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        subtitulo.putClientProperty("FlatLaf.style", "font: bold $h2.regular.font");
        btnIngresar.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        usuarioLab.putClientProperty("FlatLaf.style", "font: bold $h2.regular.font");
        contraseniaLab.putClientProperty("FlatLaf.style", "font: bold $h2.regular.font");
    }

    public static void escalarImagen(JLabel nombreLabel, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombreLabel.getWidth(), nombreLabel.getHeight(), Image.SCALE_DEFAULT));
        nombreLabel.setIcon(icono);
    }
    private static String rolUsuario;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        usuarioLab = new javax.swing.JLabel();
        contraseniaLab = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        contraseniaTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));

        background.setBackground(new java.awt.Color(52, 52, 52));

        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Bienvenido/a");

        subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo.setText("Ingrese su cuenta de maestro.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unnamed.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        usuarioTxt.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTxt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        usuarioTxt.setSelectionColor(new java.awt.Color(255, 153, 0));
        usuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTxtActionPerformed(evt);
            }
        });

        usuarioLab.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLab.setText("Usuario");

        contraseniaLab.setForeground(new java.awt.Color(255, 255, 255));
        contraseniaLab.setText("Contraseña");

        btnIngresar.setBackground(new java.awt.Color(255, 153, 0));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        contraseniaTxt.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        contraseniaTxt.setSelectionColor(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
                .addGap(80, 80, 80)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(130, 130, 130))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(usuarioLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(160, 160, 160))
                            .addComponent(usuarioTxt)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(10, 10, 10))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(contraseniaLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(140, 140, 140))
                            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contraseniaTxt))))
                .addGap(60, 60, 60))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94)
                .addComponent(usuarioLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(contraseniaLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(contraseniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTxtActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (usuarioTxt.getText().isEmpty() || contraseniaTxt.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            usuarioTxt.requestFocus();
            return;
        }
        try {
            DAOVerificacion verificarUsuario = new DAOVerificacionImpl();
            Usuario usuarioActual = verificarUsuario.verificar(usuarioTxt.getText(), Integer.parseInt(contraseniaTxt.getText()));

            if (usuarioActual == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró a ningún usuario con ese nombre/contraseña. \n", "ACCESO DENEGADO", javax.swing.JOptionPane.ERROR_MESSAGE);
                usuarioTxt.requestFocus();
                return;
            }

            rolUsuario = usuarioActual.getRol();
            javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. \n", "ACCESO HABILITADO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if ("Admin".equals(rolUsuario)) {
                new MenuPrincipalJFrame().setVisible(true);
                this.dispose();
            } else if ("Maestro".equals(rolUsuario)) {
                new MenuPrincipalJFrame(1).setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Acceso denegado. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al intentar ingresar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel contraseniaLab;
    private javax.swing.JPasswordField contraseniaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuarioLab;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
