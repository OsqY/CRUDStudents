/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.intefaces;

import com.mycompany.modelos.Estudiante;
import com.mycompany.modelos.Notas;
import java.util.List;

/**
 *
 * @author nbmmll nnnnn
 */
public interface DAOEstudiante {
    public void matricular(Estudiante estudiante) throws Exception;
    public void editar(Estudiante estudiante) throws Exception;
    public void eliminar(String estudianteId) throws Exception;
    public List<Estudiante> listar(String nombre) throws Exception;
    public Estudiante buscar(String estudianteId) throws Exception;
    public void subirNotas(Notas nota) throws Exception;
    public List<Notas> listarNotas(String id, int parcial) throws Exception;
    public void editarNotas(Notas nota) throws Exception;
    public Notas buscarNotas(String idEstudiante, int parcial) throws Exception;
    public int calcularPromedioPorParcial(String idEstudiante, int parcial) throws Exception;

}
