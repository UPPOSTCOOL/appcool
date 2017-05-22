package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Programa;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2083722
 */
public interface ProgramaMapper {
    
    public List<Programa> consultarProgramas();
    
    public List<Programa> consultarPrograma();
    
    public void insertarCliente(@Param("cliente") Programa p);
}
