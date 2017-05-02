/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;

import edu.eci.pdsw.samples.daos.AsignaturaDAO;
import edu.eci.pdsw.samples.daos.ClaseDAO;
import edu.eci.pdsw.samples.daos.PAcademicoDAO;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.daos.MateriaDAO;
import edu.eci.pdsw.samples.daos.PersistenceException;
import edu.eci.pdsw.samples.daos.ProfesorDAO;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
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
    @Inject
    private PAcademicoDAO daoPA;
    @Inject
    private MateriaDAO daom;
    @Inject
    private ProfesorDAO daoPO;
    @Inject
    private AsignaturaDAO daoA;

    @Override
    public Clase consultarClase(int id) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public List<PeriodoAcademico> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        try {
            return daoPA.loadAll();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar los periodos academicos, ServiciosUPPOSTImpl inicio de excepcion", ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriasDAO(semestre, anio);
    }

    @Override
    public List<Clase> consultarClasesxPeriodo(PeriodoAcademico periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
