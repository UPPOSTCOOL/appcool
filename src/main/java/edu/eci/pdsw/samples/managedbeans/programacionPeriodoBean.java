/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
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
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    private String prog=" ";

    
    public List<Programa> getPrograma() throws ExcepcionServiciosUPPOST {
        return inp.consultarProgramas();
        
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
    
}
