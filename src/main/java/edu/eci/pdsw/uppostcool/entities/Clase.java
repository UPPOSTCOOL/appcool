/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.entities;

import java.io.Serializable;
import java.sql.Time;
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
    private Time horaFin;
    private String rangoHoras;//indica 10 a 2pm
    private String idMateria;
    private int cohorte;
    private String salon;

    public Clase() {
    }
    
    public Clase(int id, String recurso, Timestamp fecha, Time horaFin, String rangoHoras, String idMateria, int cohorte, String salon) {
        this.id = id;
        this.recurso = recurso;
        this.fecha = fecha;
        this.horaFin = horaFin;
        this.rangoHoras = rangoHoras;
        this.idMateria = idMateria;
        this.cohorte = cohorte;
        this.salon = salon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
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

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", recurso=" + recurso + ", fecha=" + fecha + ", horaFin=" + horaFin + ", rangoHoras=" + rangoHoras + ", idMateria=" + idMateria + ", cohorte=" + cohorte + ", salon=" + salon + '}';
    }

    public String getHora(){
        String hora = new SimpleDateFormat("HH:mm").format(horaFin);
        return hora;
    }
    
    public String getFormatoFecha(){
        String fecha1 = new SimpleDateFormat("MM/dd/yy").format(fecha);
        return fecha1;
    }
    
    public String getFormatoHoraInicio(){
        String fecha1 = new SimpleDateFormat("HH:mm").format(fecha);
        return fecha1;
    }
}
