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

    public List<Materia> consultarMateriasClase(@Param("semestre") int semestre,@Param("anio") int anio);


    
    /*
    * consulta el listado de materias de un programa específico
    */
    public List<Materia> consultarMateriasPorPrograma(@Param("id_programa") int id_programa);
    
    /*
    * consulta una materia con su información y Co y Requisitos
    */
    public Materia consultarMateriaConRequisitos(@Param("codigo") String codigo,@Param("id_p") int id_programa);
}


