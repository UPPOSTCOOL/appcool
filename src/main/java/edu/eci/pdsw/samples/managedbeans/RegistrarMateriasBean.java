/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Paula
 */

@ManagedBean(name = "MateriasBean")
@SessionScoped
public class RegistrarMateriasBean implements Serializable{
    private List<Programa> programa=new ArrayList<>();
    
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();

    public RegistrarMateriasBean() {
    }
    
    public List<Programa> obtenerProgramas() throws ExcepcionServiciosUPPOST{
        programa = inp.consultarProgramas();
        return programa;
    }
    
}
