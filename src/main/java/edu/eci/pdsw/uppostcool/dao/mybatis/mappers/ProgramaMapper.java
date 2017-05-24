package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Programa;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author UPPOST-COOL UPPOST-COOL
 */
public interface ProgramaMapper {

    public List<Programa> consultarProgramas();

    public Programa consultarPrograma(@Param("nombrePrograma") String nombre);

    public void insertarPrograma(@Param("programa") Programa p);
}
