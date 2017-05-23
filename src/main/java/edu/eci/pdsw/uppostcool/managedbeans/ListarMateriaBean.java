/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImpl;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author sergio
 */
@ManagedBean(name = "listarMateria")
@SessionScoped
public class ListarMateriaBean{
    
    private List<Materia> materias;

   
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    
    public ListarMateriaBean(){
        materias = new ArrayList<>();
    }

    public List<Materia> getMaterias() throws ExcepcionServiciosUPPOST {
        materias=inp.consultarMaterias();
        return materias;
    }
 public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
