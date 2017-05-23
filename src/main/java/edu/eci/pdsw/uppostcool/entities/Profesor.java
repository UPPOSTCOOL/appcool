/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.entities;

import java.io.Serializable;

/**
 *
 * @author kvn
 */
public class Profesor implements Serializable{
    private int id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String apellido, String apellido2) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = apellido;
        this.segundoApellido = apellido2;
    }

    public String getApellidoUno() {
        return primerApellido;
    }

    public void setApellidoUno(String apellido) {
        this.primerApellido = apellido;
    }

    public String getApellidoDos() {
        return segundoApellido;
    }

    public void setApellidoDos(String apellido) {
        this.segundoApellido = apellido;
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
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
