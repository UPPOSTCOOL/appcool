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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Paula
 */
@ManagedBean(name = "MateriasBean")
@SessionScoped
public class RegistrarMateriasBean implements Serializable {

    private List<Programa> programa = new ArrayList<>();
    private Materia preRequisitos;

    Programa prog;
    
    ArrayList<Programa> acumulados= new ArrayList<>();

    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();

    public RegistrarMateriasBean() {
    }

    public List<Programa> obtenerProgramas() throws ExcepcionServiciosUPPOST {
        programa = inp.consultarProgramas();
        return programa;
    }

    public Materia requisitos() throws ExcepcionServiciosUPPOST {
        String codigo = preRequisitos.getNombre();
        preRequisitos = inp.consultarMateriaConRequisitos(codigo, 0);

        return preRequisitos;
    }

    /**
     * Eliminar el programa de la tabla
     *
     * @param id
     */
    public void eliminarPrograma(Programa id) {
        programa.remove(id);

    }
     public Programa getProductoSelect() {
        return prog;
    }
    
    /** 
    public void programasSeleccionados() {
        Programa programas= new Programa(prog.getId(), prog.getNombre());
        acumulados.add(programas);
        
    }
    */

    public ArrayList<Programa> getAcumulados() {
        return acumulados;
    }

    public void setAcumulados(ArrayList<Programa> acumulados) {
        this.acumulados = acumulados;
    }
    
   
}
