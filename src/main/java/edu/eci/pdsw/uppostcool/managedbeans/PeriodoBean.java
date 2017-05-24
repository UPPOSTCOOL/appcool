/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Periodo;
import edu.eci.pdsw.uppostcool.services.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author UPPOST-COOL
 */
@ManagedBean(name = "PeriodoBean")
@SessionScoped
public class PeriodoBean implements Serializable {

    private List<Periodo> period = new ArrayList<>();
    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();

    private int anio;
    private int semestre;

    public PeriodoBean() {

    }

    public int getAnio() {
        // System.out.println(anio);
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

    public List<Periodo> getPeriodo() throws ExcepcionServiciosUPPOST {
        return inp.consultarPAcademicos();
    }

    public void setPeriodo(List<Periodo> p) throws ExcepcionServiciosUPPOST {
        period = p;
    }

}
