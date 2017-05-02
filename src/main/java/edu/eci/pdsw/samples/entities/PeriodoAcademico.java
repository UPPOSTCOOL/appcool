/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 2092815
 */

public class PeriodoAcademico implements Serializable {

    private int id;
    private List<Materia> materias;
    private int ano;
    private int semestre;


    public PeriodoAcademico(int id, List<Materia> materias, int ano, int semestre) {

        this.id = id;
        this.materias = materias;
        this.ano = ano;
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
    @Override
    public String toString() {
        return "PeriodoAcademico{" + "id=" + id + ", año=" + ano + ", semestre=" + semestre   + ", Materias=" +  '}';
    }
    
    
    
}
