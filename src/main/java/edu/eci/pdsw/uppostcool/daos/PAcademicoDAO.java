/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.daos;

import edu.eci.pdsw.uppostcool.entities.Periodo;
import java.util.List;

/**
 *
 * @author 2092815
 */
public interface PAcademicoDAO {


    public void save(Periodo c) throws PersistenceException;

    public Periodo load(int id) throws PersistenceException;

    public List<Periodo> loadAll() throws PersistenceException;
    
    public void saveAll() throws PersistenceException;

}
