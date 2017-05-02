/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.Serializable;
import java.sql.Timestamp;

import java.util.List;


/**
 *
 * @author 
 */
public class Clase implements Serializable {
    
    private int id;

    private Recurso descripcion;
    
    private Timestamp fecha;
    private Timestamp horafin;
    
    private Materia materia;
    private String salon;
    

    

    public Clase(int id, Recurso descripcion, java.sql.Timestamp fecha,
            java.sql.Timestamp horafin,Materia materia, String salon) {
        
        this.id = id;
        this.descripcion = descripcion;
        this.fecha=fecha;
        this.horafin=horafin;
        this.materia = materia;
        this.salon = salon;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Recurso getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Recurso descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Timestamp getHorafin() {
        return horafin;
    }

    public void setHorafin(Timestamp horafin) {
        this.horafin = horafin;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }




  
   @Override
   public String toString() {
        return "clase{" + "id=" + id + ", descripcion=" + descripcion + ", Materia=" + materia + '}';
  }
    
}
