/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;

/**
 *
 * @author 2095112
 */
public class Periodo implements Serializable {
    private int id;
    private int anio; //año
    private int periodo; // 1 o 2
    
    public Periodo(int id, int anio, int periodo){
        this.id = id;
        this.anio = anio;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
    @Override
    public String toString() {
        return "Periodo{" + "id=" + id + ", año=" + anio + ", periodo=" + anio + '}';
    }
    
}
