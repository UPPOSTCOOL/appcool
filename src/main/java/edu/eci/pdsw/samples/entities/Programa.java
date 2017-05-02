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
    
    private String nombre;
    private Profesor coordinador;
    private List<Asignatura> asignaturas;


    public Programa(Profesor coordinador, List<Asignatura> asignaturas, String nombre) {

        this.coordinador = coordinador;
        this.asignaturas = asignaturas;
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

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    @Override
    public String toString() {
        return "Programa{" + "Coordinador=" + coordinador + ", nombre=" + nombre + ", Asignaturas=" + asignaturas + '}';
    }
    
    
    
}
