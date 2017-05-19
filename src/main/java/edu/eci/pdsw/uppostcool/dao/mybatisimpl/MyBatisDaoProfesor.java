/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.uppostcool.daos.PersistenceException;
import edu.eci.pdsw.uppostcool.daos.ProfesorDAO;
import edu.eci.pdsw.uppostcool.dao.mybatis.mappers.ProfesorMapper;
import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Profesor;

import java.util.List;

/**
 *
 * @author 2092815
 */
public class MyBatisDaoProfesor implements ProfesorDAO{
    
    @Inject
    private ProfesorMapper pmap;


    @Override
    public void save(ProfesorDAO c) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProfesorDAO load(int id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProfesorDAO> loadAll() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Profesor> consultarProfesor() throws PersistenceException {
         return pmap.consultarProfesor();
    }
    
}
