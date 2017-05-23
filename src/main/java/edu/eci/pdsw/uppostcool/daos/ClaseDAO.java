/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.daos;

import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import java.sql.Time;
import java.util.Date;

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
    
    /**
     *
     * @param fecha
     * @param horaInicio
     * @param horaFin
     * @throws edu.eci.pdsw.uppostcool.daos.PersistenceException
     */
    public void insertarClase (Date fecha, Time horaInicio, Time horaFin) throws PersistenceException;
    
    public List<Clase> consultarClasesXprofesor (int ano, int semestre, Profesor profesor);
    
}
