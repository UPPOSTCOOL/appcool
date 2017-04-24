/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.upcool.managebeans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2092815
 */

@ManagedBean(name = "RegsemBean")
@SessionScoped
public class Reg_semestral implements Serializable{
    private List<String> periodo;
    private List<String> cohorte;
    private List<String> asignaturas;
    private List<String> profesor;
    private List<String> horas;
    private List<String> dias;
    private List<String> sesion;
             
    
    public Reg_semestral (){        
        periodo = new ArrayList<String>();
        cohorte = new ArrayList<String>();;
        asignaturas = new ArrayList<String>();;
        profesor = new ArrayList<String>();;
        horas = new ArrayList<String>();;
        dias = new ArrayList<String>();;
        sesion = new ArrayList<String>();;
    }

    public List<String> getPeriodo() {
        return periodo;
    }

    public void setPeriodo(List<String> periodo) {
        this.periodo = periodo;
    }

    public List<String> getCohorte() {
        return cohorte;
    }

    public void setCohorte(List<String> cohorte) {
        this.cohorte = cohorte;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<String> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<String> profesor) {
        this.profesor = profesor;
    }

    public List<String> getHoras() {
        return horas;
    }

    public void setHoras(List<String> horas) {
        this.horas = horas;
    }

    public List<String> getDias() {
        return dias;
    }

    public void setDias(List<String> dias) {
        this.dias = dias;
    }

    public List<String> getSesion() {
        return sesion;
    }

    public void setSesion(List<String> sesion) {
        this.sesion = sesion;
    }
    
    
    
    
    
}
