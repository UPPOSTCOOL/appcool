/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.daos.PAcademicoDAO;
import edu.eci.pdsw.samples.daos.PersistenceException;
import edu.eci.pdsw.samples.dao.mybatis.mappers.PAcademicoMapper;
import edu.eci.pdsw.samples.entities.Periodo;
import java.util.List;

/**
 *
 * @author 2092815
 */
public class MyBatisDaoPAcademico implements PAcademicoDAO{
    
    @Inject
    private PAcademicoMapper pmap;


    @Override
    public List<Periodo> loadAll() throws PersistenceException {
        return pmap.consultarPAcademicos();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Periodo c) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Periodo load(int id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveAll() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
 


    
}
