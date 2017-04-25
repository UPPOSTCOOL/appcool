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
    private int numClases;
    private int numHoras;
    
    private Profesor profesor;
    private Asignatura asignatura;
    
    private List<Clase> clases;

    public Materia(int id, String nombre, int cohorte, int numClases, int numHoras,
            Profesor profesor, Asignatura asignatura, List<Clase> clases) {
        
        this.id = id;
        this.nombre = nombre;
        this.cohorte = cohorte;
        this.numClases = numClases;
        this.numHoras = numHoras;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.clases = clases;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
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

    public int getNumClases() {
        return numClases;
    }

    public void setNumClases(int numClases) {
        this.numClases = numClases;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
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
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", cohorte=" + cohorte + ", numClases=" + numClases + ", numHoras=" + numHoras + ", profesor=" + profesor + ", asignatura=" + asignatura + '}';
    }
    
    
}
