package com.mycompany.sistemadeestudiantes;

import com.mycomapny.baseDeDatos.BaseDeDatos;
import com.mycompany.modelos.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.intefaces.DAOEstudiante;
import com.mycompany.modelos.Notas;

public class DAOEstudianteImpl extends BaseDeDatos implements DAOEstudiante {

    @Override
    public void matricular(Estudiante estudiante) throws Exception {
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("INSERT INTO estudiantes(id, nombre, apellidoPaterno, apellidoMaterno, grado, encargado, telEncargado, observacionMedica) VALUES(?,?,?,?,?,?,?,?);");
            st.setString(1, estudiante.getId());
            st.setString(2, estudiante.getNombre());
            st.setString(3, estudiante.getApellidoPaterno());
            st.setString(4, estudiante.getApellidoMaterno());
            st.setInt(5, estudiante.getGrado());
            st.setString(6, estudiante.getEncargado());
            st.setString(7, estudiante.getTelEncargado());
            st.setString(8, estudiante.getObservacionMedica());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public void editar(Estudiante estudiante) throws Exception {
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("UPDATE estudiantes SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, grado = ?, encargado = ?, telEncargado = ?, observacionMedica = ? WHERE id LIKE ?;");
            st.setString(1, estudiante.getNombre());
            st.setString(2, estudiante.getApellidoPaterno());
            st.setString(3, estudiante.getApellidoMaterno());
            st.setInt(4, estudiante.getGrado());
            st.setString(5, estudiante.getEncargado());
            st.setString(6, estudiante.getTelEncargado());
            st.setString(7, estudiante.getObservacionMedica());
            st.setString(8, estudiante.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public void eliminar(String estudianteId) throws Exception {

        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("DELETE FROM estudiantes WHERE id LIKE ?");
            PreparedStatement st2 = this.conexionBaseDeDatos.prepareStatement("DELETE FROM notasEstudiantes WHERE idEstudiante LIKE ?;");
            st.setString(1, estudianteId);
            st2.setString(1, estudianteId);
            st.executeUpdate();
            st2.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }

    }

    @Override
    public List<Estudiante> listar(String id) throws Exception {
        List<Estudiante> lista = null;
        try {
            this.conectarDb();
            String consulta = id.isEmpty() ? "SELECT * FROM estudiantes estudiantes;" : "SELECT * FROM estudiantes WHERE id like '%" + id + "%';";
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement(consulta);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getString("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellidoPaterno(rs.getString("apellidoPaterno"));
                estudiante.setApellidoMaterno(rs.getString("apellidoMaterno"));
                estudiante.setGrado(rs.getInt("grado"));
                estudiante.setNotaGeneral(rs.getInt("notaGeneral"));
                estudiante.setEncargado(rs.getString("encargado"));
                estudiante.setTelEncargado(rs.getString("telEncargado"));
                estudiante.setObservacionMedica(rs.getString("observacionMedica"));
                lista.add(estudiante);
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
    public Estudiante buscar(String estudianteId) throws Exception{
        Estudiante estudiante = null;
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("SELECT * FROM estudiantes WHERE id LIKE ? LIMIT 1;");
            st.setString(1, estudianteId);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                estudiante = new Estudiante();
                estudiante.setId(rs.getString("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellidoPaterno(rs.getString("apellidoPaterno"));
                estudiante.setApellidoMaterno(rs.getString("apellidoMaterno"));
                estudiante.setGrado(rs.getInt("grado"));
                estudiante.setNotaGeneral(rs.getInt("notaGeneral"));
                estudiante.setEncargado(rs.getString("encargado"));
                estudiante.setTelEncargado(rs.getString("telEncargado"));
                estudiante.setObservacionMedica(rs.getString("observacionMedica"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
        return estudiante;
    }

    @Override
    public void subirNotas(Notas nota) throws Exception {
        try {
            this.conectarDb();
            for (int i = 0; i < nota.getMaterias().size(); i++) {
                PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("INSERT INTO notasEstudiantes (idEstudiante, materia, nota, parcial) VALUES(?,?,?,?);");
                st.setString(1, nota.getIdEstudiante());
                st.setString(2, nota.getMaterias().get(i));
                st.setInt(3, nota.getNotas().get(i));
                st.setInt(4, nota.getParcial());
                st.executeUpdate();
                st.close();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public void editarNotas(Notas nota) throws Exception {
        try {
            this.conectarDb();
            for (int i = 0; i < nota.getMaterias().size(); i++) {
                PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("UPDATE notasEstudiantes SET nota = ? WHERE idEstudiante LIKE ? AND parcial = ? AND materia LIKE ?");
                st.setInt(1, nota.getNotas().get(i));
                st.setString(2, nota.getIdEstudiante());
                st.setInt(3, nota.getParcial());
                st.setString(4, nota.getMaterias().get(i));
                st.executeUpdate();
                st.close();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }

    @Override
    public List<Notas> listarNotas(String id, int parcial) throws Exception {
        List<Notas> lista = null;
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("SELECT * FROM  notasEstudiantes WHERE idEstudiante LIKE ? AND parcial = ?;");
            st.setString(1, id);
            st.setInt(2, parcial);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Notas nota = new Notas();
                nota.setIdEstudiante(rs.getString("idEstudiante"));
                nota.setParcial(rs.getInt("parcial"));

                List<String> materias = new ArrayList<>();
                List<Integer> notas = new ArrayList<>();

                for (int i = 1; i <= 8; i++) {
                    materias.add(rs.getString("materia"));
                    notas.add(rs.getInt("nota"));
                }

                nota.setMaterias(materias);
                nota.setNotas(notas);

                lista.add(nota);
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
    public Notas buscarNotas(String idEstudiante, int parcial) throws Exception {
        Notas nota = null;
        try {
            this.conectarDb();
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement("SELECT * FROM notasEstudiantes WHERE idEstudiante LIKE ? AND parcial = ? ");
            st.setString(1, idEstudiante);
            st.setInt(2, parcial);

            ResultSet rs = st.executeQuery();

            nota = new Notas();
            nota.setIdEstudiante(idEstudiante);
            nota.setParcial(parcial);

            List<String> materias = new ArrayList<>();
            List<Integer> notas = new ArrayList<>();

            while (rs.next()) {
                materias.add(rs.getString("materia"));
                notas.add(rs.getInt("nota"));
            }

            nota.setMaterias(materias);
            nota.setNotas(notas);

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
        return nota;
    }

    @Override
    public int calcularPromedioPorParcial(String idEstudiante, int parcial) throws Exception {
        try {
            this.conectarDb();
            String consulta = idEstudiante.isEmpty() ? "SELECT ROUND(AVG(nota)) AS Promedio FROM notasEstudiantes WHERE idEstudiante LIKE ? OR Parcial = ?" : "SELECT ROUND(AVG(nota)) AS Promedio FROM notasEstudiantes WHERE idEstudiante LIKE ? AND Parcial = ?";
            PreparedStatement st = this.conexionBaseDeDatos.prepareStatement(consulta);
            st.setString(1, idEstudiante);
            st.setInt(2, parcial);

            ResultSet rs = st.executeQuery();

            int promedio = 0;
            if (rs.next()) {
                promedio = rs.getInt("Promedio");
            }

            return promedio;
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrarDb();
        }
    }
}
