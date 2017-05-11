/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.daos;

import edu.eci.pdsw.uppostcool.entities.Clase;

import java.util.List;

/**
 *
 * @author appcool
 */
public interface ClaseDAO {
    


    public List<Clase> loadClases() throws PersistenceException;

    /**
     *
     * @param ano
     * @param semestre
     * @return
     * @throws edu.eci.pdsw.uppostcool.daos.PersistenceException
     */
    public List<Clase> consultarClasesxPeriodo(int ano , int semestre) throws PersistenceException;
    
    
}
