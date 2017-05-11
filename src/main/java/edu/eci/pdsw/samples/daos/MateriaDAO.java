/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.daos;

import edu.eci.pdsw.samples.entities.Materia;

import java.util.List;

/**
 *
 * @author appcool
 */
public interface MateriaDAO {

    public List<Materia> consultarMateriasDAO(int semestre,int anio) throws PersistenceException;
    
    public List<Materia> consultarMateriasPorProgramaDAO(int id_programa) throws PersistenceException;
    
    public Materia consultarMateriaConRequisitosDAO(String codigo,int id_programa) throws PersistenceException;
    
    public void insertarMateriaDAO(Materia materia, List<String[]> pre, List<String[]> co,List<Integer> ids_asignatura);
}
