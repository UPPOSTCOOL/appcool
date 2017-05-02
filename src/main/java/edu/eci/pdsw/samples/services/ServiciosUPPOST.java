/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import edu.eci.pdsw.samples.entities.Materia;
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
     * Consulta  los periodos academicos
     * @return Una lista de los ultimos 4 periodos academicos
     * @throws ExcepcionServiciosUPPOST si se presenta un error
     * a nivel de base de datos
     */
    public abstract List<PeriodoAcademico> consultarPAcademicos() throws ExcepcionServiciosUPPOST;
    
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
    public abstract List<Clase> consultarClasesxPeriodo(PeriodoAcademico periodo) throws ExcepcionServiciosUPPOST;
    
}
