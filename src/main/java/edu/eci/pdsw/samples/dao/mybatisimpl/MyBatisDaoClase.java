/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.daos.ClaseDAO;
import edu.eci.pdsw.samples.daos.PersistenceException;
import edu.eci.pdsw.samples.dao.mybatis.mappers.ClaseMapper;

import edu.eci.pdsw.samples.entities.Clase;

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
    
}
