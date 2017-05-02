/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.entities.Programa;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Recurso;
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

    @Override
    public List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        return materias;
    }

    private void poblar() {

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
    }

    @Override
    public List<Clase> consultarClasesxPeriodo(PeriodoAcademico periodo) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
