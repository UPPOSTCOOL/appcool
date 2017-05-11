/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImpl;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImplStub;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 3070465
 */
@ManagedBean(name = "ProgramacionPeriodoBean")
@SessionScoped
public class programacionPeriodoBean {
    private List<Programa> programa=new ArrayList<>();
     private List<Asignatura> asignatura=new ArrayList<>();
     private List<Materia> materia=new ArrayList<>();
    ServiciosUPPOSTImplStub inp=new ServiciosUPPOSTImplStub();
    private String prog="prueba";

    
    public List<Programa> getPrograma() throws ExcepcionServiciosUPPOST {
        programa=inp.consultarProgramas();
        return programa;
        
    }

    public void SetSelected(String p){
    prog=p;
    
    }
   public String getSelected(){
    return prog;
    
    }
    public void setPrograma(List<Programa> programa) {
        this.programa = programa;
    }

    public programacionPeriodoBean() {
        
    }
 public List<Asignatura> getAsignaturas() throws ExcepcionServiciosUPPOST {
       return inp.consultarAsignaturas();
        
    }
    public List<Materia> getMateria() throws ExcepcionServiciosUPPOST {
        Materia m;
        int i = 0;
        while (i < programa.size()) {
            if ((programa.get(i).getNombre()).equals(prog)) {
               materia= inp.consultarMateriasPrograma(programa.get(i).getId());
            }
    }
    return materia;
    }
}
