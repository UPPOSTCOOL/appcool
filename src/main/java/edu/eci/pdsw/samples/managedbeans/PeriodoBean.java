/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2092815
 */
@ManagedBean(name = "PeriodoBean")
@SessionScoped
public class PeriodoBean implements Serializable{
    
    ServiciosUPPOST sp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    
    public List<PeriodoAcademico> periodos;
    public PeriodoAcademico periodo;

    public PeriodoBean() {
        //periodos = sp.consultarPAcademicos();
    }

    public List<PeriodoAcademico> getPeriodos() throws ExcepcionServiciosUPPOST {
        return periodos;
    }

    public void setPeriodos(List<PeriodoAcademico> periodos) {
        this.periodos = periodos;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }
    
    
    
}
