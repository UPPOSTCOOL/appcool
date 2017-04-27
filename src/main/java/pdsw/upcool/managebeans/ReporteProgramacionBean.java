/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.upcool.managebeans;

import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
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
    
    
    public int getSesion() throws ExcepcionServiciosUPPOST {
        return sp.consultarClasePeriodo(periodo).size();
    }
    */
    
    
    private ArrayList<Clase> clases=new ArrayList<Clase>();
    private ArrayList<Materia> materia=new ArrayList<Materia>();
    
    
    public ReporteProgramacionBean(){
        initList();  
    
    }
    
    private void initList(){
        
        Profesor profe1= new Profesor(5, "cadavid");
        Asignatura asig1= new Asignatura(4, "conocimiento y habilidades gerenciales");
        
        Calendar calendar = Calendar.getInstance();
        Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
        Recurso d=new Recurso(23,"pc");
        Clase c1 = new Clase(0, d, currentTimestamp, currentTimestamp, 23);
        Recurso d1 = new Recurso(25, "portatiles");
        Clase c2 = new Clase(1, d1, currentTimestamp, currentTimestamp, 22);
        Recurso d2 = new Recurso(223, "video");
        Clase c3 = new Clase(2, d2, currentTimestamp, currentTimestamp, 2453);
        Recurso d6 = new Recurso(223, "Marcadores Borrables");
        Clase c4 = new Clase(2, d6, currentTimestamp, currentTimestamp, 2231);
        Recurso d3 = new Recurso(223, "sala MAC");
        Clase c5 = new Clase(2, d3, currentTimestamp, currentTimestamp, 2231);
        Recurso d4 = new Recurso(223, "Consolas");
        Clase c6 = new Clase(2, d4, currentTimestamp, currentTimestamp, 2446);
        
        clases.add(c1);
        clases.add(c2);
        clases.add(c3);
        clases.add(c4);
        clases.add(c5);
        
       
        Materia m1= new Materia(1,"gerencia de riesgos",3,5,6,profe1,asig1,clases);
        materia.add(m1);   
    
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public ArrayList<Materia> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Materia> materia) {
        this.materia = materia;
    }
    
    
}
