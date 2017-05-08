/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.Serializable;
import java.sql.Timestamp;

import java.text.SimpleDateFormat;

/**
 *
 * @author 
 */
public class Clase implements Serializable {
    
    private int id;

    private String recurso;
    
    private Timestamp fecha;
    private Timestamp horafin;
    
    private String materia;
    private String salon;
    

    

    public Clase(int id, String recurso, java.sql.Timestamp fecha,
            java.sql.Timestamp horafin,String materia, String salon) {
        
        this.id = id;
        this.recurso = recurso;
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

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
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
        return "clase{" + "id=" + id + ", descripcion=" + recurso + ", Materia=" + materia + '}';
  }
    

    public String getHora(){
        String hora = new SimpleDateFormat("HH:mm").format(horafin);
        return hora;
    }
    
    public String getFormatoFecha(){
        String fecha1 = new SimpleDateFormat("MM/dd/yy").format(fecha);
        return fecha1;
    }
    
   
    
    




}

