/**
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package edu.eci.pdsw.samples.services.impl;

import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author juan
 *
public class ServiciosUPPOSTImplStub implements ServiciosUPPOST {

<<<<<<< HEAD
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Clase> clases;
    private ArrayList<Materia> materias;
    private ArrayList<PeriodoAcademico> periodos;
    private ArrayList<Profesor> profesores;

    private ArrayList<Clase> clasesAll;
    private ArrayList<PeriodoAcademico> periodosAll;
    private ArrayList<Materia> materiasAll;

    public ServiciosUPPOSTImplStub() {
        clasesAll = new ArrayList<Clase>();
        periodosAll = new ArrayList<PeriodoAcademico>();
        materias = new ArrayList<Materia>();
        poblar();
    }

    @Override
    public Clase consultarClase(int id) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
        for (int i = 0; i < clasesAll.size(); i++) {
            System.out.println(clasesAll.get(i));
        }
        return clasesAll;
    }
=======
    private List<Asignatura> asignaturas;
    private List<Clase> clases;
    private List<Materia> materias;
    private List<Periodo> periodos;
    private List<Profesor> profesores;
    
    private List<Clase> clasesAll1;
    private List<Clase> clasesAll2;
    private List<Periodo> periodosAll;
    private List<Materia> materiasAll1;
    private List<Materia> materiasAll2;

    public ServiciosUPPOSTImplStub() {
        clasesAll1 = new ArrayList<>();
        materiasAll1 = new ArrayList<>();
        clasesAll2 = new ArrayList<>();
        materiasAll2 = new ArrayList<>();
        periodosAll = new ArrayList<>();
        poblar();
    }

    
>>>>>>> origin/HU1

    private void poblar() {        
        periodo1();
        periodo2();
    }
<<<<<<< HEAD

    private void poblar() {

=======
     
    
    private void periodo1(){
        
>>>>>>> origin/HU1
        // PARA EL PERIODO 1
        List<Asignatura> lista1 = new ArrayList<>();

        Profesor prof1 = new Profesor(1, "German Motta");
        Profesor prof2 = new Profesor(2, "Maria Pajon");
        Profesor prof3 = new Profesor(3, "Sonia Alcala");
        Profesor prof4 = new Profesor(4, "Paula Apple");
        Profesor prof5 = new Profesor(5, "Ivanovich Kravchenko");

        // para siganturas, se crea el prostgrado con las mismas asignaturas
        Programa post1 = new Programa(prof5, lista1, "Programa uno"); // lista 1 es vacia

        Asignatura asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales", post1);
        Asignatura asig2 = new Asignatura(2, "tdgp", post1);
        Asignatura asig3 = new Asignatura(3, "semi", post1);
        Asignatura asig4 = new Asignatura(4, "conf", post1);
        Asignatura asig5 = new Asignatura(5, "ejecucuion", post1);

        lista1.add(asig1);
        lista1.add(asig2);
        lista1.add(asig3);
        lista1.add(asig4);
        lista1.add(asig5);

        post1 = new Programa(prof5, lista1, "Programa uno.dos");

        asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales", post1);
        asig2 = new Asignatura(2, "tdgp", post1);
        asig3 = new Asignatura(3, "semi", post1);
        asig4 = new Asignatura(4, "conf", post1);
        asig5 = new Asignatura(5, "ejecucuion", post1);

        // Materias son 5 grupos de materias
        Materia mat1 = new Materia("GRiesgos", "Gerencia de riesgos", 24, prof1, asig1, "Descripcion para tres mierdas");// clasesM1 
        Materia mat2 = new Materia("GComu", "G comunicaciones", 24, prof1, asig1, "Descripcion");// clasesM2
        Materia mat3 = new Materia("GCal", "G calidad", 24, prof1, asig1, "Descripcion");// clasesM3
        Materia mat4 = new Materia("LT", "Liderazgoy trabajo", 24, prof1, asig1, "Descripcion");// clasesM4
        Materia mat5 = new Materia("N", "Negociación", 24, prof1, asig1, "Descripcion");// clasesM5
        Materia mat6 = new Materia("CI", "Creatividad Inn", 24, prof1, asig1, "Descripcion");// clasesM6

        Materia mat7 = new Materia("TTG", "Taller trabajo grado", 24, prof2, asig2, "Descripcion");// clasesM7
        Materia mat8 = new Materia("TTG2", "Taller trabajo grado2", 24, prof2, asig2, "Descripcion");// clasesM8
        Materia mat9 = new Materia("SG", "Sustentacion grup", 24, prof2, asig2, "Descripcion");// clasesM9
        Materia mat10 = new Materia("II", "Intro a la Investigacion", 24, prof2, asig2, "Descripcion");// clasesM10

        Materia mat11 = new Materia("PV", "Proyecto de vida", 24, prof3, asig3, "Descripcion");// clasesM11

        Materia mat12 = new Materia("E", "Etica", 24, prof4, asig4, "Descripcion");// clasesM12

        Materia mat13 = new Materia("IE", "Intro a ejecucion", 24, prof5, asig5, "Descripcion");// clasesM13
        Materia mat14 = new Materia("R", "Requerimientos", 24, prof5, asig5, "Descripcion");// clasesM14
        Materia mat15 = new Materia("C", "Construccion", 24, prof5, asig5, "Descripcion");// clasesM15

        // todas las materias
        
        //ArrayList<Materia> matAll= new ArrayList<>();
        materias.add(mat1);
        materias.add(mat2);
        materias.add(mat3);
        materias.add(mat4);
        materias.add(mat5);
        materias.add(mat6);
        materias.add(mat7);
        materias.add(mat8);
        materias.add(mat9);
        materias.add(mat10);
        materias.add(mat11);
        materias.add(mat12);
        materias.add(mat13);
        materias.add(mat14);
        materias.add(mat15);

        // Timestamp para Fecha  267: 2 de Junio (6) a las 7:00
        Timestamp dt267 = new Timestamp(2017, 6, 2, 7, 0, 0, 0);
        Timestamp dt2613 = new Timestamp(2017, 6, 2, 13, 0, 0, 0);
        Timestamp dt2616 = new Timestamp(2017, 6, 2, 16, 0, 0, 0);

        Timestamp dt367 = new Timestamp(2017, 6, 3, 7, 7, 0, 0);
        Timestamp dt3610 = new Timestamp(2017, 6, 3, 10, 0, 0, 0);

        Timestamp dt967 = new Timestamp(2017, 6, 9, 7, 0, 0, 0);
        Timestamp dt9610 = new Timestamp(2017, 6, 9, 10, 0, 0, 0);
        Timestamp dt9616 = new Timestamp(2017, 6, 9, 16, 0, 0, 0);

        Timestamp dt1067 = new Timestamp(2017, 6, 10, 7, 0, 0, 0);
        Timestamp dt10610 = new Timestamp(2017, 6, 10, 10, 0, 0, 0);

        Timestamp dt1667 = new Timestamp(2017, 6, 16, 7, 0, 0, 0);

        Timestamp dt1767 = new Timestamp(2017, 6, 17, 7, 0, 0, 0);
        Timestamp dt17610 = new Timestamp(2017, 6, 17, 10, 0, 0, 0);

        Timestamp dt2367 = new Timestamp(2017, 6, 23, 7, 0, 0, 0);
        Timestamp dt23610 = new Timestamp(2017, 6, 23, 10, 0, 0, 0);

        Timestamp dt2467 = new Timestamp(2017, 6, 24, 7, 0, 0, 0);
        Timestamp dt24610 = new Timestamp(2017, 6, 24, 10, 0, 0, 0);

        Timestamp dt3067 = new Timestamp(2017, 6, 30, 7, 0, 0, 0);
        Timestamp dt30610 = new Timestamp(2017, 6, 30, 10, 0, 0, 0);

        Timestamp dt177 = new Timestamp(2017, 7, 1, 1, 0, 0, 0);
        Timestamp dt1710 = new Timestamp(2017, 7, 1, 10, 0, 0, 0);

        Timestamp dt777 = new Timestamp(2017, 7, 1, 7, 0, 0, 0);
        Timestamp dt7710 = new Timestamp(2017, 7, 1, 10, 0, 0, 0);

        Timestamp dt877 = new Timestamp(2017, 7, 8, 7, 0, 0, 0);
        Timestamp dt8710 = new Timestamp(2017, 7, 8, 10, 0, 0, 0);

        Timestamp dt1477 = new Timestamp(2017, 7, 14, 7, 0, 0, 0);

        Timestamp dt1577 = new Timestamp(2017, 6, 15, 7, 0, 0, 0);
        Timestamp dt15710 = new Timestamp(2017, 6, 15, 10, 0, 0, 0);

        Timestamp dt2177 = new Timestamp(2017, 6, 21, 7, 0, 0, 0);
        Timestamp dt21710 = new Timestamp(2017, 6, 21, 10, 0, 0, 0);

        Timestamp dt2277 = new Timestamp(2017, 7, 22, 7, 0, 0, 0);
        Timestamp dt22710 = new Timestamp(2017, 7, 22, 10, 0, 0, 0);

        // Timestamp para horainicio 
        Timestamp dt21710f = new Timestamp(2017, 7, 21, 10, 0, 0, 0);
        Timestamp dt21713f = new Timestamp(2017, 7, 21, 13, 0, 0, 0);
        Timestamp dt8710f = new Timestamp(2017, 7, 8, 10, 0, 0, 0);

        Timestamp dt1713f = new Timestamp(2017, 7, 1, 13, 0, 0, 0);
        Timestamp dt8713f = new Timestamp(2017, 7, 8, 13, 0, 0, 0);
        Timestamp dt7713f = new Timestamp(2017, 7, 7, 13, 0, 0, 0);

        Timestamp dt9613f = new Timestamp(2017, 6, 9, 13, 0, 0, 0);
        Timestamp dt16610f = new Timestamp(2017, 6, 16, 10, 0, 0, 0);
        Timestamp dt14713f = new Timestamp(2017, 7, 14, 13, 0, 0, 0);

        Timestamp dt9610f = new Timestamp(2017, 6, 9, 10, 0, 0, 0);
        Timestamp dt22713f = new Timestamp(2017, 7, 22, 13, 0, 0, 0);
        Timestamp dt22710f = new Timestamp(2017, 7, 22, 10, 0, 0, 0);

        Timestamp dt2616f = new Timestamp(2017, 6, 2, 16, 0, 0, 0);
        Timestamp dt9619f = new Timestamp(2017, 6, 9, 19, 0, 0, 0);
        // ----------------
<<<<<<< HEAD

        Timestamp dt21713 = new Timestamp(2017, 7, 21, 13, 0, 0, 0);

        Timestamp dt1713 = new Timestamp(2017, 7, 1, 13, 0, 0, 0);
        Timestamp dt8713 = new Timestamp(2017, 7, 8, 13, 0, 0, 0);
        Timestamp dt7713 = new Timestamp(2017, 7, 7, 13, 0, 0, 0);

        Timestamp dt9613 = new Timestamp(2017, 6, 9, 13, 0, 0, 0);
        Timestamp dt16610 = new Timestamp(2017, 6, 16, 10, 0, 0, 0);
        Timestamp dt14713 = new Timestamp(2017, 7, 14, 13, 0, 0, 0);

        Timestamp dt22713 = new Timestamp(2017, 7, 22, 13, 0, 0, 0);

        Timestamp dt9619 = new Timestamp(2017, 6, 9, 19, 0, 0, 0);

        Timestamp dt778 = new Timestamp(2017, 7, 7, 8, 0, 0, 0);
        Timestamp dt7711 = new Timestamp(2017, 7, 7, 11, 0, 0, 0);
        Timestamp dt7712 = new Timestamp(2017, 7, 7, 12, 0, 0, 0);
        Timestamp dt1068 = new Timestamp(2017, 6, 10, 8, 0, 0, 0);
        Timestamp dt10611 = new Timestamp(2017, 6, 10, 11, 0, 0, 0);
        Timestamp dt10612 = new Timestamp(2017, 6, 10, 12, 0, 0, 0);
        Timestamp dt10613 = new Timestamp(2017, 6, 10, 13, 0, 0, 0);
        Timestamp dt10614 = new Timestamp(2017, 6, 10, 14, 0, 0, 0);
        Timestamp dt30611 = new Timestamp(2017, 6, 30, 11, 0, 0, 0);
        Timestamp dt30612 = new Timestamp(2017, 6, 30, 12, 0, 0, 0);
        Timestamp dt7714 = new Timestamp(2017, 7, 7, 14, 0, 0, 0);
        Timestamp dt7715 = new Timestamp(2017, 7, 7, 15, 0, 0, 0);

        Recurso recurso = new Recurso(100, "recurso");

        Clase cl1a = new Clase(1, recurso, dt777, dt778, mat1, "c1-201");
        Clase cl2a = new Clase(1, recurso, dt778, dt7710, mat2, "c1-202");
        Clase cl3a = new Clase(1, recurso, dt7710, dt7711, mat3, "c1-203");
        Clase cl4a = new Clase(1, recurso, dt7712, dt7713, mat4, "c1-204");
        Clase cl5a = new Clase(1, recurso, dt7713, dt7714, mat5, "c2-201");
        Clase cl6a = new Clase(1, recurso, dt7714, dt7715, mat6, "c2-202");//2
        Clase cl7a = new Clase(1, recurso, dt1067, dt1068,mat7, "A-105");//2
        Clase cl8a = new Clase(1, recurso, dt1068, dt10610, mat8, "D-201");
        Clase cl9a = new Clase(1, recurso, dt10610, dt10611, mat9, "f-301");
        Clase cl10a = new Clase(1, recurso, dt10611, dt10612, mat10, "f-101");
        Clase cl11a = new Clase(1, recurso, dt10612, dt10613, mat11, "f-102");//3
        Clase cl12a = new Clase(1, recurso, dt10613, dt10614, mat12, "f-201");//4
        Clase cl13a = new Clase(1, recurso, dt3067, dt30610, mat13, "f-205");  //5
        Clase cl14a = new Clase(1, recurso, dt30610, dt30611, mat14, "f-206");
        Clase cl15a = new Clase(1, recurso, dt30611, dt30612, mat15, "f-304");
        
//-------------------------------------------------------------------------------------------
=======
        
        Timestamp dt21713 = new Timestamp(2017,7,21,13,0,0,0);        
        
        Timestamp dt1713 = new Timestamp(2017,7,1,13,0,0,0);
        Timestamp dt8713 = new Timestamp(2017,7,8,13,0,0,0);
        Timestamp dt7713 = new Timestamp(2017,7,7,13,0,0,0);
        
        Timestamp dt9613 = new Timestamp(2017,6,9,13,0,0,0);
        Timestamp dt16610 = new Timestamp(2017,6,16,10,0,0,0);
        Timestamp dt14713 = new Timestamp(2017,7,14,13,0,0,0);        
        
        Timestamp dt22713 = new Timestamp(2017,7,22,13,0,0,0);
        
        Timestamp dt9619 = new Timestamp(2017,6,9,19,0,0,0);        
        
        Timestamp dt778 = new Timestamp(2017,7,7,8,0,0,0);
        Timestamp dt7711 = new Timestamp(2017,7,7,11,0,0,0);
        Timestamp dt7712 = new Timestamp(2017,7,7,12,0,0,0);
        Timestamp dt1068 = new Timestamp(2017,6,10,8,0,0,0);
        Timestamp dt10611= new Timestamp(2017,6,10,11,0,0,0);
        Timestamp dt10612= new Timestamp(2017,6,10,12,0,0,0);
        Timestamp dt10613= new Timestamp(2017,6,10,13,0,0,0);
        Timestamp dt10614= new Timestamp(2017,6,10,14,0,0,0);
        Timestamp dt30611= new Timestamp(2017,6,30,11,0,0,0);
        Timestamp dt30612= new Timestamp(2017,6,30,12,0,0,0);
        Timestamp dt7714= new Timestamp(2017,7,7,14,0,0,0);
        Timestamp dt7715= new Timestamp(2017,7,7,15,0,0,0);
        
        Recurso recurso = new Recurso(100, "recurso");        
        
        Clase cl1a = new Clase(1,recurso,dt777, dt778, "7 a 8", "M1",24);
        Clase cl2a = new Clase(2,recurso,dt778, dt7710, "8 a 10","M2",24);        
        Clase cl3a = new Clase(3,recurso,dt7710, dt7711,"10 a 11","M3",24);      
        Clase cl4a = new Clase(4,recurso,dt7712, dt7713,"12 a 13","M4",24);      
        Clase cl5a = new Clase(5,recurso,dt7713, dt7714,"13 a 14","M5",24);      
        Clase cl6a = new Clase(6,recurso,dt7714, dt7715,"14 a 15","M6",24);      
        Clase cl7a = new Clase(7,recurso,dt1067, dt1068,"7 a 8","M7",24);        // ----------------
        Clase cl8a = new Clase(8,recurso,dt1068, dt10610,"8 a 10","M8",24);      
        Clase cl9a = new Clase(9,recurso,dt10610, dt10611,"10 a 11","M9",24);      
        Clase cl10a = new Clase(10,recurso,dt10611, dt10612,"11 a 12","M10",24);       
        Clase cl11a = new Clase(11,recurso,dt10612, dt10613,"12 a 13","M11",23);       
        Clase cl12a = new Clase(12,recurso,dt10613, dt10614,"13 a 14","M12",23);       
        Clase cl13a = new Clase(13,recurso,dt3067, dt30610,"7 a 10","M13",25);        // ---------------- //
        Clase cl14a = new Clase(14,recurso,dt30610, dt30611,"10 a 11","M14",25);      
        Clase cl15a = new Clase(15,recurso,dt30611, dt30612,"11 a 12","M115",25);      
        
>>>>>>> origin/HU1
        // lista clases para materias
        ArrayList<Clase> clasesM1 = new ArrayList<>();
        ArrayList<Clase> clasesM2 = new ArrayList<>();
        ArrayList<Clase> clasesM3 = new ArrayList<>();
        ArrayList<Clase> clasesM4 = new ArrayList<>();
        ArrayList<Clase> clasesM5 = new ArrayList<>();
        ArrayList<Clase> clasesM6 = new ArrayList<>();
        ArrayList<Clase> clasesM7 = new ArrayList<>();
        ArrayList<Clase> clasesM8 = new ArrayList<>();
        ArrayList<Clase> clasesM9 = new ArrayList<>();
        ArrayList<Clase> clasesM10 = new ArrayList<>();
        ArrayList<Clase> clasesM11 = new ArrayList<>();
        ArrayList<Clase> clasesM12 = new ArrayList<>();
        ArrayList<Clase> clasesM13 = new ArrayList<>();
        ArrayList<Clase> clasesM14 = new ArrayList<>();
        ArrayList<Clase> clasesM15 = new ArrayList<>();

        // -----------------------
        // Lista de clases por materia, una calse por materia 
        clasesM1.add(cl1a);
<<<<<<< HEAD
        clasesM2.add(cl2a);
        clasesM3.add(cl3a);
        clasesM4.add(cl4a);
        clasesM5.add(cl5a);
        clasesM6.add(cl6a);
        clasesM7.add(cl7a);
        clasesM8.add(cl8a);
        clasesM9.add(cl9a);
        clasesM10.add(cl10a);
        clasesM11.add(cl11a);
        clasesM12.add(cl12a);
        clasesM13.add(cl13a);
        clasesM14.add(cl14a);
        clasesM15.add(cl15a);

        // tdas las clases del periodo
        clasesAll.add(cl1a);
        clasesAll.add(cl2a);
        clasesAll.add(cl3a);
        clasesAll.add(cl4a);
        clasesAll.add(cl5a);
        clasesAll.add(cl6a);
        clasesAll.add(cl7a);
        clasesAll.add(cl8a);
        clasesAll.add(cl9a);
        clasesAll.add(cl10a);
        clasesAll.add(cl11a);
        clasesAll.add(cl12a);
        clasesAll.add(cl13a);
        clasesAll.add(cl14a);
        clasesAll.add(cl15a);

        // Para Periodo
        PeriodoAcademico per1 = new PeriodoAcademico(1, materias, 2017, 1);

        periodosAll.add(per1);

        // PERIODO 2 - sin datos
    }

    @Override
    public List<PeriodoAcademico> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        return periodosAll;
=======
        clasesM2.add(cl2a); 
        clasesM3.add(cl3a); 
        clasesM4.add(cl4a); 
        clasesM5.add(cl5a); 
        clasesM6.add(cl6a); 
        clasesM7.add(cl7a); 
        clasesM8.add(cl8a); 
        clasesM9.add(cl9a); 
        clasesM10.add(cl10a); 
        clasesM11.add(cl11a); 
        clasesM12.add(cl12a); 
        clasesM13.add(cl13a); 
        clasesM14.add(cl14a); 
        clasesM15.add(cl15a);     
        
        // todas las clases del periodo
                
        clasesAll1.add(cl1a);
        clasesAll1.add(cl2a);
        clasesAll1.add(cl3a);
        clasesAll1.add(cl4a);
        clasesAll1.add(cl5a);
        clasesAll1.add(cl6a);
        clasesAll1.add(cl7a);
        clasesAll1.add(cl8a);
        clasesAll1.add(cl9a);
        clasesAll1.add(cl10a);
        clasesAll1.add(cl11a);
        clasesAll1.add(cl12a);
        clasesAll1.add(cl13a);
        clasesAll1.add(cl14a);
        clasesAll1.add(cl15a);
        
        
        // Materias son 5 grupos de materias
              
        Materia mat1 = new Materia("M1", "Gerencia de riesgos", 24, 1, 1, prof1, asig1, clasesM1 );
        Materia mat2 = new Materia("M2", "G cominicaciones", 24, 1, 1, prof1, asig1, clasesM2 );
        Materia mat3 = new Materia("M3", "G calidad", 24, 1, 1, prof1, asig1, clasesM3 );
        Materia mat4 = new Materia("M4", "Liderazgoy trabajo", 24, 1, 1, prof1, asig1, clasesM4 );
        Materia mat5 = new Materia("M5", "Negociación", 24, 1, 1, prof1, asig1, clasesM5 );
        Materia mat6 = new Materia("M6", "Creatividad Inn", 24, 1, 1, prof1, asig1, clasesM6 );
        
        Materia mat7 = new Materia("M7", "Taller trabajo grado", 24, 1, 1, prof2, asig2, clasesM7 );
        Materia mat8 = new Materia("M8", "Taller trabajo grado2", 24, 1, 1, prof2, asig2, clasesM8 );
        Materia mat9 = new Materia("M9", "Sustentacion grup", 24, 1, 1, prof2, asig2, clasesM9 );
        Materia mat10 = new Materia("M10", "Intro a la Investigacion", 24, 1, 1, prof2, asig2, clasesM10 );
        
        Materia mat11 = new Materia("M11", "Proyecto de vida", 23, 1, 1, prof3, asig3, clasesM11 );
        
        Materia mat12 = new Materia("M12", "Etica", 23, 1, 1, prof4, asig4, clasesM12 );
        
        Materia mat13 = new Materia("M13", "Intro a ejecucion", 25, 1, 1, prof5, asig5, clasesM13 );
        Materia mat14 = new Materia("M14", "Requerimientos", 25, 1, 1, prof5, asig5, clasesM14 );
        Materia mat15 = new Materia("M15", "Construccion", 25, 1, 1, prof5, asig5, clasesM15 );
        
        // todas las materias
        
        //ArrayList<Materia> matAll= new ArrayList<>();
        materiasAll1.add(mat1);
        materiasAll1.add(mat2);
        materiasAll1.add(mat3);
        materiasAll1.add(mat4);
        materiasAll1.add(mat5);
        materiasAll1.add(mat6);
        materiasAll1.add(mat7);
        materiasAll1.add(mat8);
        materiasAll1.add(mat9);
        materiasAll1.add(mat10);
        materiasAll1.add(mat11);
        materiasAll1.add(mat12);
        materiasAll1.add(mat13);
        materiasAll1.add(mat14);
        materiasAll1.add(mat15);
                     
        
        // Para Periodo
        
        Periodo per1 = new Periodo(1,materiasAll1,2017,1);
       
        periodosAll.add(per1);
        
    }

    
    private void periodo2(){
        // PARA EL PERIODO 2
        
        List<Asignatura> lista2 = new ArrayList<>();
        
        Profesor prof1 = new Profesor(1, "Alfrendo Di Stefano");
        Profesor prof2 = new Profesor(2, "Maria Mack");
        Profesor prof3 = new Profesor(3, "Sonic Plomaz");
        Profesor prof4 = new Profesor(4, "Paul Motto");
        Profesor prof5 = new Profesor(5, "Ivanovich Kravchenko B");
        
        
        // para siganturas, se crea el prostgrado con las mismas asignaturas
        
        PostGrado post2 = new PostGrado(prof5, lista2); // lista 1 es vacia
                  
        Asignatura asig1 = new Asignatura(1, "aplicacion dehabilidades gerenciales", post2);
        Asignatura asig2 = new Asignatura(2, "tdgp 2", post2);
        Asignatura asig3 = new Asignatura(3, "semi 2", post2);
        Asignatura asig4 = new Asignatura(4, "conf 2", post2);
        Asignatura asig5 = new Asignatura(5, "inversion", post2);  
        
        lista2.add(asig1); 
        lista2.add(asig2); 
        lista2.add(asig3); 
        lista2.add(asig4); 
        lista2.add(asig5); 
        
        post2 = new PostGrado(prof1, lista2);
        
        asig1 = new Asignatura(1, "aplicacion dehabilidades gerenciales", post2);
        asig2 = new Asignatura(2, "tdgp 2", post2);
        asig3 = new Asignatura(3, "semi 2", post2);
        asig4 = new Asignatura(4, "conf 2", post2);
        asig5 = new Asignatura(5, "ejecucuion 2", post2);  
        

        // 2222222 Timestamp para Fecha  267: 2 de Junio (6) a las 7:00
        Timestamp dt267 = new Timestamp(2017,6,2,7,0,0,0);
        Timestamp dt2613 = new Timestamp(2017,6,2,13,0,0,0);
        Timestamp dt2616 = new Timestamp(2017,6,2,16,0,0,0);
        
        Timestamp dt367 = new Timestamp(2017,6,3,7,7,0,0);
        Timestamp dt3610 = new Timestamp(2017,6,3,10,0,0,0);
                
        Timestamp dt967 = new Timestamp(2017,6,9,7,0,0,0);
        Timestamp dt9610 = new Timestamp(2017,6,9,10,0,0,0);
        Timestamp dt9616 = new Timestamp(2017,6,9,16,0,0,0);
        
        Timestamp dt1077 = new Timestamp(2017,7,10,7,0,0,0);
        Timestamp dt10710 = new Timestamp(2017,7,10,10,0,0,0);
                
        Timestamp dt1667 = new Timestamp(2017,6,16,7,0,0,0);
        
        Timestamp dt1767 = new Timestamp(2017,6,17,7,0,0,0);
        Timestamp dt17610 = new Timestamp(2017,6,17,10,0,0,0);
        
        Timestamp dt2367 = new Timestamp(2017,6,23,7,0,0,0);
        Timestamp dt23610 = new Timestamp(2017,6,23,10,0,0,0);
        
        Timestamp dt2467 = new Timestamp(2017,6,24,7,0,0,0);
        Timestamp dt24610 = new Timestamp(2017,6,24,10,0,0,0);
        
        Timestamp dt3077 = new Timestamp(2017,7,30,7,0,0,0);
        Timestamp dt30710 = new Timestamp(2017,7,30,10,0,0,0);
        
        Timestamp dt177 = new Timestamp(2017,7,1,1,0,0,0);
        Timestamp dt1710= new Timestamp(2017,7,1,10,0,0,0);
        
        Timestamp dt787= new Timestamp(2017,8,1,7,0,0,0);
        Timestamp dt7810= new Timestamp(2017,8,1,10,0,0,0);
        
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
        // ----------------
        
        Timestamp dt21713 = new Timestamp(2017,7,21,13,0,0,0);        
        
        Timestamp dt1713 = new Timestamp(2017,7,1,13,0,0,0);
        Timestamp dt8713 = new Timestamp(2017,7,8,13,0,0,0);
        Timestamp dt7813 = new Timestamp(2017,8,7,13,0,0,0);
        
        Timestamp dt9613 = new Timestamp(2017,6,9,13,0,0,0);
        Timestamp dt16610 = new Timestamp(2017,6,16,10,0,0,0);
        Timestamp dt14713 = new Timestamp(2017,7,14,13,0,0,0);        
        
        Timestamp dt22713 = new Timestamp(2017,7,22,13,0,0,0);
        
        Timestamp dt9619 = new Timestamp(2017,6,9,19,0,0,0);        
        
        Timestamp dt788 = new Timestamp(2017,8,7,8,0,0,0);
        Timestamp dt7811 = new Timestamp(2017,8,7,11,0,0,0);
        Timestamp dt7812 = new Timestamp(2017,8,7,12,0,0,0);
        Timestamp dt1078 = new Timestamp(2017,7,10,8,0,0,0);
        Timestamp dt10711= new Timestamp(2017,7,10,11,0,0,0);
        Timestamp dt10712= new Timestamp(2017,7,10,12,0,0,0);
        Timestamp dt10713= new Timestamp(2017,7,10,13,0,0,0);
        Timestamp dt10714= new Timestamp(2017,7,10,14,0,0,0);
        Timestamp dt30711= new Timestamp(2017,7,30,11,0,0,0);
        Timestamp dt30712= new Timestamp(2017,7,30,12,0,0,0);
        Timestamp dt7814= new Timestamp(2017,8,7,14,0,0,0);
        Timestamp dt7815= new Timestamp(2017,8,7,15,0,0,0);
        
        Recurso recurso = new Recurso(100, "recurso -2");        
        
        Clase cl1a = new Clase(1,recurso,dt787, dt788, "7 a 8", "M1",24);
        Clase cl2a = new Clase(2,recurso,dt788, dt7810, "8 a 10","M2",24);        
        Clase cl3a = new Clase(3,recurso,dt7810, dt7811,"10 a 11","M3",24);      
        Clase cl4a = new Clase(4,recurso,dt7812, dt7813,"12 a 13","M4",24);      
        Clase cl5a = new Clase(5,recurso,dt7813, dt7814,"13 a 14","M5",24);      
        Clase cl6a = new Clase(6,recurso,dt7814, dt7815,"14 a 15","M6",24);      
        Clase cl7a = new Clase(7,recurso,dt1077, dt1078,"7 a 8","M7",24);        // ----------------
        Clase cl8a = new Clase(8,recurso,dt1078, dt10710,"8 a 10","M8",24);      
        Clase cl9a = new Clase(9,recurso,dt10710, dt10711,"10 a 11","M9",24);      
        Clase cl10a = new Clase(10,recurso,dt10711, dt10712,"11 a 12","M10",24);       
        Clase cl11a = new Clase(11,recurso,dt10712, dt10713,"12 a 13","M11",23);       
        Clase cl12a = new Clase(12,recurso,dt10713, dt10714,"13 a 14","M12",23);       
        Clase cl13a = new Clase(13,recurso,dt3077, dt30710,"7 a 10","M13",25);        // ---------------- //
        Clase cl14a = new Clase(14,recurso,dt30710, dt30711,"10 a 11","M14",25);      
        Clase cl15a = new Clase(15,recurso,dt30711, dt30712,"11 a 12","M115",25); 
        
        // lista clases para materias
        ArrayList<Clase> clasesM1 = new ArrayList<>();
        ArrayList<Clase> clasesM2 = new ArrayList<>();
        ArrayList<Clase> clasesM3 = new ArrayList<>();
        ArrayList<Clase> clasesM4 = new ArrayList<>();
        ArrayList<Clase> clasesM5 = new ArrayList<>();
        ArrayList<Clase> clasesM6 = new ArrayList<>();
        ArrayList<Clase> clasesM7 = new ArrayList<>();
        ArrayList<Clase> clasesM8 = new ArrayList<>();
        ArrayList<Clase> clasesM9 = new ArrayList<>();
        ArrayList<Clase> clasesM10 = new ArrayList<>();
        ArrayList<Clase> clasesM11 = new ArrayList<>();
        ArrayList<Clase> clasesM12 = new ArrayList<>();
        ArrayList<Clase> clasesM13 = new ArrayList<>();
        ArrayList<Clase> clasesM14 = new ArrayList<>();
        ArrayList<Clase> clasesM15 = new ArrayList<>();       
        
        // -----------------------
        // Lista de clases por materia, una calse por materia 
        clasesM1.add(cl1a);
        clasesM2.add(cl2a); 
        clasesM3.add(cl3a); 
        clasesM4.add(cl4a); 
        clasesM5.add(cl5a); 
        clasesM6.add(cl6a); 
        clasesM7.add(cl7a); 
        clasesM8.add(cl8a); 
        clasesM9.add(cl9a); 
        clasesM10.add(cl10a); 
        clasesM11.add(cl11a); 
        clasesM12.add(cl12a); 
        clasesM13.add(cl13a); 
        clasesM14.add(cl14a); 
        clasesM15.add(cl15a);     
        
        // tdas las clases del periodo
                
        clasesAll2.add(cl1a);
        clasesAll2.add(cl2a);
        clasesAll2.add(cl3a);
        clasesAll2.add(cl4a);
        clasesAll2.add(cl5a);
        clasesAll2.add(cl6a);
        clasesAll2.add(cl7a);
        clasesAll2.add(cl8a);
        clasesAll2.add(cl9a);
        clasesAll2.add(cl10a);
        clasesAll2.add(cl11a);
        clasesAll2.add(cl12a);
        clasesAll2.add(cl13a);
        clasesAll2.add(cl14a);
        clasesAll2.add(cl15a);
        
        
        // Materias son 5 grupos de materias
              
        Materia mat1 = new Materia("M1", "Gerencia de riesgos 2", 24, 1, 1, prof1, asig1, clasesM1 );
        Materia mat2 = new Materia("M2", "G cominicaciones 2", 24, 1, 1, prof1, asig1, clasesM2 );
        Materia mat3 = new Materia("M3", "G calidad 2", 24, 1, 1, prof1, asig1, clasesM3 );
        Materia mat4 = new Materia("M4", "Liderazgoy trabajo 2", 24, 1, 1, prof1, asig1, clasesM4 );
        Materia mat5 = new Materia("M5", "Negociación 2", 24, 1, 1, prof1, asig1, clasesM5 );
        Materia mat6 = new Materia("M6", "Creatividad Inn 2", 24, 1, 1, prof1, asig1, clasesM6 );
        
        Materia mat7 = new Materia("M7", "Taller trabajo grado 2", 24, 1, 1, prof2, asig2, clasesM7 );
        Materia mat8 = new Materia("M8", "Taller trabajo grado2 w2", 24, 1, 1, prof2, asig2, clasesM8 );
        Materia mat9 = new Materia("M9", "Sustentacion grup 2", 24, 1, 1, prof2, asig2, clasesM9 );
        Materia mat10 = new Materia("M10", "Intro a la Investigacion 2", 24, 1, 1, prof2, asig2, clasesM10 );
        
        Materia mat11 = new Materia("M11", "Proyecto de vida 2", 23, 1, 1, prof3, asig3, clasesM11 );
        
        Materia mat12 = new Materia("M12", "Etica", 23, 1, 1, prof4, asig4, clasesM12 );
        
        Materia mat13 = new Materia("M13", "Intro a ejecucion 2", 25, 1, 1, prof5, asig5, clasesM13 );
        Materia mat14 = new Materia("M14", "Requerimientos 2", 25, 1, 1, prof5, asig5, clasesM14 );
        Materia mat15 = new Materia("M15", "Construccion 2", 25, 1, 1, prof5, asig5, clasesM15 );
        
        // todas las materias
        
        //ArrayList<Materia> matAll= new ArrayList<>();
        materiasAll2.add(mat1);
        materiasAll2.add(mat2);
        materiasAll2.add(mat3);
        materiasAll2.add(mat4);
        materiasAll2.add(mat5);
        materiasAll2.add(mat6);
        materiasAll2.add(mat7);
        materiasAll2.add(mat8);
        materiasAll2.add(mat9);
        materiasAll2.add(mat10);
        materiasAll2.add(mat11);
        materiasAll2.add(mat12);
        materiasAll2.add(mat13);
        materiasAll2.add(mat14);
        materiasAll2.add(mat15);
                     
        
        // Para Periodo
        
        Periodo per2 = new Periodo(2,materiasAll2,2017,2);
       
        periodosAll.add(per2);
        
    
    }
    
    
    @Override
    public Clase consultarClase(int id) throws ExcepcionServiciosUPPOST {
        Clase clx = null;
        List<Clase> all = (List<Clase>) Stream.of(clasesAll1, clasesAll2);
        try {
            
            for(int i=0;i<all.size();i++){
                if(id==all.get(i).getId()){ clx = all.get(i); }
            }
            
            if(clx== null) System.err.println(all.size());
        } catch (Exception e) {
            System.err.println("Consulatar clase: "+e);            
        }
       return clx;
    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
         List<Clase> all = (List<Clase>) Stream.of(clasesAll1, clasesAll2);
         
       return all;
    }

    @Override
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        List<Materia> clx= new ArrayList<>();
        /*
        List<Materia> all = (List<Materia>) Stream.of(materiasAll1, materiasAll2);
        Materia mat;
        try {
            
            for(int i=0;i<all.size();i++){
                mat = all.get(i);
                
                if(mat.getFecha().anio == anio and mat.getSemestre() == semestre){clx.add(mat)}             
            }
            
            if(clx== null) System.err.println(all.size());
        } catch (Exception e) {
            System.err.println("Consulatar clase: "+e);            
        }
        
        if(semestre == 2){ clx = materiasAll2;}
        else{clx = materiasAll1;}
           
        
        if(clx.isEmpty()){System.err.println("Consulatar Materias vacio");  }
        return clx;
    }
    
    @Override
    public List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST {
       
        return clasesAll1;
>>>>>>> origin/HU1
    }

    @Override
    public List<Clase> consultarClasesxPeriodo(PeriodoAcademico periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
<<<<<<< HEAD
=======
    
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
    public List<Periodo> consultarPAcademico(Periodo periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

<<<<<<< HEAD
=======
    @Override
    public List<Programa> consultarProgramas() throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Materia> consultarMateriasPrograma(int id_programa) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia consultarMateriaConRequisitos(String codigo,int id_programa) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> origin/HU3_kvn
}
**/