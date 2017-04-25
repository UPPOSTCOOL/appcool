package edu.eci.pdsw.samples.dao.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Recurso;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2106913
 */
public interface ClaseMapper {
    
    public Clase consultarClase(@Param("idclase") int id);
}