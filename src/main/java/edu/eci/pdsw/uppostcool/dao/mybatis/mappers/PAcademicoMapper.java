/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;


import edu.eci.pdsw.uppostcool.entities.Periodo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2092815
 */
public interface PAcademicoMapper {
    
    public List<Periodo> consultarPAcademicos();
    
}
