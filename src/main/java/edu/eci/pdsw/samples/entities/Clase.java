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
    private int idMateria=0;
    private int cohorte;
    private Materia materia;
    

    public Clase(int id, Recurso descripcion,Timestamp fecha, Timestamp horafin, int idMateria) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha=fecha;
        this.horafin=horafin;
        this.idMateria=idMateria;
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

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

  
   // @Override
   // public String toString() {
   //     return "clase{" + "id=" + id + ", descripcion=" + descripcion + '}';
  //  }

    public int getCohorte() {
        return cohorte;
    }

    public void setCohorte(int cohorte) {
        this.cohorte = cohorte;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}
