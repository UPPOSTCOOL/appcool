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
    
    private String codigo;
    private String nombre;
    private int cohorte;
    private int numClases;
    private int numHoras;
    private Profesor profesor;
    private Asignatura asignatura;
    private List<Clase> clases;
    // private int semestre;
    // private anio;

    public Materia(String codigo, String nombre, int cohorte, int numClases, int numHoras,
            Profesor profesor, Asignatura asignatura, List<Clase> clases) {
        
        this.codigo = codigo;
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


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo= codigo;
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
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", cohorte=" + cohorte + ", numClases=" + numClases + ", numHoras=" + numHoras + ", profesor=" + profesor + ", asignatura=" + asignatura + '}';
    }
    
    
}
