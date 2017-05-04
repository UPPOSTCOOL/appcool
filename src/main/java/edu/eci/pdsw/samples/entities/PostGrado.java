/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.List;

/**
 *
 * @author 2092815
 */
public class PostGrado {
    
    private Profesor coordinador;
    private List<Asignatura> asignaturas;

    public PostGrado() {
    }

    public PostGrado(Profesor coordinador, List<Asignatura> asignaturas) {
        this.coordinador = coordinador;
        this.asignaturas = asignaturas;
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
    
    
}
