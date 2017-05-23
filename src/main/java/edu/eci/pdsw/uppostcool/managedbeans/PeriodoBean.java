/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;


import edu.eci.pdsw.uppostcool.entities.Periodo;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImplStub;

import java.io.Serializable;
import java.util.ArrayList;
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
