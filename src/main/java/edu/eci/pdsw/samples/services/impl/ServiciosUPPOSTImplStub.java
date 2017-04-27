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

    public ServiciosUPPOSTImplStub() {
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

    private void poblar() {
        
        

   
        Asignatura asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales");
        Asignatura asig2 = new Asignatura(2, "tdgp");
        Asignatura asig3 = new Asignatura(3, "semi");
        Asignatura asig4 = new Asignatura(4, "conf");
        Asignatura asig5 = new Asignatura(5, "ejecucuion");

        Profesor prof1 = new Profesor(1, "german");
        Profesor prof2 = new Profesor(2, "maria");
        Profesor prof3 = new Profesor(3, "sonia");
        Profesor prof4 = new Profesor(4, "paula");
        Profesor prof5 = new Profesor(5, "dora");
        Profesor prof6 = new Profesor(6, "jasinta");
        Profesor prof7 = new Profesor(7, "matilde");
        Profesor prof8 = new Profesor(8, "hector");
        Profesor prof9 = new Profesor(9, "oswaldo");
        Profesor prof10 = new Profesor(10, "santiago");
        Profesor prof11 = new Profesor(11, "david");
        Profesor prof12 = new Profesor(12, "oscar");
        Profesor prof13 = new Profesor(13, "hercules");
        Profesor prof14 = new Profesor(14, "alquimedes");
        Profesor prof15 = new Profesor(15, "ivanovich");

        List<Asignatura> lista1 = new ArrayList<Asignatura>();
        List<Asignatura> lista2 = new ArrayList<Asignatura>();
        
        lista1.add(asig1); 
        lista1.add(asig2); 
        lista2.add(asig3); 
        lista2.add(asig4); 
        lista2.add(asig5); 

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
