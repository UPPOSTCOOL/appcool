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
    private List<Asignatura> asignaturasProgramaSeleccionado = new ArrayList<>();
    private int id_asignaturaSeleccionada;
    private Materia preRequisitos;
    private Programa prog;
    
    ArrayList<Asignatura> acumulados= new ArrayList<>();

    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();

    public List<Asignatura> getAsignaturasProgramaSeleccionado() {
        return asignaturasProgramaSeleccionado;
    }


    public RegistrarMateriasBean() {
    }

    public int getId_asignaturaSeleccionada() {
        return id_asignaturaSeleccionada;
    }

    public void setId_asignaturaSeleccionada(int id_asignaturaSeleccionada) {
        this.id_asignaturaSeleccionada = id_asignaturaSeleccionada;
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
        //luego de seleccionar el programa guardamos las asignaturas
        for (int i = 0; i < programa.size(); i++) {
            if(programa.get(i).getId()==id_prog){
                prog=programa.get(i);
                asignaturasProgramaSeleccionado=programa.get(i).getAsignaturas();
            }
        }
    }
    
    public void guardarAsignaturaPrograma(){
        //obtenemos el id del programa para con él buscar cuál es 
        //la asignatura que se seleccionó
        
        //en esta lista podemos guardar la asignatura que se seleccionó
        for (int i = 0; i < programa.size(); i++) {
            if(asignaturasProgramaSeleccionado.get(i).getId()==id_asignaturaSeleccionada){
                acumulados.add(asignaturasProgramaSeleccionado.get(i));
            }
        }
    }
    

    public ArrayList<String[]> getAcumulados() {
        System.out.println("hola");
        //aca debemos ARMAR mediante acumulados los textos que se quieren mostrar en la tabla
        //recuerda que acumulados seraá una lista de ASIGNATURAS
        
        ArrayList<String[]> respuesta = null;
        //= ejemplo:(id_asignatura,nombrePrograma,nombreAsignatura)
        return respuesta;
    }

    public void setAcumulados(ArrayList<Asignatura> acumulados) {
        this.acumulados = acumulados;
    }
    
   
}
