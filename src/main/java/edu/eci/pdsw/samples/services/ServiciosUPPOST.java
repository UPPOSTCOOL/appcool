/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.PeriodoAcademico;
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
    public abstract List<PeriodoAcademico> consultarPAcademicos() throws ExcepcionServiciosUPPOST;
    
    
}
