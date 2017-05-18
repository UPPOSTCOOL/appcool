/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Periodo;
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
    private List<Asignatura> asignatura = new ArrayList<>();
    private List<Materia> materia = new ArrayList<>();
    private List<Periodo> periodo = new ArrayList<>();

    private PeriodoBean cb;
    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    private String prog;
    private int cohorte = 0;
    private String profesor = null;
    private int anio;
    private int semestre;

    public programacionPeriodoBean() {
        prog = "prueba";
        anio = 2017;
    }

    public List<Programa> getPrograma() throws ExcepcionServiciosUPPOST {
        programa = inp.consultarProgramas();
        return programa;

    }

    public String getProg() {
        return prog;
    }

    public void setProg(String prog) {
        this.prog = prog;
    }

    public void setPrograma(List<Programa> programa) {
        this.programa = programa;
    }

    public List<Asignatura> getAsignaturas() throws ExcepcionServiciosUPPOST {
        return inp.consultarAsignaturas();

    }

    /**
     * Provisional para vista
     *
     * @return
     * @throws edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST
     */
    public List<Materia> getMateria() throws ExcepcionServiciosUPPOST {

        return inp.consultarMateriasPrograma(programa.get(0).getId());
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

    public List<Periodo> getPeriodos() throws ExcepcionServiciosUPPOST {
        periodo = inp.consultarPAcademicos();
        return inp.consultarPAcademicos();
    }
}
