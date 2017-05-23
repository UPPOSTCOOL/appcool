/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Periodo;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.entities.Programa;
import edu.eci.pdsw.uppostcool.entities.Recurso;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImpl;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImplStub;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
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
    private List<Profesor> profesorSelect = new ArrayList<>();
    private List<Clase> clases= new ArrayList<>();
    private List<String> recursos=new ArrayList<>();
    private List<String> recusosSelect=new ArrayList<>();

   
    private Programa programaP;
    private Materia materi;
    private PeriodoBean cb;
   
    private String prog;
    private String profesor = null;
    private String asign;
    private String mate;

    
    private int anio;
    private int semestre;
    private int cohorte = 0;
    private int idasign;
    private Date date =new Date();
    private Time horaInicio;
    private Time horaFin;

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    
    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getDate() {
        
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
 
     private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();

    public List<Profesor> getProfesorSelect() {
        return profesorSelect;
    }
  
    public programacionPeriodoBean() throws ExcepcionServiciosUPPOST {

        prog = "prueba";
        anio = 2017;
        prog = " ";
        semestre=1;
        programaP=null;
        
        
    }
   
    public String getAsign() {
        return asign;
    }

    public void setAsign(String asign) {
        this.asign = asign;
    }

    public int getIdasign() {
        return idasign;
    }

    public void setIdasign(int Idasign) {
        this.idasign = Idasign;
    }
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
        public List<Asignatura> getAsignaturas() throws ExcepcionServiciosUPPOST {
        System.out.println(prog);
        Programa p=null;
        for(int i=0;i<programa.size();i++){
        if((programa.get(i).getNombre()).equals(prog)) p=programa.get(i);
        }
          // asignaturas=p.getAsignaturas();
          asignaturas=inp.consultarAsignaturas();
        return inp.consultarAsignaturas();
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

    public List<Programa> getProgramas() throws ExcepcionServiciosUPPOST {
        programa = inp.consultarProgramas();
        return programa;
    }
    public void setProgramas(List<Programa> programa) {
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
    public void nuevaAsignatura(){
        
        Asignatura a=new Asignatura(idasign,asign,programaP);
        
    
    
    }
    public Programa getPrograma(){
     for(int i=0;i<programa.size();i++){
        if((programa.get(i).getNombre()).equals(prog)) programaP=programa.get(i);
        }
    return programaP;
    
    }
     public Materia convertir(){
     for(int i=0;i<materia.size();i++){
        if((materia.get(i).getNombre()).equals(mate)) materi=materia.get(i);
        }
    return materi;
    
    }
    public List<Clase> getClase(){
            
          clases=materi.getClases();
           clases=null;
           return clases;
    
    
    }
    public void cancelarClase(){}
    //pendiente por servicio

    public List<String> getRecursos() throws ExcepcionServiciosUPPOST {

        clases = inp.consultarClasesxPeriodo(anio, semestre);
        for (int i = 0; i < clases.size(); i++) {
            recursos.add(clases.get(i).getRecurso());

        }
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }
     public List<String> getRecusosSelect() {
         recusosSelect.add(mate);
        return recusosSelect;
    }

    public void setRecusosSelect(List<String> recusosSelect) {
        this.recusosSelect = recusosSelect;
    }
}
