package com.mycompany.sistemadeestudiantes;

import com.mycompany.baseDeDatos.BaseDeDatos;
import com.mycompany.intefaces.DAOEventos;
import com.mycompany.modelos.Eventos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOEventosImpl extends BaseDeDatos implements DAOEventos {

    @Override
    public void agregarEvento(Eventos evento) throws Exception {
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("INSERT INTO calendarioActividades (evento, fecha) VALUES (?,?)");
            st.setString(1, evento.getNombreEvento());
            st.setString(2, evento.getFechaEvento());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public void editarEvento(Eventos evento) throws Exception {
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("UPDATE calendarioActividades SET evento = ?, fecha = ? WHERE id = ?");
            st.setString(1, evento.getNombreEvento());
            st.setString(2, evento.getFechaEvento());
            st.setInt(3, evento.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public void eliminarEvento(String nombreEvento) throws Exception {
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("DELETE FROM calendarioActividades WHERE evento = ?");
            st.setString(1, nombreEvento);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public List<Eventos> listarEventos(String nombreEvento) throws Exception {
        List<Eventos> lista = null;
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("SELECT * FROM calendarioActividades");
            ResultSet rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Eventos evento = new Eventos();
                evento.setNombreEvento(rs.getString("evento"));
                evento.setFechaEvento(rs.getString("fecha"));
                lista.add(evento);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
        return lista;
    }
    
    @Override
    public Eventos buscarEvento(String nombreEvento) throws Exception {
        Eventos evento = null;
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("SELECT * FROM calendarioActividades WHERE evento LIKE ?");
            st.setString(1, nombreEvento);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                evento = new Eventos() ;
                evento.setNombreEvento(rs.getString("evento"));
                evento.setFechaEvento(rs.getString("fecha"));
           }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
        return evento;
    }

}
