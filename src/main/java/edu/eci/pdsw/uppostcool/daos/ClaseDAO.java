/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.daos;

import edu.eci.pdsw.uppostcool.entities.Clase;
import java.sql.Time;
import java.util.Date;

import java.util.List;

/**
 *
 * @author UPPOST-COOL appcool
 */
public interface ClaseDAO {

    public List<Clase> loadClases() throws PersistenceException;

    /**
     *
     * @param ano ano
     * @param semestre semestre
     * @return lista de clases respectivo
     * @throws edu.eci.pdsw.uppostcool.daos.PersistenceException exepcion
     */
    public List<Clase> consultarClasesxPeriodo(int ano, int semestre) throws PersistenceException;

    /**
     *
     * @param fecha fecha
     * @param horaInicio hora inicio
     * @param horaFin hora fun
     * @throws edu.eci.pdsw.uppostcool.daos.PersistenceException exepcion
     */
    public void insertarClase(Date fecha, Time horaInicio, Time horaFin) throws PersistenceException;

    public List<Clase> consultarClasesXprofesor(int ano, int semestre, String profesor);

}
