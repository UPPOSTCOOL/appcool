/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author javierfsilva7
 */

@ManagedBean(name = "reporteProfesorBean")
@SessionScoped
public class ReporteProfesores {
    
    @ManagedProperty(value = "#{PeriodoBean}")
    private PeriodoBean pb;
    
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    
    public List<Profesor> obtenerProfesores() throws ExcepcionServiciosUPPOST{
    
        return inp.consultarProfesores();
    }

    public PeriodoBean getPb() {
        return pb;
    }

    public void setPb(PeriodoBean pb) {
        this.pb = pb;
    }
    

    public List<Clase> obtenerClases(Profesor profesor) throws ExcepcionServiciosUPPOST{
        int semestre=pb.getSemestre();
        int anio=pb.getAnio();
        List<Clase> clases = null;
        
        clases = inp.consultarClasesXprofesor(anio, semestre, profesor);
        return clases;
    }
    
}
