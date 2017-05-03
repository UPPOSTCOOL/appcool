
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pdsw.upcool.managebeans;
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Recurso;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Carol
 */
@ManagedBean(name = "PruebaSalonBean")
@SessionScoped
public class beenPruebaSalon {
    
    
    private int anio;
    private int semestre;
    
    private final ServiciosUPPOST inp=ServiciosUPPOSTFactory.getInstance().getUPPOSTServices();
 
    public beenPruebaSalon(){
            
    }
 

    
}


