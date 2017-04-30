/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;

/**
 *
 * @author kvn
 */
public class Asignatura implements Serializable{
    
    private int id;
    private String nombre;

    private Programa postgrado;

    //secuencia de materias la asignatura la compone diferentes materias
    


    public Asignatura(int id, String nombre, Programa postgrado) {

        this.id = id;
        this.nombre = nombre;
        this.postgrado = postgrado;
    }

    public Programa getPostgrado() {
        return postgrado;
    }

    public void setPostgrado(Programa postgrado) {
        this.postgrado = postgrado;
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

    
    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
