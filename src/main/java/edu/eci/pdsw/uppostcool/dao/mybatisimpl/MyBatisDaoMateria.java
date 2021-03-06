/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.dao.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.uppostcool.daos.MateriaDAO;
import edu.eci.pdsw.uppostcool.dao.mybatis.mappers.MateriaMapper;
import edu.eci.pdsw.uppostcool.daos.PersistenceException;
import edu.eci.pdsw.uppostcool.entities.Materia;
import java.util.List;

/**
 *
 * @author UPPOST-COOL
 */
public class MyBatisDaoMateria implements MateriaDAO {

    @Inject
    private MateriaMapper mmap;

    @Override
    public List<Materia> consultarMateriasDAO(int semestre, int anio) throws PersistenceException {
        return mmap.consultarMateriasClase(semestre, anio);
    }

    @Override
    public List<Materia> consultarMateriasPorProgramaDAO(int id_programa) throws PersistenceException {
        return mmap.consultarMateriasPorPrograma(id_programa);
    }

    @Override
    public Materia consultarMateriaConRequisitosDAO(String codigo, int id_programa) throws PersistenceException {
        return mmap.consultarMateriaConRequisitos(codigo, id_programa);
    }

    @Override
    public void insertarMateriaDAO(Materia materia, List<String[]> pre, List<String[]> co, List<Integer> ids_asignatura) {
        mmap.insertarMateria(materia.getCodigo(), materia.getNombre(), materia.getDescripcion());
        for (int i = 0; i < pre.size(); i++) {
            mmap.insertarMateriaPrerequisito(materia.getCodigo(), pre.get(i)[0], Integer.parseInt(pre.get(i)[1]));
        }
        for (int i = 0; i < co.size(); i++) {
            mmap.insertarMateriaCorequisito(materia.getCodigo(), co.get(i)[0], Integer.parseInt(co.get(i)[1]));
        }
        for (int i = 0; i < ids_asignatura.size(); i++) {
            mmap.insertarAsign_Mater(ids_asignatura.get(i), materia.getCodigo());
        }
    }

    @Override
    public List<Materia> consultarMateriasDAO() {
        return mmap.consultarMaterias();
    }

    @Override
    public void actualizarMateriaDAO(String codigoAnterior, Materia materia, List<String[]> pre, List<String[]> co, List<Integer> ids_asignatura) {
        mmap.actualizarMateria(codigoAnterior, materia.getCodigo(), materia.getNombre(), materia.getDescripcion());
        mmap.eliminarMateriaPrerequisitos(materia.getCodigo());
        mmap.eliminarMateriaPrerequisitos(codigoAnterior);
        for (int i = 0; i < pre.size(); i++) {
            mmap.insertarMateriaPrerequisito(materia.getCodigo(), pre.get(i)[0], Integer.parseInt(pre.get(i)[1]));
        }
        mmap.eliminarMateriaCorequisitos(materia.getCodigo());
        mmap.eliminarMateriaCorequisitos(codigoAnterior);
        for (int i = 0; i < co.size(); i++) {
            mmap.insertarMateriaCorequisito(materia.getCodigo(), co.get(i)[0], Integer.parseInt(co.get(i)[1]));
        }
        mmap.eliminarAsign_Mater(materia.getCodigo());
        mmap.eliminarAsign_Mater(codigoAnterior);
        for (int i = 0; i < ids_asignatura.size(); i++) {
            mmap.insertarAsign_Mater(ids_asignatura.get(i), materia.getCodigo());
        }
    }

    @Override
    public List<Materia> consultarMateriasPorProgramaExceptMateriaDAO(int id_programa, String codigoMateria) {
        return mmap.consultarMateriasPorProgramaExceptMateria(id_programa, codigoMateria);
    }
}
