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
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImplStub;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
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
       
    
    private List<Materia> materia=new ArrayList<>();
    private int anio;
    private int semestre;
    private String materiaSelec=null;
    //se eligen base de datos local o POSTGRES
    //POSTGRES
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    //LOCAL
    //private final ServiciosUPPOST inp=new ServiciosUPPOSTImplStub();
        
    
    public ReporteProgramacionBean(){
        // se elimina initList();  para trabajar directamente acá...
        //se asume que se ha eligido semestre y anio
        semestre=1;
        anio=2016;
    }
    
    public List<Materia> obtenerLista() throws ExcepcionServiciosUPPOST{
        
        materia = inp.consultarMaterias(anio, semestre);
        return materia;
    }

    public List<Clase> getClases() {
        List<Clase> clases=null;
        for(int i=0; i<materia.size();i++){
            if(materia.get(i).getCodigo().equals(materiaSelec)){
                clases=materia.get(i).getClases();
            }
        }
        return clases;
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
    
    
    

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
