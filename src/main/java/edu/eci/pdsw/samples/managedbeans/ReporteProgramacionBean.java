/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
//import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImplStub;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Paula
 */

@ManagedBean(name = "ProgramacionBean")
@SessionScoped
public class ReporteProgramacionBean implements Serializable{
    
   //---------------------------------------------------------------------- JUAN
    @ManagedProperty(value = "#{periodoBean}")
    private PeriodoBean periodoBean;
    
   //---------------------------------------------------------------------- JUAN
    
    private List<Clase> clases=new ArrayList<>();
    private List<Materia> materia=new ArrayList<>();
   
    private String materiaSelec=null;
    
    //se eligen base de datos local o POSTGRES
    //POSTGRES
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    //LOCAL
    //private final ServiciosUPPOST inp=new ServiciosUPPOSTImplStub();
        
    
    public ReporteProgramacionBean(){
        // se elimina initList();  para trabajar directamente acá...
        //se asume que se ha eligido semestre y anio
    }
    
    public List<Materia> obtenerLista() throws ExcepcionServiciosUPPOST{
        

        materia = inp.consultarMaterias(periodoBean.periodo.getSemestre(), periodoBean.periodo.getAno());
        
        return materia;
    }

    public List<Clase> getClases() {
        
        List<Clase> clases=null;
        for(int i=0; i<materia.size();i++){
            if(materia.get(i).getCodigo()==materiaSelec){
                clases=materia.get(i).getClases();
            }
        }
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }

    public String getMateriaSelec() {
        return materiaSelec;
    }

    public void setMateriaSelec(String materiaSelec) {
        this.materiaSelec = materiaSelec;
    }

    public PeriodoBean getPeriodoBean() {
        return periodoBean;
    }

    public void setPeriodoBean(PeriodoBean periodoBean) {
        this.periodoBean = periodoBean;
    }
    
    
}
