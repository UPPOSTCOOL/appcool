/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Profesor;
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
     * Consulta las materias de un periodo
     * @param semestre numero de semestre identificado con 1 o 2
     * @param anio año de que se desea consultar
     * @return La clase con todo sus detalles y recursos
     * @throws ExcepcionServiciosUPPOST si id es negativo o si se presenta un error
     * a nivel de base de datos, la clase no existe
     */
    public abstract List<Materia> consultarMaterias(int semestre,int anio) throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta las clases de un periodo academico
     * @param periodo PeriodoAcademico al que se le quiere consultar sus clases
     * @return Retorna una lista de clases
     * @throws ExcepcionServiciosUPPOST si se presenta un error
     * a nivel de base de datos.e
     */
    public abstract List<Clase> consultarClasesxPeriodo(int periodo) throws ExcepcionServiciosUPPOST;

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
    public abstract List<Clase> consultarClasePeriodo(PeriodoAcademico periodo) throws ExcepcionServiciosUPPOST;
    
     /**
     * Consultar fechas
     * @return  una lista de fechas segun el periodo
     * @throws ExcepcionServiciosUPPOST si se presenta un error a nivel de base de datos
     */
    public abstract List<Date> consultarFechas(PeriodoAcademico fecha) throws ExcepcionServiciosUPPOST;
    
    /**
     * Consulta todos los periodos academicos de la base de datos
     * @return Una lista de periodos academicos
     * @throws ExcepcionServiciosUPPOST  si se presenta un error
     * a nivel de base de datos
     */
    public abstract List<PeriodoAcademico> consultarPeriodos() throws ExcepcionServiciosUPPOST;

    
}
