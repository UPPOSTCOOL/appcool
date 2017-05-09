/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.dao.mybatis.mappers.ProgramaMapper;
import edu.eci.pdsw.samples.daos.PersistenceException;
import edu.eci.pdsw.samples.daos.ProgramaDAO;
import edu.eci.pdsw.samples.entities.Programa;

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
    
}