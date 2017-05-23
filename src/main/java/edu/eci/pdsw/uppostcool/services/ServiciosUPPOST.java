/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.services;

import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Periodo;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.entities.Programa;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author juan
 */
public interface ServiciosUPPOST {

    //---------------------------------------------------------------ServiciosClase
    
    
    /**
     * Consulta la clase con id
     *
     * @param id identificados de la clase
     * @return La clase con todo sus detalles y recursos
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un
     * error a nivel de base de datos, la clase no existe
     */
    public abstract Clase consultarClase(int id) throws ExcepcionServiciosUPPOST;

    /**
     * Consulta toda las clases
     *
     * @return Una lista de todas las clases
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos, la clase no existe
     */
    public abstract List<Clase> consultarClases() throws ExcepcionServiciosUPPOST;

    /**
     * Consulta la clase de la materia
     *
     * @param id identificados de la clase
     * @return La clase con todo sus detalles y recursos
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un
     * error a nivel de base de datos, la clase no existe
     */
    public abstract List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST;

    /**
     *
     * Consulta las clases de un periodo academico
     *
     * @return Retorna una lista de clases
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos.e
     */
    public abstract List<Clase> consultarClasesxPeriodo(int año, int semestre) throws ExcepcionServiciosUPPOST;

    /**
     * Consulta clases por periodo
     *
     * @param periodo
     * @return Una lista con las clases de ese periodo
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Clase> consultarClasePeriodo(Periodo periodo) throws ExcepcionServiciosUPPOST;
    
      /**
     * Inserta clase
     * @param fecha
     * @param horaInicio
     * @param horaFin
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract void insertarClase(Date fecha, Time horaInicio, Time horaFin)throws ExcepcionServiciosUPPOST;

    //---------------------------------------------------------------ServiciosMateria
    
    
    /**
     * Consulta la materia con Co y Pre requisitos
     *
     * @param codigo identificado de la materia
     * @param id_programa identificador del programa
     * @return La materia y sus características con sus co y pre requisitos
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un
     * error a nivel de base de datos, la clase no existe
     */
    public abstract Materia consultarMateriaConRequisitos(String codigo, int id_programa) throws ExcepcionServiciosUPPOST;

    /**
     * Consulta las materias de un periodo
     *
     * @param semestre numero de semestre identificado con 1 o 2
     * @param anio año de que se desea consultar
     * @return Las materias de un periodo específico
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un
     * error a nivel de base de datos, la clase no existe
     */
    public abstract List<Materia> consultarMaterias(int semestre, int anio) throws ExcepcionServiciosUPPOST;

    /**
     * Consulta todas las materias
     *
     * @return
     * @throws ExcepcionServiciosUPPOST
     */
    public abstract List<Materia> consultarMaterias() throws ExcepcionServiciosUPPOST;

    /**
     * Consulta las materias de un programa
     *
     * @param id_programa
     * @return Las materias de un programa específico
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un
     * error a nivel de base de datos, la clase no existe
     */
    public abstract List<Materia> consultarMateriasPrograma(int id_programa) throws ExcepcionServiciosUPPOST;

    
    /**
     * Inerta una materia
     *
     * @param materia
     * @param prerequisitos
     * @param corequisitos
     * @throws ExcepcionServiciosUPPOST
     */
    public abstract void insertarMateria(Materia materia, List<Tuple> prerequisitos, List<Tuple> corequisitos, List<Asignatura> asignaturas) throws ExcepcionServiciosUPPOST;
    
    //---------------------------------------------------------------ServiciosPeriodo
    
    
    /**
     * Consulta los periodos academicos
     *
     * @return Una lista de los ultimos 4 periodos academicos
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST;

    /**
     * Consulta  periodos academicos
     *
     * @return Una lista con el periodo academico
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Periodo> consultarPAcademico() throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta todos los periodos academicos de la base de datos
     *
     * @return Una lista de periodos academicos
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Periodo> consultarPeriodos() throws ExcepcionServiciosUPPOST;
    
    
    //---------------------------------------------------------------ServiciosProfesor


    /**
     * Consulta todos los profesores
     *
     * @return Una lista con los profesores
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Profesor> consultarProfesores() throws ExcepcionServiciosUPPOST;

    /**
     * Consulta un profesor
     *
     * @param cohorte
     * @param materia
     * @return profesor
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract Profesor consultarProfesor(int cohorte, String materia) throws ExcepcionServiciosUPPOST;
    
     /**
     * Consultar profesores por atributo de nombre
     * @return  lista total de profesores seleccionados
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Profesor> consultarProfesoresXnombre(String nombre)throws ExcepcionServiciosUPPOST;
    
    //---------------------------------------------------------------ServiciosPrograma
        
    /**
     * Consultar programas
     *
     * @return lista total de Programas
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Programa> consultarProgramas() throws ExcepcionServiciosUPPOST;
    
    /**
     * Consultar un programa por su nombre
     * @Param nombre 
     * @return Programa
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract Programa consultarPrograma(String nombre) throws ExcepcionServiciosUPPOST;
    
    /**
     * Resgistra un programa 
     * @Param programa 
     * 
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract void registrarPrograma(Programa programa) throws ExcepcionServiciosUPPOST;
    
    //---------------------------------------------------------------ServiciosAsignatura
    
    /**
     * Consultar asignaturas
     *
     * @return lista total de Programas
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Asignatura> consultarAsignaturas() throws ExcepcionServiciosUPPOST;
    
    
    //----------------------------------------------------------------ServiciosVarios
    
    /**
     * Consultar fechas
     *
     * @param fecha
     * @return una lista de fechas segun el periodo
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base
     * de datos
     */
    public abstract List<Date> consultarFechas(Periodo fecha) throws ExcepcionServiciosUPPOST;

    
    public abstract List<Clase> consultarClasesXprofesor(int ano, int semestre, String profesor);
    
    
    
 

}
