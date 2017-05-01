/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.daos;

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
public interface MateriaDAO {
    public List<Materia> consultarMateriasDAO(int semestre,int anio) throws ExcepcionServiciosUPPOST;
}
