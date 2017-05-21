/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Periodo;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.entities.Programa;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImpl;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImplStub;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 3070465
 */
@ManagedBean(name = "ProgramacionPeriodoBean")
@SessionScoped
public class programacionPeriodoBean {

    private List<Programa> programa = new ArrayList<>();
    private List<Asignatura> asignaturas = new ArrayList<>();
    private List<Materia> materia = new ArrayList<>();
    private List<Periodo> periodo = new ArrayList<>();
     private final List<Profesor> profesores = new ArrayList<>();
     private List<Profesor> profesorSelect = new ArrayList<>();
    private String asign;
    private String mate;

    public List<Profesor> getProfesorSelect() {
        return profesorSelect;
    }
    private PeriodoBean cb;
    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    private String prog;
    private int cohorte = 0;
    private String profesor = null;
    private int anio;
    private int semestre;
 
    public programacionPeriodoBean() throws ExcepcionServiciosUPPOST {

        prog = "prueba";
        anio = 2017;
        prog = "mate";
        semestre=1;
        
    }
    
    public String getAsign() {
        return asign;
    }
    public void setAsign(String asign) {
        this.asign = asign;
    }
    
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getCohorte() {
        return cohorte;
    }

    public void setCohorte(int cohorte) {
        this.cohorte = cohorte;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getMate() {
        return mate;
    }

    public void setMate(String mate) {
        this.mate = mate;
    }

    public List<Programa> getPrograma() throws ExcepcionServiciosUPPOST {
        programa = inp.consultarProgramas();
        return programa;
    }
    public void setPrograma(List<Programa> programa) {
        this.programa = programa;
    }
    public List<Periodo> getPeriodo() throws ExcepcionServiciosUPPOST {
        periodo = inp.consultarPAcademicos();
        return periodo;

    }
    public void setPeriodo(List<Periodo> periodo) {
        this.periodo = periodo;
    }

    public String getProg() {
        return prog;
    }

    public void setProg(String prog) {
        this.prog = prog;
    }

    public List<Asignatura> getAsignaturas() throws ExcepcionServiciosUPPOST {
        return inp.consultarAsignaturas();

    }

    public List<Materia> getMateria() throws ExcepcionServiciosUPPOST {
        materia = inp.consultarMaterias(semestre, anio);
        return materia;
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

    public PeriodoBean getCb() {
        return cb;
    }

    public void setCb(PeriodoBean cb) {
        this.cb = cb;
    }
    public void setProfesorSelect() throws ExcepcionServiciosUPPOST {
        
        List<Profesor> p=new ArrayList<>();
        List<Profesor> p1=new ArrayList<>();
        p=inp.consultarProfesores();
        for(int i=0;i<p.size();i++){
            if(p.get(i).getApellidoUno().equals(profesor)||p.get(i).getApellidoDos().equals(profesor) ) p1.add(p.get(i));
        
        }
       profesorSelect=p;
        System.out.println(profesorSelect.get(0).getNombre());
    }
   

}
