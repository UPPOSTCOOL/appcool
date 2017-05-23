
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pdsw.upcool.managebeans;
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Recurso;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
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


