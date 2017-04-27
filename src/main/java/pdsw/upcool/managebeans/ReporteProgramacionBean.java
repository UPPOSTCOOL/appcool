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
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Paula
 */

@ManagedBean(name = "ProgramacionBean")
@SessionScoped
public class ReporteProgramacionBean implements Serializable{
    /**
    ServiciosUPPOST sp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    
    Periodo periodo;
   
    public List<Periodo> getPeriodos() throws ExcepcionServiciosUPPOST {
        return sp.consultarPAcademicos();
    }
     
    public List<Materia> getMaterias() throws ExcepcionServiciosUPPOST {
        return sp.consultarMaterias(0, 0);
    }
   
    public List<Periodo> getCohortes() throws ExcepcionServiciosUPPOST {
        return sp.consultarPAcademico(periodo);
    }
    
    
    public String getProfesor(Clase clase) throws ExcepcionServiciosUPPOST {
        return sp.consultarProfesor(clase.getCohorte(), clase.getMateria().getProfesor().getNombre()).toString();
    }
    
    
    public List<Clase> getClases() throws ExcepcionServiciosUPPOST {
        return sp.consultarClasePeriodo(periodo);
    }
    
    
    public List<Date> getFechas() throws ExcepcionServiciosUPPOST {
        List<Date> fechas= sp.consultarFechas(periodo);
        return fechas;
    }
    
    public Periodo getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    * */
}
