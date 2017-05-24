package edu.eci.pdsw.uppostcool.daos;

import edu.eci.pdsw.uppostcool.entities.Profesor;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UPPOST-COOL
 */
public interface ProfesorDAO {

    public void save(Profesor c) throws PersistenceException;

    public Profesor load(int id) throws PersistenceException;

    public List<Profesor> loadAll() throws PersistenceException;

    public List<Profesor> consultarProfesoresXnombre(String nombre) throws PersistenceException;
}
