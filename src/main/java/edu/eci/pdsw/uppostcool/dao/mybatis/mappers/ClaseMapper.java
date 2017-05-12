package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Clase;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2106913
 */
public interface ClaseMapper {
    
    public Clase consultarClase(@Param("idclase") int id);
    
    public List<Clase> consultarClases(@Param("ano") int ano, @Param("semestre") int semestre);
}