/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.uppostcool.daos;

import edu.eci.pdsw.uppostcool.entities.Programa;
import java.util.List;

/**
 *
 * @author 2092815
 */
public interface ProgramaDAO {
   

    public List<Programa> loadAll() throws PersistenceException;
}
