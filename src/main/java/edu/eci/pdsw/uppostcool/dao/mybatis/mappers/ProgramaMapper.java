package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Programa;
import java.util.List;

/**
 *
 * @author 2083722
 */
public interface ProgramaMapper {
    public List<Programa> consultarProgramas();
}
