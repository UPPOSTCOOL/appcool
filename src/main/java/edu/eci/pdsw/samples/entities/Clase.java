/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 *
 * @author 
 */
public class Clase {
    
    private int id=0;
    private Recurso descripcion;
    private Timestamp fecha;
    private Timestamp horafin;
    
    private Materia materia;
    private String salon;
    

    public Clase(int id, Recurso descripcion, java.sql.Timestamp fecha, java.sql.Timestamp horafin,Materia Materia, String salon) {
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

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
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


  

  
   @Override
   public String toString() {
        return "clase{" + "id=" + id + ", descripcion=" + descripcion + '}';
  }
    
}
