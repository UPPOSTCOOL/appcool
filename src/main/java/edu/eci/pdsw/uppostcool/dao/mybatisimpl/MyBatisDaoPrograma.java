/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.uppostcool.dao.mybatis.mappers.ProgramaMapper;
import edu.eci.pdsw.uppostcool.daos.PersistenceException;
import edu.eci.pdsw.uppostcool.daos.ProfesorDAO;
import edu.eci.pdsw.uppostcool.daos.ProgramaDAO;
import edu.eci.pdsw.uppostcool.entities.Programa;

import java.util.List;

/**
 *
 * @author 2092815
 */
public class MyBatisDaoPrograma implements ProgramaDAO{
    
    @Inject
    private ProgramaMapper pmap;

    @Override
    public List<Programa> loadAll() throws PersistenceException {
        return pmap.consultarProgramas();
    }

    @Override
    public Programa cargar(String nombre) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Programa programa) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
