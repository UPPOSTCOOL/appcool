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
import java.sql.Timestamp;
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
        
        // PARA EL PERIODO 1
        
        List<Asignatura> lista1 = new ArrayList<>();
        List<Asignatura> lista2 = new ArrayList<>();        
        
        
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
        
        PostGrado post1 = new PostGrado(prof1, lista1);
        PostGrado post2 = new PostGrado(prof1, lista2);

   
        Asignatura asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales", post1);
        Asignatura asig2 = new Asignatura(2, "tdgp", post1);
        Asignatura asig3 = new Asignatura(3, "semi", post2);
        Asignatura asig4 = new Asignatura(4, "conf", post2);
        Asignatura asig5 = new Asignatura(5, "ejecucuion", post2);          
        
        lista1.add(asig1); 
        lista1.add(asig2); 
        lista2.add(asig3); 
        lista2.add(asig4); 
        lista2.add(asig5); 

        // Timestamp para Fecha  267: 2 de Junio (6) a las 7:00
        Timestamp dt267 = new Timestamp(2017,6,2,7,0,0,0);
        Timestamp dt2613 = new Timestamp(2017,6,2,13,0,0,0);
        Timestamp dt2616 = new Timestamp(2017,6,2,16,0,0,0);
        
        Timestamp dt367 = new Timestamp(2017,6,3,7,7,0,0);
        Timestamp dt3610 = new Timestamp(2017,6,3,10,0,0,0);
                
        Timestamp dt967 = new Timestamp(2017,6,9,7,0,0,0);
        Timestamp dt9610 = new Timestamp(2017,6,9,10,0,0,0);
        Timestamp dt9616 = new Timestamp(2017,6,9,16,0,0,0);
        
        Timestamp dt1067 = new Timestamp(2017,6,10,7,0,0,0);
        Timestamp dt10610 = new Timestamp(2017,6,10,10,0,0,0);
                
        Timestamp dt1667 = new Timestamp(2017,6,16,7,0,0,0);
        
        Timestamp dt1767 = new Timestamp(2017,6,17,7,0,0,0);
        Timestamp dt17610 = new Timestamp(2017,6,17,10,0,0,0);
        
        Timestamp dt2367 = new Timestamp(2017,6,23,7,0,0,0);
        Timestamp dt23610 = new Timestamp(2017,6,23,10,0,0,0);
        
        Timestamp dt2467 = new Timestamp(2017,6,24,7,0,0,0);
        Timestamp dt24610 = new Timestamp(2017,6,24,10,0,0,0);
        
        Timestamp dt3067 = new Timestamp(2017,6,30,7,0,0,0);
        Timestamp dt30610 = new Timestamp(2017,6,30,10,0,0,0);
        
        Timestamp dt177 = new Timestamp(2017,7,1,1,0,0,0);
        Timestamp dt1710= new Timestamp(2017,7,1,10,0,0,0);
        
        Timestamp dt877 = new Timestamp(2017,7,8,7,0,0,0);
        Timestamp dt8710 = new Timestamp(2017,7,8,10,0,0,0);
        
        Timestamp dt1477 = new Timestamp(2017,7,14,7,0,0,0);
                
        Timestamp dt1577 = new Timestamp(2017,6,15,7,0,0,0);
        Timestamp dt15710 = new Timestamp(2017,6,15,10,0,0,0);
        
        Timestamp dt2177 = new Timestamp(2017,6,21,7,0,0,0);
        Timestamp dt21710 = new Timestamp(2017,6,21,10,0,0,0);
        
        Timestamp dt2277 = new Timestamp(2017,7,22,7,0,0,0);
        Timestamp dt22710 = new Timestamp(2017,7,22,10,0,0,0);
        
        
        // Timestamp para horainicio 
        Timestamp dt21710f = new Timestamp(2017,7,21,10,0,0,0);
        Timestamp dt21713f = new Timestamp(2017,7,21,13,0,0,0);
        Timestamp dt8710f = new Timestamp(2017,7,8,10,0,0,0);
        
        Timestamp dt1713f = new Timestamp(2017,7,1,13,0,0,0);
        Timestamp dt8713f = new Timestamp(2017,7,8,13,0,0,0);
        Timestamp dt7713f = new Timestamp(2017,7,7,13,0,0,0);
        
        Timestamp dt9613f = new Timestamp(2017,6,9,13,0,0,0);
        Timestamp dt16610f = new Timestamp(2017,6,16,10,0,0,0);
        Timestamp dt14713f = new Timestamp(2017,7,14,13,0,0,0);
        
        Timestamp dt9610f = new Timestamp(2017,6,9,10,0,0,0);
        Timestamp dt22713f = new Timestamp(2017,7,22,13,0,0,0);
        Timestamp dt22710f = new Timestamp(2017,7,22,10,0,0,0);
        
        Timestamp dt2616f = new Timestamp(2017,6,2,16,0,0,0);
        Timestamp dt9619f = new Timestamp(2017,6,9,19,0,0,0);
                
        
         // PERIODO 2
        
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
    int semestre
*/
