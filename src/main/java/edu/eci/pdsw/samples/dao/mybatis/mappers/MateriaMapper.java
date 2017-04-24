package edu.eci.pdsw.samples.dao.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Materia;
import java.util.List;

/**
 *
 * @author 2083722
 */
public interface MateriaMapper {
    /*
    * consulta el listado de clases de asignaturas en el semestre
    */
    public List<Materia> consultarMateriasClase();
}
