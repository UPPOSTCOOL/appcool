/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.dao.mybatis.mappers;


import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2092815
 */
public interface PAcademicoMapper {
    
    public List<PeriodoAcademico> consultarPAcademicos();
    
}
