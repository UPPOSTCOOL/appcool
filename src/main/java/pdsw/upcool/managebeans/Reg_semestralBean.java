/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.upcool.managebeans;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
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
public class Reg_semestralBean implements Serializable{
    private ArrayList<String> periodo;
    private ArrayList<String> cohorte;
    private ArrayList<String> asignaturas;
    private ArrayList<String> profesor;
    private ArrayList<String> horas;
    private ArrayList<String> dias;
    private ArrayList<String> sesion;
    private ArrayList<Clase> clase;
    
    public Reg_semestralBean (){        
        periodo = new ArrayList<String>();
        cohorte = new ArrayList<String>();
        asignaturas = new ArrayList<String>();
        profesor = new ArrayList<String>();
        horas = new ArrayList<String>();
        dias = new ArrayList<String>();
        sesion = new ArrayList<String>();
        clase = new ArrayList<Clase>();
    }

    public ArrayList<Materia> reportesMaterias() throws ExcepcionServiciosUPPOST{
        return ServiciosUPPOSTFactory.getInstance().getUPPOSTServices().consultarMaterias(1,2017);
    }
    
    public ArrayList<String> getPeriodo() {
        return periodo;
    }

    public void setPeriodo(ArrayList<String> periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Clase> getSalones() {
        return clase;
    }

    public void setSalones(ArrayList<Clase> salones) {
        this.clase = salones;
    }

    public ArrayList<String> getCohorte() {
        return cohorte;
    }

    public void setCohorte(ArrayList<String> cohorte) {
        this.cohorte = cohorte;
    }

    public ArrayList<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<String> getProfesor() {
        return profesor;
    }

    public void setProfesor(ArrayList<String> profesor) {
        this.profesor = profesor;
    }

    public ArrayList<String> getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<String> horas) {
        this.horas = horas;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    public ArrayList<String> getSesion() {
        return sesion;
    }

    public void setSesion(ArrayList<String> sesion) {
        this.sesion = sesion;
    }
}
