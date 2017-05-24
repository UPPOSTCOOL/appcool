package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Profesor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author UPPOST-COOL UPPOST-COOL
 */
public interface ProfesorMapper {

    public List<Profesor> consultarProfesoresXclases(@Param("nombre") String nombre);

    public List<Profesor> consultarProfesores();

}
