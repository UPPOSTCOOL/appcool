/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImplStub;
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2092815
 */
@ManagedBean(name = "PeriodoBean")
@SessionScoped
public class PeriodoBean implements Serializable{
    private List<Periodo> period=new ArrayList<>();
    ServiciosUPPOSTImplStub inp=new ServiciosUPPOSTImplStub();
    private int anio;
    private int semestre;

    public PeriodoBean() {
      
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

    public List<Periodo> getPeriodo() throws ExcepcionServiciosUPPOST{
       return inp.consultarPAcademicos();
    }
    
}
