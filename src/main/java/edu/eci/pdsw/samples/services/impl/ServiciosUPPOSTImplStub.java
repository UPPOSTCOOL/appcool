/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;


import edu.eci.pdsw.sampleprj.dao.ClaseDAO;
import edu.eci.pdsw.sampleprj.dao.MateriaDAO;
import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class ServiciosUPPOSTImplStub implements ServiciosUPPOST {
    
    private final ArrayList<Materia> materias;
    
    
    public ServiciosUPPOSTImplStub(){
        materias = new ArrayList<Materia>();
        poblar();
    }
    
    

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
        return materias;
    }
    
    private void poblar(){
        
       /*
       
        crear el relleno :)
        
       */ 
        
        
    }

    @Override
    public List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}





/*
    public class Asignatura implements Serializable{
    
    private int id;
    private String nombre;

    public class Clase {
    
    private int id=0;
    private Recurso descripcion;
    private Timestamp fecha;
    private Timestamp horafin;
    private int idMateria=0;

    public class Materia implements Serializable{
    
    private int id;
    private String nombre;
    
    private int cohorte;
    private int numClases;
    private int numHoras;
    
    private Profesor profesor;
    private Asignatura asignatura;
    
    private List<Clase> clases;


    public class Periodo {
    
    private int id;
    private List<Materia> materias;
    private int ano;
    private int semestre;


    public class Profesor implements Serializable{
    private int id;
    private String nombre;

    

*/