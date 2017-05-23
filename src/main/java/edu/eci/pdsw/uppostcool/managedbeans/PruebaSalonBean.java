/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.managedbeans;

import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 *
 */
@ManagedBean(name = "PruebaSalonBean")
@SessionScoped
public class PruebaSalonBean implements Serializable {

    private List<Materia> materia = new ArrayList<>();
    private List<Clase> clase = new ArrayList<>();
    private int anio;
    private int semestre;
    private String materiaSelec = null;
    @ManagedProperty(value = "#{PeriodoBean}")
    private PeriodoBean cb;
    //se eligen base de datos local o POSTGRES
    //POSTGRES
    private final ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
    //LOCAL
    //private final ServiciosUPPOST inp=new ServiciosUPPOSTImplStub();

    public PruebaSalonBean() {
    }

    public List<Materia> obtenerLista() throws ExcepcionServiciosUPPOST {

        semestre = cb.getSemestre();
        anio = cb.getAnio();
        materia = inp.consultarMaterias(semestre, anio);
        return materia;
    }

    public List<Clase> getClases() throws ExcepcionServiciosUPPOST {

        materia = obtenerLista();
        for (int i = 0; i < materia.size(); i++) {

            clase.addAll(materia.get(i).getClases());
            System.out.print(clase.get(i).getRecurso());
        }

        return clase;
    }

    public List<Materia> getMateria() {

        return materia;

    }

    public void setMateria(List<Materia> materia) {

        this.materia = materia;
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

    public String periodoSeleccionado() {

        if (cb.getSemestre() == 3) {
            return cb.getAnio() + "-" + "Intersemestral";
        } else {
            return cb.getAnio() + "-" + cb.getSemestre();
        }

    }
}
