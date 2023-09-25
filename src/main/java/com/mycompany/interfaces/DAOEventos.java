package com.mycompany.intefaces;

import com.mycompany.modelos.Eventos;
import java.util.List;

public interface DAOEventos {
    public void agregarEvento(Eventos evento) throws Exception;
    public void editarEvento(Eventos evento) throws Exception;
    public void eliminarEvento(String nombreEvento) throws Exception;
    public Eventos buscarEvento(String nombreEvento) throws Exception;
    public List<Eventos> listarEventos(String nombreEvento) throws Exception;
}
