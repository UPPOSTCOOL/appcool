/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.upcool.managebeans;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author paula
 */

@ManagedBean(name = "ProgramacionBean")
@SessionScoped
public class ReporteProgramacionBean implements Serializable{
    ServiciosUPPOST sp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    
    public List<Periodo> periodos;
    public Map<Materia,Clase> clases;
   // public Map<String,Integer>descripcion;
    
    
    public ReporteProgramacionBean() throws ExcepcionServiciosUPPOST{
        periodos=sp.consultarPAcademicos();
        clases= new TreeMap<Materia,Clase>();      
        
        
        
    }

    
    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    public Map<Materia, Clase> getClases() {
        return clases;
    }

    public void setClases(Map<Materia, Clase> clases) {
        this.clases = clases;
    }
}
