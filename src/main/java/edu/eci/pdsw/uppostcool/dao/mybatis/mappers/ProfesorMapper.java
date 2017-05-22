package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Clase;
import edu.eci.pdsw.uppostcool.entities.Materia;
import edu.eci.pdsw.uppostcool.entities.Profesor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2083722
 */
public interface ProfesorMapper {
    
    public List<Profesor> consultarProfesoresXclases(@Param("nombre") String nombre);
    
}
