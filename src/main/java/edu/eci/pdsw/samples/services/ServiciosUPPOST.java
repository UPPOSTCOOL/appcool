/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Periodo;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.entities.Programa;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juan
 */
public interface ServiciosUPPOST {
    
    /**
     * Consulta la clase con id
     * @param id identificados de la clase
     * @return La clase con todo sus detalles y recursos
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un error
     * a nivel de base de datos, la clase no existe
     */
    public abstract Clase consultarClase(int id) throws ExcepcionServiciosUPPOST;
    
    
    /**
     * Consulta toda las clases 
     * @return Una lista de todas las clases
     * @throws ExcepcionServiciosUPPOST  si se presenta un error
     * a nivel de base de datos, la clase no existe
     */
    public abstract List<Clase> consultarClases() throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta la clase de la materia
     * @param id identificados de la clase
     * @return La clase con todo sus detalles y recursos
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un error
     * a nivel de base de datos, la clase no existe
     */
    public abstract List<Clase> consultarClasesMateria() throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta  los periodos academicos
     * @return Una lista de los ultimos 4 periodos academicos
     * @throws ExcepcionServiciosUPPOST si se presenta un error
     * a nivel de base de datos
     */
    public abstract List<Periodo> consultarPAcademicos() throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta  un periodo academico
     * @return Una lista con el periodo academico
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Periodo> consultarPAcademico(Periodo periodo) throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta las materias de un periodo
     * @param semestre numero de semestre identificado con 1 o 2
     * @param anio año de que se desea consultar
     * @return Las materias de un periodo específico
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un error
     * a nivel de base de datos, la clase no existe
     */
    public abstract List<Materia> consultarMaterias(int semestre,int anio) throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta las materias de un programa
     * @param id_programa
     * @return Las materias de un programa específico
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un error
     * a nivel de base de datos, la clase no existe
     */
    public abstract List<Materia> consultarMateriasPrograma(int id_programa) throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta todos los profesores
     * @return Una lista con los profesores
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Profesor> consultarProfesores() throws ExcepcionServiciosUPPOST;
    
     /**
     * Consulta un profesor
     * @return profesor
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract Profesor consultarProfesor(int cohorte, String materia) throws ExcepcionServiciosUPPOST;
    
     /**
     * Consulta clases por periodo 
     * @return Una lista con las clases de ese periodo
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Clase> consultarClasePeriodo(Periodo periodo) throws ExcepcionServiciosUPPOST;
    
     /**
     * Consultar fechas
     * @return  una lista de fechas segun el periodo
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Date> consultarFechas(Periodo fecha) throws ExcepcionServiciosUPPOST;
    
     /**
     * Consultar programas
     * @return  lista total de Programas
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Programa> consultarProgramas() throws ExcepcionServiciosUPPOST;
    
}
