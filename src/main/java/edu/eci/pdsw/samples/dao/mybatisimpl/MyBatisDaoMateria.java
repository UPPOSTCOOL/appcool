/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.daos.MateriaDAO;
import edu.eci.pdsw.samples.dao.mybatis.mappers.MateriaMapper;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
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

    @Override
    public List<Materia> consultarMateriasPorProgramaDAO(int id_programa) throws ExcepcionServiciosUPPOST {
        return mmap.consultarMateriasPorPrograma(id_programa);
    }

    @Override
    public Materia consultarMateriaConRequisitosDAO(String codigo,int id_programa) throws ExcepcionServiciosUPPOST {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
