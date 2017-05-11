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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Tuple;

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
    public Materia consultarMateriaConRequisitos(String codigo,int id_programa) throws ExcepcionServiciosUPPOST {
        return daom.consultarMateriaConRequisitosDAO(codigo,id_programa);
    }

    @Override
    public void insertarMateria(Materia materia, List<Tuple> prerequisito, List<Tuple> corequisito, List<Asignatura> asignaturas) throws ExcepcionServiciosUPPOST {
        if(materia.getNombre()!= "" && materia.getCodigo()!="" && !prerequisito.equals(corequisito) ){
            
            List<String> nombres = new ArrayList<>();
            List<Materia> listaN = consultarMaterias();
            
            List<String> codigos = new ArrayList<>();
            List<Materia> listaC = consultarMaterias();
            
            for(int i=0;i<listaN.size();i++){nombres.add(listaN.get(i).getNombre());}
            for(int i=0;i<listaC.size();i++){codigos.add(listaC.get(i).getCodigo());}
                    
            if(!nombres.contains(materia.getNombre()) && !codigos.contains(materia.getCodigo())){
                
                List<String[]> listaPre = new ArrayList<>();
                List<String[]> listaCor = new ArrayList<>();
                String[] temp = new String[2];
                
                for(int i=0;i<prerequisito.size();i++){
                    temp[0]=( (Materia) prerequisito.get(i).get(0) ).getCodigo();
                    temp[1]=Integer.toString( ( (Programa) prerequisito.get(i).get(1) ).getId());
                    listaPre.add(temp);
                }
                
                for(int i=0;i<corequisito.size();i++){
                    temp[0]=( (Materia) corequisito.get(i).get(0) ).getCodigo();
                    temp[1]=Integer.toString( ( (Programa) corequisito.get(i).get(1) ).getId());
                    listaCor.add(temp);
                }
                
                List<Integer> id_asigs = new ArrayList<>();
                
                for(int i=0;i<asignaturas.size();i++){
                    id_asigs.add(asignaturas.get(i).getId());
                }
                
                //daom.insertarMateriaDAO(materia,listaPre, listaCor, id_asigs);
            }
        }
        
    }

    @Override
    public List<Materia> consultarMaterias() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //return daom.comsultarMaterias();
    }

   
}
