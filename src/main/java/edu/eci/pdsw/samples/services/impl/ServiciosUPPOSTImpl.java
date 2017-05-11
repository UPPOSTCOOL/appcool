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
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        try {
            return daom.consultarMateriasDAO(semestre, anio);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar materias del semestre: " + semestre + "y año: " + anio + ex);
        }
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
    public List<Clase> consultarClasePeriodo(Periodo periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Date> consultarFechas(Periodo fecha) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> consultarPeriodos() throws ExcepcionServiciosUPPOST {
        try {
            return  daoPA.loadAll();
        } catch (PersistenceException ex) {
             throw new ExcepcionServiciosUPPOST("Error al consultar periodos academicos: " + ex);
        }
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
        try {
            return daom.consultarMateriasPorProgramaDAO(id_programa);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar materias Programa en el IMPL: " + ex + id_programa);
        }
    }

    @Override
    public Materia consultarMateriaConRequisitos(String codigo,int id_programa) throws ExcepcionServiciosUPPOST {
        try {
            return daom.consultarMateriaConRequisitosDAO(codigo,id_programa);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar materias con requisitos: " + ex + "codigo: " + codigo + "id_programa" + id_programa);
        }
    }

    @Override
    public List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> consultarPAcademico(Periodo periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> consultarProfesores() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarMateria(Materia materia) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }
}
