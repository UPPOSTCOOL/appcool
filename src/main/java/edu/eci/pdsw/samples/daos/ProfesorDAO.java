package edu.eci.pdsw.samples.daos;


import edu.eci.pdsw.samples.daos.PersistenceException;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2092815
 */
public interface ProfesorDAO {
    
    public void save(ProfesorDAO c) throws PersistenceException;

    public ProfesorDAO load(int id) throws PersistenceException;

    public List<ProfesorDAO> loadAll() throws PersistenceException;

}
