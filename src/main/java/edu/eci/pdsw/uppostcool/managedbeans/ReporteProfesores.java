/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import com.sun.org.apache.bcel.internal.Constants;
import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author javierfsilva7
 */

@ManagedBean(name = "reporteProfesorBean")
@SessionScoped
public class ReporteProfesores {
    
    @ManagedProperty(value = "#{PeriodoBean}")
    private PeriodoBean pb;

    
    private String profesor;

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    
    
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
    

    public List<Clase> obtenerClases() throws ExcepcionServiciosUPPOST{
        int semestre=pb.getSemestre();
        int anio=pb.getAnio();
        
        return inp.consultarClasesXprofesor(anio, semestre, profesor);
    }
    
}
