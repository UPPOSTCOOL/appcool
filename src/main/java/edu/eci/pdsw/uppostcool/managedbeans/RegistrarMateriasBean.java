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
import java.util.Arrays;
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

    private List<Programa> programa = new ArrayList<>();//lista de programas
    private List<Asignatura> asignaturasProgramaSeleccionado = new ArrayList<>();
    private int id_asignaturaSeleccionada;
    private Programa progParaAsigSeleccionado;
    private int progParaMateriaSeleccionado;
    private Materia preRequisitoSeleccionado;
    private Materia coRequisitoSeleccionado;
    private Programa prog;
    private List<Materia> MateriasParaPrerequisito;
    private List<Materia> MateriasParaCorequisito;
    private List<Materia> RequisitosAgregados;
    private List<Materia> requisitos;
    
    ArrayList<Asignatura> acumulados= new ArrayList<>();

    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();

    public List<Asignatura> getAsignaturasProgramaSeleccionado() {
        return asignaturasProgramaSeleccionado;
    }
    
    public RegistrarMateriasBean() {
    }

    public List<Materia> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Materia> requisitos) {
        this.requisitos = requisitos;
    }
    
    public int getProgParaMateriaSeleccionado() {
        return progParaMateriaSeleccionado;
    }

    public void setProgParaMateriaSeleccionado(int progParaMateriaSeleccionado) {
        System.out.println("Guardando programa");
        this.progParaMateriaSeleccionado = progParaMateriaSeleccionado;
    }

    public int getId_asignaturaSeleccionada() {
        return id_asignaturaSeleccionada;
    }

    public void setId_asignaturaSeleccionada(int id_asignaturaSeleccionada) {
        this.id_asignaturaSeleccionada = id_asignaturaSeleccionada;
    }

    public List<Materia> getRequisitosAgregados() throws ExcepcionServiciosUPPOST {
        return RequisitosAgregados;
    }

    public void setRequisitosAgregados(List<Materia> RequisitosAgregados) {
        this.RequisitosAgregados = RequisitosAgregados;
    }

    public Materia getPreRequisitoSeleccionado() {
        return preRequisitoSeleccionado;
    }

    public void setPreRequisitoSeleccionado(Materia preRequisitoSeleccionado) {
        this.preRequisitoSeleccionado = preRequisitoSeleccionado;
    }

    public Materia getCoRequisitoSeleccionado() {
        return coRequisitoSeleccionado;
    }

    public void setCoRequisitoSeleccionado(Materia coRequisitoSeleccionado) {
        this.coRequisitoSeleccionado = coRequisitoSeleccionado;
    }

    public List<Materia> getMateriasParaPrerequisito() throws ExcepcionServiciosUPPOST {
        List<Materia> res=null;
        if(progParaMateriaSeleccionado>0){
            for (int i = 0; i <programa.size(); i++) {
                if(programa.get(i).getId()==progParaMateriaSeleccionado)res=inp.consultarMateriasPrograma(progParaMateriaSeleccionado);
            }
        }
        return res;
    }

    public void setMateriasParaPrerequisito(List<Materia> MateriasParaPrerequisito) {
        this.MateriasParaPrerequisito = MateriasParaPrerequisito;
    }

    public List<Materia> getMateriasParaCorequisito() {
        return MateriasParaCorequisito;
    }

    public void setMateriasParaCorequisito(List<Materia> MateriasParaCorequisito) {
        this.MateriasParaCorequisito = MateriasParaCorequisito;
    }
    
    public List<Programa> obtenerProgramas() throws ExcepcionServiciosUPPOST {
        programa = inp.consultarProgramas();
        return programa;
    }

    public void eliminarPrograma(int id_prog) {
        programa.remove(id_prog);

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
                progParaAsigSeleccionado=programa.get(i);
            }
        }
    }
    
    public void guardarAsignaturaPrograma(){
        //obtenemos el id del programa para con él buscar cuál es 
        //la asignatura que se seleccionó
        Boolean yaIngresada=false;
        //en esta lista podemos guardar la asignatura que se seleccionó
        for (int i = 0; i < asignaturasProgramaSeleccionado.size(); i++) {
            if(asignaturasProgramaSeleccionado.get(i).getId()==id_asignaturaSeleccionada){
                asignaturasProgramaSeleccionado.get(i).setPostgrado(progParaAsigSeleccionado);
                for (int a = 0; a < acumulados.size(); a++) {
                    if(acumulados.get(a).getId()==id_asignaturaSeleccionada)yaIngresada=true;
                }
                if(!yaIngresada)acumulados.add(asignaturasProgramaSeleccionado.get(i));
            }
        }
    }
     
    public List<String[]> getAcumulados() {
        
        //aca debemos ARMAR mediante acumulados los textos que se quieren mostrar en la tabla
        //recuerda que acumulados seraá una lista de ASIGNATURAS
        List<String[]> respuesta = new ArrayList<>();
        String[] fila;
        for (int i=0;i<acumulados.size();i++){
            fila=new String[3];
            fila[0]=Integer.toString(acumulados.get(i).getId());
            fila[1]=acumulados.get(i).getPostgrado().getNombre();
            fila[2]=acumulados.get(i).getNombre();
            respuesta.add(fila);
        }
        return respuesta;
    }

    public void setAcumulados(ArrayList<Asignatura> acumulados) {
        this.acumulados = acumulados;
    }
    
    public void eliminarAsignaturaPrograma(int id_asigEliminar){
        for (int i=0;i<acumulados.size();i++){
            if(acumulados.get(i).getId()==id_asigEliminar)acumulados.remove(i);
        }
    }
}
