/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.uppostcool.entities.Periodo;
import edu.eci.pdsw.uppostcool.daos.AsignaturaDAO;
import edu.eci.pdsw.uppostcool.daos.ClaseDAO;
import edu.eci.pdsw.uppostcool.daos.PAcademicoDAO;
import edu.eci.pdsw.uppostcool.daos.MateriaDAO;
import edu.eci.pdsw.uppostcool.daos.PersistenceException;
import edu.eci.pdsw.uppostcool.daos.ProfesorDAO;
import edu.eci.pdsw.uppostcool.daos.ProgramaDAO;
import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.entities.Programa;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import java.sql.Time;
import java.util.ArrayList;
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

    //---------------------------------------------------------------ServiciosClase
    @Override
    public Clase consultarClase(int id) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
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
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar clases del periodo: " + año + ex);

        }
    }

    @Override
    public List<Clase> consultarClasePeriodo(Periodo periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarClase(Date fecha, Time horaInicio, Time horaFin) throws ExcepcionServiciosUPPOST {
        try {
            daoc.insertarClase(fecha, horaInicio, horaFin);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("No se pudo agregas sesion de clase en la fecha: " + fecha + "y en la hora: " + horaInicio + ex);
        }
    }

    //---------------------------------------------------------------ServiciosMateria
    
    @Override
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        try {
            return daom.consultarMateriasDAO(semestre, anio);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar materias del semestre: " + semestre + "y año: " + anio + ex);
        }
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
    public Materia consultarMateriaConRequisitos(String codigo, int id_programa) throws ExcepcionServiciosUPPOST {
        try {
            return daom.consultarMateriaConRequisitosDAO(codigo, id_programa);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar materias con requisitos: " + ex + "codigo: " + codigo + "id_programa" + id_programa);
        }
    }

 
 


  
    @Override
    public void insertarMateria(Materia materia, List<TupleImp> prerequisito, List<TupleImp> corequisito, List<Asignatura> asignaturas) throws ExcepcionServiciosUPPOST {
        if(!"".equals(materia.getNombre()) && !"".equals(materia.getCodigo()) && (prerequisito.size()==0 || prerequisito.size()>0 && !prerequisito.equals(corequisito))){
            

            List<String> nombres = new ArrayList<>();
            List<Materia> listaN = consultarMaterias();

            List<String> codigos = new ArrayList<>();
            List<Materia> listaC = consultarMaterias();

            
            for(int i=0;i<listaN.size();i++){nombres.add(listaN.get(i).getNombre());}
            for(int i=0;i<listaC.size();i++){codigos.add(listaC.get(i).getCodigo());}
                    
            if(!codigos.contains(materia.getCodigo())){

                List<String[]> listaPre = new ArrayList<>();
                List<String[]> listaCor = new ArrayList<>();
                String[] temp = new String[2];

                for (int i = 0; i < prerequisito.size(); i++) {
                    temp[0] = ((Materia) prerequisito.get(i).get(0)).getCodigo();
                    temp[1] = Integer.toString(((Programa) prerequisito.get(i).get(1)).getId());
                    listaPre.add(temp);
                }

                for (int i = 0; i < corequisito.size(); i++) {
                    temp[0] = ((Materia) corequisito.get(i).get(0)).getCodigo();
                    temp[1] = Integer.toString(((Programa) corequisito.get(i).get(1)).getId());
                    listaCor.add(temp);
                }

                List<Integer> id_asigs = new ArrayList<>();

                for (int i = 0; i < asignaturas.size(); i++) {
                    id_asigs.add(asignaturas.get(i).getId());
                }



                daom.insertarMateriaDAO(materia,listaPre, listaCor, id_asigs);
            }
        }
    }


    @Override
    public List<Materia> consultarMaterias() throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriasDAO();
    }

    //---------------------------------------------------------------ServiciosPeriodo
    
    @Override
    public List<Periodo> consultarPeriodos() throws ExcepcionServiciosUPPOST {
        /*try {
            return daoPA.loadAll();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar periodos academicos: " + ex);
        }*/
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<Periodo> consultarPAcademico() throws ExcepcionServiciosUPPOST {
        try {
            return daoPA.consultarPAcademico();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("No se pudo consultar periodos: " + ex);
        }
    }

    //---------------------------------------------------------------ServiciosProfesor
   

    @Override
    public List<Profesor> consultarProfesores() throws ExcepcionServiciosUPPOST {
        try {
            return daoPO.loadAll();
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar todos los profesores: " + ex );

        }
        
    }

    @Override
    public List<Profesor> consultarProfesoresXnombre(String nombre) throws ExcepcionServiciosUPPOST {
        try {
            return daoPO.consultarProfesoresXnombre(nombre);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosUPPOST("Error al consultar profesores con nombres o apellidos: " + nombre + ex);
        }
    }

    //---------------------------------------------------------------ServiciosPrograma
    @Override
    public List<Programa> consultarProgramas() throws ExcepcionServiciosUPPOST {
        List<Programa> res = null;
        try {
            res = daoP.loadAll();
        } catch (PersistenceException ex) {
            //Logger.getLogger(ServiciosUPPOSTImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExcepcionServiciosUPPOST("Error al consultar todos los programas academicos: " + ex);
        }
        return res;
    }

    @Override
    public Programa consultarPrograma(String nombre) throws ExcepcionServiciosUPPOST {
        try {
            return daoP.cargar(nombre);
        } catch (PersistenceException ex) {
            //Logger.getLogger(ServiciosUPPOSTImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExcepcionServiciosUPPOST("Error al consultar el programa con nombre: " + nombre + ex);
        }
    }

    @Override
    public void registrarPrograma(Programa programa) throws ExcepcionServiciosUPPOST {
        try {
            daoP.save(programa);
        } catch (PersistenceException ex) {
            //Logger.getLogger(ServiciosUPPOSTImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExcepcionServiciosUPPOST("Error al registrar el programa con nombre: " + programa.getNombre() + ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //---------------------------------------------------------------ServiciosAsignatura
  

    
    //----------------------------------------------------------------ServiciosVarios
    
    @Override

    public List<Date> consultarFechas(Periodo fecha) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClasesXprofesor(int ano, int semestre, String profesor) {
        return daoc.consultarClasesXprofesor(ano, semestre, profesor);
    }



  


    @Override
    public List<Asignatura> consultarAsignaturas () throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //return daom.consultarAsignaturasDAO();
            
    }

    @Override
    public List<Materia> consultarMateriasProgramaExceptMateria(int id_programa, String codigoMateria) throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriasPorProgramaExceptMateriaDAO(id_programa, codigoMateria);
    }
}

