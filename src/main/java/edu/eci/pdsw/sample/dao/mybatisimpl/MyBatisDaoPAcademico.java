/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sample.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.sampleprj.dao.PAcademicoDAO;
import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.samples.dao.mybatis.mappers.PAcademicoMapper;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import java.util.List;

/**
 *
 * @author 2092815
 */
public class MyBatisDaoPAcademico implements PAcademicoDAO{
    
    @Inject
    private PAcademicoMapper pmap=null;


    @Override
    public void save(PeriodoAcademico c) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PeriodoAcademico load(int id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PeriodoAcademico> loadAll() throws PersistenceException {
        return pmap.consultarPAcademicos();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
