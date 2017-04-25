/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sampleprj.dao;

import edu.eci.pdsw.samples.entities.PeriodoAcademico;
import java.util.List;

/**
 *
 * @author 2092815
 */
public interface PAcademicoDAO {

    public void save(PeriodoAcademico c) throws PersistenceException;

    public PeriodoAcademico load(int id) throws PersistenceException;

    public List<PeriodoAcademico> loadAll() throws PersistenceException;

}
