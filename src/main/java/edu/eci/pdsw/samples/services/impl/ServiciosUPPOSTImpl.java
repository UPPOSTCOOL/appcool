/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.daos.AsignaturaDAO;
import edu.eci.pdsw.samples.daos.ClaseDAO;
import edu.eci.pdsw.samples.daos.PAcademicoDAO;
import edu.eci.pdsw.samples.daos.MateriaDAO;
import edu.eci.pdsw.samples.daos.PersistenceException;
import edu.eci.pdsw.samples.daos.ProfesorDAO;
import edu.eci.pdsw.samples.daos.ProgramaDAO;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Programa;
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
    @Inject
    private ProgramaDAO daoP;

    @Override
    public Clase consultarClase(int id) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        try {
            return daoPA.loadAll();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar los periodos academicos, ServiciosUPPOSTImpl inicio de excepcion", ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Materia> consultarMaterias(int semestre,int anio) throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriasDAO(semestre,anio);
    }
    
    //.....//
    @Override
    public List<Periodo> consultarPAcademico(Periodo periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<Clase> consultarClasePeriodo(Periodo periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Date> consultarFechas(Periodo fecha) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Programa> consultarProgramas() throws ExcepcionServiciosUPPOST {
        List<Programa> res=null;
        try {
            res=daoP.loadAll();
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosUPPOSTImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public List<Materia> consultarMateriasPrograma(int id_programa) throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriasPorProgramaDAO(id_programa);
    }

    @Override
    public Materia consultarMateriaConRequisitos(int id) throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriaConRequisitosDAO(id);
    }
}
