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
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImplStub;
import java.io.Serializable;
import java.util.ArrayList;
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
    private List<Periodo> periodos;
    private List<Materia> materias;
    private List<Asignatura> asignaturas;
    private List<Profesor> profesores; 
    private ArrayList<Clase> clase;
    
    public Reg_semestralBean (){      
        periodos = new ArrayList<Periodo>();
        materias = new ArrayList<Materia>();        
        asignaturas = new ArrayList<Asignatura>();
        profesores = new ArrayList<Profesor>(); 
        clase = new ArrayList<Clase>();
        
    }

    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(ArrayList<Periodo> periodos) {
        this.periodos = periodos;
    }

    public List<Materia> getMaterias() throws ExcepcionServiciosUPPOST {
        ServiciosUPPOSTImplStub inp = new ServiciosUPPOSTImplStub();
        materias = inp.consultarMaterias(1,2017);
        System.out.println("getMaterias");
        System.out.println(materias.size());
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Clase> getClase() {
        return clase;
    }

    public void setClase(ArrayList<Clase> clase) {
        this.clase = clase;
    }
        
    public List<Materia> getReportesMaterias() throws ExcepcionServiciosUPPOST{
        //return ServiciosUPPOSTFactory.getInstance().getUPPOSTServices().consultarMaterias(1,2017);
        ServiciosUPPOSTImplStub inp = new ServiciosUPPOSTImplStub();
        materias = inp.consultarMaterias(1,2017);
        System.out.println("getRepotesMaterias");
        return materias;
    }
    
    
}
