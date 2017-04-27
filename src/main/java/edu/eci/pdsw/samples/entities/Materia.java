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
 * @author kvn
 */
public class Materia implements Serializable{
    
    private int id;
    private String nombre;
    
    private int cohorte;
    
    private Profesor profesor;
    private Asignatura asignatura;
    

    public Materia(int id, String nombre, int cohorte, int numClases, int numHoras,
            Profesor profesor, Asignatura asignatura, List<Clase> clases) {
        
        this.id = id;
        this.nombre = nombre;
        this.cohorte = cohorte;
        this.profesor = profesor;
        this.asignatura = asignatura;
        
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCohorte() {
        return cohorte;
    }

    public void setCohorte(int cohorte) {
        this.cohorte = cohorte;
    }

    

    
    

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", cohorte=" + cohorte + ", numClases=" + ", numHoras=" + ", profesor=" + profesor + ", asignatura=" + asignatura + '}';
    }
    
    
}
