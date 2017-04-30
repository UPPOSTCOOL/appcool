/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;

/**
 *
 * @author 2095957
 */
public class Recurso implements Serializable {
    
    private int id;
    private String nombre;

    public Recurso(int id, String nombre) {
        this.id=id;
        this.nombre=nombre;
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
        return "Recurso{" + "ID=" + id + ", nombre=" + nombre  + '}';
    }
    
}
