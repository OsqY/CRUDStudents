package com.mycompany.sistemadeestudiantes;

import com.mycomapny.baseDeDatos.BaseDeDatos;
import com.mycompany.intefaces.DAOVerificacion;
import com.mycompany.modelos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOVerificacionImpl extends BaseDeDatos implements DAOVerificacion {

    @Override
    public Usuario verificar(String nombreUsuario, int contraseniaUsuario) throws Exception {
        Usuario usuario = null;
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("SELECT rol FROM cuentas WHERE nombre like ? AND contrasenia = ?");
            st.setString(1, nombreUsuario);
            st.setInt(2, contraseniaUsuario);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setRol(rs.getString("rol"));
                usuario.setUserName(nombreUsuario); 
                usuario.setContrasenia(contraseniaUsuario);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
        return usuario;
    }

}
