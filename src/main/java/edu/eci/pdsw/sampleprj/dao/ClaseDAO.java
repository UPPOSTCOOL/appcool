/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sampleprj.dao;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author appcool
 */
public interface ClaseDAO {
    
    public void save(Clase c) throws PersistenceException;

    public Clase load(int id) throws PersistenceException;

    public List<Clase> loadClases() throws PersistenceException;

    //public List<Clase> loadItemRentado(Timestamp fechainicio) throws PersistenceException ;
    
    public ArrayList<Materia> consultarMateriasDAO(int semestre,int anio) throws ExcepcionServiciosUPPOST;
    
}
