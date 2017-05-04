/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
/**
 *
 * @author 
 */
public class Clase {
    
    private int id;
    private Recurso descripcion=new Recurso();
    private Timestamp fecha;
    private Timestamp horaFin;
    private String rangoHoras;//indica 10 a 2pm
    private String idMateria;
    private int cohorte;

    public Clase() {
    }
    
    public Clase(int id, /*Recurso descripcion,*/ Timestamp fecha, Timestamp horaFin, String rangoHoras, String idMateria, int cohorte) {
        this.id = id;
        this.descripcion =new Recurso();
        this.fecha = fecha;
        this.horaFin = horaFin;
        this.rangoHoras = rangoHoras;
        this.idMateria = idMateria;
        this.cohorte = cohorte;
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

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    public String getRangoHoras() {
        return rangoHoras;
    }

    public void setRangoHoras(String rangoHoras) {
        this.rangoHoras = rangoHoras;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public int getCohorte() {
        return cohorte;
    }

    public void setCohorte(int cohorte) {
        this.cohorte = cohorte;
    }
    
    public String getHora(){
        String hora = new SimpleDateFormat("HH:mm").format(horaFin);
        return hora;
    }
    
    public String getFormatoFecha(){
        String fecha1 = new SimpleDateFormat("MM/dd/yy").format(fecha);
        return fecha1;
    }
    
   
    
    




}