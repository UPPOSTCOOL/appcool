/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2083722
 */
public class Programa {

    private int id;
    private String nombre;
    private List<Asignatura> asignaturas;
    private List<Materia> preRequisitos;

    public Programa() {
    }

    public Programa(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<String> getNombreAsignatura() {
        ArrayList<String> ans = new ArrayList<>();
        for (Asignatura asignatura : asignaturas) {

            ans.add(asignatura.getNombre());
        }
        return ans;
    }
    
    
    public List<Materia> getNombreRequisitos() {
        return preRequisitos;
    }
    
    /**
    public List<String> getNombreRequisitos() {
        ArrayList<String> ans = new ArrayList<>();
        for (Materia req : preRequisitos) {
            ans.add(req.getNombre());
        }
        return ans;
    }
    */
    
    
}
