/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.sampleprj.dao.ClaseDAO;
import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import java.util.List;

/**
 *
 * @author juan
 */
public class ServiciosUPPOSTImpl implements ServiciosUPPOST {
    
    @Inject
    private ClaseDAO daoc;

    @Override
    public Clase consultarClase(int id) throws ExcepcionServiciosUPPOST {
        try {
            return daoc.load(id);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar clase, ServiciosUPPOSTImpl inicio de excepcion", ex);
        }
        
    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClasesPeriodo() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
