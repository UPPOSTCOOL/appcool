
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pdsw.upcool.managebeans;
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Carol
 */
@ManagedBean(name = "PruebaSalonBean")
@SessionScoped
public class PruebaSalonBean {
    
    @ManagedProperty(value = "#{PeriodoBean}")
    private PeriodoBean cb;
    
    
    
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
 

    
    public List<Clase> obtenerClases() throws ExcepcionServiciosUPPOST{
        int semestre=cb.getSemestre();
        int anio=cb.getAnio();
        List<Clase> clases = null;
        //materia = inp.consultarMaterias(anio, semestre);
        clases = inp.consultarClasesxPeriodo(anio, semestre);
        return clases;
    }

    public PeriodoBean getCb() {
        return cb;
    }

    public void setCb(PeriodoBean cb) {
        this.cb = cb;
    }

 

    
}


