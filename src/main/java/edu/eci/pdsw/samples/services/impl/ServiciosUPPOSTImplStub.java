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
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author juan
 */
public class ServiciosUPPOSTImplStub implements ServiciosUPPOST {

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
        clasesAll1 = new ArrayList<Clase>();
        materiasAll1 = new ArrayList<Materia>();
        clasesAll2 = new ArrayList<Clase>();
        materiasAll2 = new ArrayList<Materia>();
        periodosAll = new ArrayList<Periodo>();
        poblar();
    }

    

    private void poblar() {        
        periodo1();
        periodo2();
    }
     
    
    private void periodo1(){
        
        // PARA EL PERIODO 1
        
        List<Asignatura> lista1 = new ArrayList<>();
        
        Profesor prof1 = new Profesor(1, "German Motta");
        Profesor prof2 = new Profesor(2, "Maria Pajon");
        Profesor prof3 = new Profesor(3, "Sonia Alcala");
        Profesor prof4 = new Profesor(4, "Paula Apple");
        Profesor prof5 = new Profesor(5, "Ivanovich Kravchenko");
        
        
        // para siganturas, se crea el prostgrado con las mismas asignaturas
        
        PostGrado post1 = new PostGrado(prof5, lista1); // lista 1 es vacia
                  
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
        
        post1 = new PostGrado(prof5, lista1);
        
        asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales", post1);
        asig2 = new Asignatura(2, "tdgp", post1);
        asig3 = new Asignatura(3, "semi", post1);
        asig4 = new Asignatura(4, "conf", post1);
        asig5 = new Asignatura(5, "ejecucuion", post1);  
        

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
        
        Timestamp dt777= new Timestamp(2017,7,1,7,0,0,0);
        Timestamp dt7710= new Timestamp(2017,7,1,10,0,0,0);
        
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
        
        Clase cl1a = new Clase(1,recurso,dt777, dt778, 1);
        Clase cl2a = new Clase(1,recurso,dt778, dt7710, 2);        
        Clase cl3a = new Clase(1,recurso,dt7710, dt7711, 3);      
        Clase cl4a = new Clase(1,recurso,dt7712, dt7713, 4);      
        Clase cl5a = new Clase(1,recurso,dt7713, dt7714, 5);      
        Clase cl6a = new Clase(1,recurso,dt7714, dt7715, 6);
        Clase cl7a = new Clase(1,recurso,dt1067, dt1068, 7);  // ----------------
        Clase cl8a = new Clase(1,recurso,dt1068, dt10610, 8); 
        Clase cl9a = new Clase(1,recurso,dt10610, dt10611, 9);
        Clase cl10a = new Clase(1,recurso,dt10611, dt10612, 10); 
        Clase cl11a = new Clase(1,recurso,dt10612, dt10613, 11); 
        Clase cl12a = new Clase(1,recurso,dt10613, dt10614, 12); 
        Clase cl13a = new Clase(1,recurso,dt3067, dt30610, 13);  // ---------------- //
        Clase cl14a = new Clase(1,recurso,dt30610, dt30611, 14);
        Clase cl15a = new Clase(1,recurso,dt30611, dt30612, 15);
        
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
              
        Materia mat1 = new Materia(1, "Gerencia de riesgos", 24, 1, 1, prof1, asig1, clasesM1 );
        Materia mat2 = new Materia(2, "G cominicaciones", 24, 1, 1, prof1, asig1, clasesM2 );
        Materia mat3 = new Materia(3, "G calidad", 24, 1, 1, prof1, asig1, clasesM3 );
        Materia mat4 = new Materia(4, "Liderazgoy trabajo", 24, 1, 1, prof1, asig1, clasesM4 );
        Materia mat5 = new Materia(5, "Negociación", 24, 1, 1, prof1, asig1, clasesM5 );
        Materia mat6 = new Materia(6, "Creatividad Inn", 24, 1, 1, prof1, asig1, clasesM6 );
        
        Materia mat7 = new Materia(7, "Taller trabajo grado", 24, 1, 1, prof2, asig2, clasesM7 );
        Materia mat8 = new Materia(8, "Taller trabajo grado2", 24, 1, 1, prof2, asig2, clasesM8 );
        Materia mat9 = new Materia(9, "Sustentacion grup", 24, 1, 1, prof2, asig2, clasesM9 );
        Materia mat10 = new Materia(10, "Intro a la Investigacion", 24, 1, 1, prof2, asig2, clasesM10 );
        
        Materia mat11 = new Materia(11, "Proyecto de vida", 23, 1, 1, prof3, asig3, clasesM11 );
        
        Materia mat12 = new Materia(12, "Etica", 23, 1, 1, prof4, asig4, clasesM12 );
        
        Materia mat13 = new Materia(13, "Intro a ejecucion", 25, 1, 1, prof5, asig5, clasesM13 );
        Materia mat14 = new Materia(14, "Requerimientos", 25, 1, 1, prof5, asig5, clasesM14 );
        Materia mat15 = new Materia(15, "Construccion", 25, 1, 1, prof5, asig5, clasesM15 );
        
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
        
        Timestamp dt777= new Timestamp(2017,7,1,7,0,0,0);
        Timestamp dt7710= new Timestamp(2017,7,1,10,0,0,0);
        
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
        
        Recurso recurso = new Recurso(100, "recurso -2");        
        
        Clase cl1a = new Clase(1,recurso,dt777, dt778, 31);
        Clase cl2a = new Clase(1,recurso,dt778, dt7710, 32);        
        Clase cl3a = new Clase(1,recurso,dt7710, dt7711, 33);      
        Clase cl4a = new Clase(1,recurso,dt7712, dt7713, 34);      
        Clase cl5a = new Clase(1,recurso,dt7713, dt7714, 35);      
        Clase cl6a = new Clase(1,recurso,dt7714, dt7715, 36);
        Clase cl7a = new Clase(1,recurso,dt1067, dt1068, 37);  // ----------------
        Clase cl8a = new Clase(1,recurso,dt1068, dt10610, 38); 
        Clase cl9a = new Clase(1,recurso,dt10610, dt10611, 39);
        Clase cl10a = new Clase(1,recurso,dt10611, dt10612, 40); 
        Clase cl11a = new Clase(1,recurso,dt10612, dt10613, 41); 
        Clase cl12a = new Clase(1,recurso,dt10613, dt10614, 42); 
        Clase cl13a = new Clase(1,recurso,dt3067, dt30610, 43);  // ---------------- //
        Clase cl14a = new Clase(1,recurso,dt30610, dt30611, 44);
        Clase cl15a = new Clase(1,recurso,dt30611, dt30612, 45);
        
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
              
        Materia mat1 = new Materia(1, "Gerencia de riesgos", 24, 1, 1, prof1, asig1, clasesM1 );
        Materia mat2 = new Materia(2, "G cominicaciones", 24, 1, 1, prof1, asig1, clasesM2 );
        Materia mat3 = new Materia(3, "G calidad", 24, 1, 1, prof1, asig1, clasesM3 );
        Materia mat4 = new Materia(4, "Liderazgoy trabajo", 24, 1, 1, prof1, asig1, clasesM4 );
        Materia mat5 = new Materia(5, "Negociación", 24, 1, 1, prof1, asig1, clasesM5 );
        Materia mat6 = new Materia(6, "Creatividad Inn", 24, 1, 1, prof1, asig1, clasesM6 );
        
        Materia mat7 = new Materia(7, "Taller trabajo grado", 24, 1, 1, prof2, asig2, clasesM7 );
        Materia mat8 = new Materia(8, "Taller trabajo grado2", 24, 1, 1, prof2, asig2, clasesM8 );
        Materia mat9 = new Materia(9, "Sustentacion grup", 24, 1, 1, prof2, asig2, clasesM9 );
        Materia mat10 = new Materia(10, "Intro a la Investigacion", 24, 1, 1, prof2, asig2, clasesM10 );
        
        Materia mat11 = new Materia(11, "Proyecto de vida", 23, 1, 1, prof3, asig3, clasesM11 );
        
        Materia mat12 = new Materia(12, "Etica", 23, 1, 1, prof4, asig4, clasesM12 );
        
        Materia mat13 = new Materia(13, "Intro a ejecucion", 25, 1, 1, prof5, asig5, clasesM13 );
        Materia mat14 = new Materia(14, "Requerimientos", 25, 1, 1, prof5, asig5, clasesM14 );
        Materia mat15 = new Materia(15, "Construccion", 25, 1, 1, prof5, asig5, clasesM15 );
        
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
        List<Clase> all = new ArrayList<>();
        /*
        all = Stream.of(clasesAll1, clasesAll2);
        try {
            for(int i=0;){
            }
        } catch (Exception e) {
        }
        
        for(){
        }
        
        */
       return clx;
    }

    @Override
    public List<Clase> consultarClases() throws ExcepcionServiciosUPPOST {
         // id periodo - 0: todos, 1: per 1, 2: per2
         /*
        if(id == 0){
            
        }*/
         
       return null;
    }

    @Override
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        return materias;
    }
    
    @Override
    public List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST {
        /*
        for(int i=0;i<clasesAll.size();i++){
            System.out.println(clasesAll.get(i));
        } */
        return clasesAll1;
    }

    @Override
    public List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST {
        return periodosAll;
    }
}