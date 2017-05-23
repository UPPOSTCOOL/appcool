/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author 2092815
 */
public class Programa implements Serializable {
    private int id;
    private String nombre;
    private Profesor coordinador;
    private List<Asignatura> asignaturas;
    private List<Materia> preRequisitos;

    public Programa() {
    }

    public Programa(int i, String _Gerencia_Estrategica) {
        id = i;
        nombre = _Gerencia_Estrategica;
    }

    public Programa(int id, String nombre, Profesor coordinador, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.coordinador = coordinador;
        this.asignaturas = asignaturas;
    }
    
    
    public String getNombre() {//
        return nombre;
    }

    public void setNombre(String nombre) {
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

      public void setId(int id) {
        this.id = id;
    }
     public int getId() {
        return id;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Programa{" + "Coordinador=" + coordinador + ", nombre=" + nombre + ", Asignaturas=" + asignaturas + '}';
    }

    public List<String> getNombreAsignatura() {//
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
