package com.mycompany.modelos;

import java.util.List;


public class Estudiante extends Notas {
    private String id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int grado;
    private int notaGeneral;
    private String Encargado; 
    private String telEncargado;
    private String observacionMedica;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getNotaGeneral() {
        return notaGeneral;
    }

    public void setNotaGeneral(int notaGeneral) {
        this.notaGeneral = notaGeneral;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public String getTelEncargado() {
        return telEncargado;
    }

    public void setTelEncargado(String telEncargado) {
        this.telEncargado = telEncargado;
    }

    public String getObservacionMedica() {
        return observacionMedica;
    }

    public void setObservacionMedica(String observacionMedica) {
        this.observacionMedica = observacionMedica;
    }

    
}
