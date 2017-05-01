/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.daos;

import java.util.List;

/**
 *
 * @author 2092815
 */
public interface AsignaturaDAO {
    
    public void save(AsignaturaDAO c) throws PersistenceException;

    public AsignaturaDAO load(int id) throws PersistenceException;

    public List<AsignaturaDAO> loadAll() throws PersistenceException;
    
}
