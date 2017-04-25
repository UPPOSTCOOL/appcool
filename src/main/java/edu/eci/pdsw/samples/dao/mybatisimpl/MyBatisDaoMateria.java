/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.daos.ClaseDAO;
import edu.eci.pdsw.samples.daos.MateriaDAO;
import edu.eci.pdsw.samples.daos.PersistenceException;
import edu.eci.pdsw.samples.dao.mybatis.mappers.ClaseMapper;
import edu.eci.pdsw.samples.dao.mybatis.mappers.MateriaMapper;
import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class MyBatisDaoMateria implements MateriaDAO{
    @Inject
    private MateriaMapper mmap;

    @Override
    public List<Materia> consultarMateriasDAO(int semestre, int anio) throws ExcepcionServiciosUPPOST {
        return mmap.consultarMateriasClase(semestre,anio);
    }
    
}
