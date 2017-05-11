/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;
import java.util.List;



/**
 *
 * @author 2092815
 */
public class Programa implements Serializable {

    private int id;
    private String nombre;
    private Profesor coordinador;
    private List<Asignatura> asignaturas;

    public Programa(int i, String _Gerencia_Estrategica) {
        id = i;
        nombre = _Gerencia_Estrategica;
    }

    public Programa(int id, String nombre, Profesor coordinador, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.coordinador = coordinador;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Profesor coordinador) {
        this.coordinador = coordinador;
    }


    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

      public void setId(int id) {
        this.id = id;
    }
     public int getId() {
        return id;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Programa{" + "Coordinador=" + coordinador + ", nombre=" + nombre + ", Asignaturas=" + asignaturas + '}';
    }
    
    
    
}
