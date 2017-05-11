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
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImpl;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImplStub;
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

    private List<Programa> programa = new ArrayList<>();
    private List<Asignatura> asignatura = new ArrayList<>();
    private List<Materia> materia = new ArrayList<>();
    ServiciosUPPOSTImplStub inp = new ServiciosUPPOSTImplStub();
    private String prog = "prueba";
    private int cohorte=0;
    private String profesor=null;

    public List<Programa> getPrograma() throws ExcepcionServiciosUPPOST {
        programa = inp.consultarProgramas();
        return programa;

    }

    public void SetSelected(String p) {
        prog = p;

    }

    public String getSelected() {
        return prog;

    }

    public void setPrograma(List<Programa> programa) {
        this.programa = programa;
    }

    public programacionPeriodoBean() {

    }

    public List<Asignatura> getAsignaturas() throws ExcepcionServiciosUPPOST {
        return inp.consultarAsignaturas();

    }

    /**
     * Provisional para vista
     *
     * @return
     */
    public List<Materia> getMateria() throws ExcepcionServiciosUPPOST {

        return inp.consultarMateriasPrograma(programa.get(0).getId());
    }

    /**
     * Provisional para vista
     *
     * @return
     */
    public int getCohorte() {
        return cohorte;
    }
    public void setCohorte(int a) {
        cohorte=a;
    }
    public void setProfesor(String a) {
        String profesor = a;
    }
     public String Profesor() {
        return profesor;
    }
}
