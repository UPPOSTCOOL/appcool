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


    private Profesor profesor;
    
    private Asignatura asignatura;
    

    private String descripcion;
    
    private List<Clase> clases;
    
    


    public Materia(String codigo, String nombre, int cohorte,Profesor profesor,
            Asignatura asignatura,String descripcion, List<Clase> clases ) {
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.cohorte = cohorte;



        this.profesor = profesor;
        this.asignatura = asignatura;
        
        this.descripcion = descripcion;
        
        this.clases = clases;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }
    

    @Override
    public String toString() {

        return "Materia{" + "Codigo=" + codigo + ", nombre=" + nombre + ", cohorte=" + cohorte   + ", profesor=" + profesor + ", asignatura=" + asignatura + '}';


    }
    
    
}
