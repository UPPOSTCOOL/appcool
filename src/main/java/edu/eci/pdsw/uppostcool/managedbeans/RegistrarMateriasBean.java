/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Programa;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
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
     public Programa getProgrSeleccionados() {
        return prog;
    }
    
    
    public void programasSeleccionados(int id_prog) {
        //obtenemos el id del programa para con él buscar cuál es 
        //la asignatura que se seleccionó
        
        //en esta listo podemos guardar la asignatura que se seleccionó
        acumulados.add(0, prog);
        
    }
    

    public ArrayList<String[]> getAcumulados() {
        System.out.println("hola");
        //aca debemos ARMAR mediante acumulados los textos que se quieren mostrar en la tabla
        //recuerda que acumulados seraá una lista de ASIGNATURAS
        
        ArrayList<String[]> respuesta = null;
        //= ejemplo:(id_asignatura,nombrePrograma,nombreAsignatura)
        return respuesta;
    }

    public void setAcumulados(ArrayList<Programa> acumulados) {
        this.acumulados = acumulados;
    }
    
   
}
