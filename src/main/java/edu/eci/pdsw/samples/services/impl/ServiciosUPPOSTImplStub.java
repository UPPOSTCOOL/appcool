/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;


import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.entities.PostGrado;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class ServiciosUPPOSTImplStub implements ServiciosUPPOST {
    
        private ArrayList<Asignatura> asignaturas;
        private ArrayList<Clase> clases;
        private ArrayList<Materia> materias;
        private ArrayList<Periodo> periodos;
        private ArrayList<Profesor> profesores;
    
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
        Asignatura:    
    int id;
    String nombre;
        */
       Asignatura asig1 = new Asignatura(1, "c&h gerenciales");
       Profesor prof1 = new Profesor(1,"german");
       List<Asignatura> lista = new ArrayList<Asignatura>();
       lista.add(asig1);
       PostGrado post1 = new PostGrado(prof1, lista);
       //PostGrado pos1 = new PostGrado(prof1, {asig1});
       //asignaturas = {asig1,  };
        
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


Clase:
    int id=0;
    Recurso descripcion;
    Timestamp fecha;
    Timestamp horafin;
    int idMateria=0;

Materia:    
    int id;
    String nombre;
    int cohorte;
    int numClases;
    int numHoras;    
    Profesor profesor;
    Asignatura asignatura;    
    List<Clase> clases;

Periodo:    
    int id;
    List<Materia> materias;
    int ano;
    int semestre;
    
Profesor:
    int id;
    String nombre;
*/