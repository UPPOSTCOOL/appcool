package edu.eci.pdsw.samples.dao.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Materia;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2083722
 */
public interface MateriaMapper {
    /*
    * consulta el listado de clases de asignaturas en el semestre=1|2 y anio
    */
    public ArrayList<Materia> consultarMateriasClase(@Param("anio") int anio,@Param("semestre") int semestre);
}
