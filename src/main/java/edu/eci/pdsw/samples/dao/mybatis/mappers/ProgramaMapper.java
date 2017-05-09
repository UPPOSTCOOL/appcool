package edu.eci.pdsw.samples.dao.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Programa;
import java.util.List;

/**
 *
 * @author 2083722
 */
public interface ProgramaMapper {
    public List<Programa> consultarProgramas();
}
