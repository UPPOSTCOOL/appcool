/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;



import edu.eci.pdsw.samples.daos.*;


import edu.eci.pdsw.samples.entities.*;

import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        try {
            return daom.consultarMateriasDAO(semestre, anio);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar materias del semestre: " + semestre + "y año: " + anio + ex);
        }
    }

    @Override
    public List<Profesor> consultarProfesores() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor consultarProfesor(int cohorte, String materia) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClasesxPeriodo(int año, int semestre) throws ExcepcionServiciosUPPOST {
        try {
            return daoc.consultarClasesxPeriodo(año, semestre);
        }catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar clases del periodo: " + año + ex);

        }
    }

    @Override
    public List<Clase> consultarClasePeriodo(PeriodoAcademico periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Date> consultarFechas(PeriodoAcademico fecha) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PeriodoAcademico> consultarPeriodos() throws ExcepcionServiciosUPPOST {
        try {
            return  daoPA.loadAll();
        } catch (PersistenceException ex) {
             throw new ExcepcionServiciosUPPOST("Error al consultar periodos academicos: " + ex);
        }
    }

}
