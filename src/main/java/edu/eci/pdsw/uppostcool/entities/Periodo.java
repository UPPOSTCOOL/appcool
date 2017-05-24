/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.entities;

import java.util.List;

/**
 *
 * @author UPPOST-COOL
 */
public class Periodo {

    private int id;
    private List<Materia> materias;
    private int ano;
    private int semestre;

    public Periodo() {
    }

    public Periodo(int id, List<Materia> materias, int ano, int semestre) {
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

    public void nuevoPeriodo() {

    }

}
