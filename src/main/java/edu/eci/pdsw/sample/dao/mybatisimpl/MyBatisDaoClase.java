/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sample.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.sampleprj.dao.ClaseDAO;
import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.samples.dao.mybatis.mappers.ClaseMapper;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class MyBatisDaoClase implements ClaseDAO{
    
    @Inject
    private ClaseMapper pmap=null;

    @Override
    public void save(Clase c) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clase load(int id) throws PersistenceException {
        return pmap.consultarClase(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> loadClases() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Materia> consultarMateriasDAO(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
