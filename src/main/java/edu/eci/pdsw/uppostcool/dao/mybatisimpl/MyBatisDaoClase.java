/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.uppostcool.daos.ClaseDAO;
import edu.eci.pdsw.uppostcool.daos.PersistenceException;
import edu.eci.pdsw.uppostcool.dao.mybatis.mappers.ClaseMapper;

import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import java.sql.Time;
import java.util.Date;

import java.util.List;

/**
 *
 * @author juan
 */
public class MyBatisDaoClase implements ClaseDAO{
    
    @Inject
    private ClaseMapper pmap;
    
    @Override
    public List<Clase> loadClases() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClasesxPeriodo(int ano , int semestre) throws PersistenceException {
         return pmap.consultarClases(ano, semestre);
    }

    @Override
    public void insertarClase(Date fecha, Time horaInicio, Time horaFin) throws PersistenceException {
        
        java.sql.Timestamp s = new java.sql.Timestamp(fecha.getYear(), fecha.getMonth(), fecha.getDay(), horaInicio.getHours(), horaInicio.getMinutes(), 0, 0);
        pmap.insertarClase(s, horaFin);
    }

    /**
     *
     * @param ano
     * @param semestre
     * @param profesor
     * @return
     * @throws PersistenceException
     */
    @Override
    public List<Clase> consultarClasesXprofesor(int ano, int semestre, Profesor profesor){
        return pmap.consultarClasesXprofesor(ano, semestre, profesor.getNombre());
    }
    
}
