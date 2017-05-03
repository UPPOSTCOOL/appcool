/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;


import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author 2092815
 */
@ManagedBean(name = "PeriodoBean")
@SessionScoped
public class PeriodoBean implements Serializable{
    
    //ServiciosUPPOST sp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    
    private String anio;
    private String semestre;
    
    
    public PeriodoBean() {
        //periodos = sp.consultarPAcademicos();
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public void nuevaEntradaAnio(RowEditEvent event){
        System.out.println("entro");
        String p= event.toString();
        this.anio = p;
    }
    
    

    
    
}
