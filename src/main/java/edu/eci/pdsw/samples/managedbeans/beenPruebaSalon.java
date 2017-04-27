/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.upcool.managebeans;

import edu.eci.pdsw.samples.entities.Clase;
import edu.eci.pdsw.samples.entities.Recurso;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Carol
 */
@ManagedBean
public class beenPruebaSalon {
    private List<Clase> listaC = new ArrayList<Clase>();
 
    public beenPruebaSalon(){
        System.out.println("Inicio");
        initList();
    }
 
    private void initList(){
        Calendar calendar = Calendar.getInstance();
        Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
        Recurso d=new Recurso(23,"pc");
        Clase c1 = new Clase(0, d, currentTimestamp, currentTimestamp, 23);
        Recurso d1 = new Recurso(25, "portatiles");
        Clase c2 = new Clase(1, d1, currentTimestamp, currentTimestamp, 22);
        Recurso d2 = new Recurso(223, "video");
        Clase c3 = new Clase(2, d2, currentTimestamp, currentTimestamp, 2453);
        Recurso d6 = new Recurso(223, "Marcadores Borrables");
        Clase c4 = new Clase(2, d6, currentTimestamp, currentTimestamp, 2231);
        Recurso d3 = new Recurso(223, "sala MAC");
        Clase c5 = new Clase(2, d3, currentTimestamp, currentTimestamp, 2231);
        Recurso d4 = new Recurso(223, "Consolas");
        Clase c6 = new Clase(2, d4, currentTimestamp, currentTimestamp, 2446);
        listaC.add(c1);
        listaC.add(c2);
        listaC.add(c3);
        listaC.add(c4);
        listaC.add(c5);
        listaC.add(c6);
    }
    public List<Clase> getListaSalones() {
    return listaC;
    }
 
    public void setListaUsuarios(List<Clase> listaC) {
        this.listaC = listaC;
    }
}

