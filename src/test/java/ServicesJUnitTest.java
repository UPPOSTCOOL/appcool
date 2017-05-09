/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.samples.entities.Asignatura;
import edu.eci.pdsw.samples.entities.Materia;
import edu.eci.pdsw.samples.entities.PostGrado;
import edu.eci.pdsw.samples.entities.Profesor;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOST;
import edu.eci.pdsw.samples.services.ServiciosUPPOSTFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uppost
 */




/**
 *
 * PRUEBAS - REGISTRAR MATERIA
 *                                        Resultado
 *      CE1: Nombre ya existe:  Nada
 *      CE2: Nombre no existe:  Agrega materia
 *      CE3: Codigo ya existe:  Nada
 *      CE4: Codigo no existe:  Agrega Materia
 *      CE5: Nombre y Codigo, vacios: Nada
 *      CE6: Nombre y Codigo, no Vacios: 
 *      CE7: Descipcion Vacia: Registra materia
 *      CE8: Descipcion no Vacia: Registra materia
 *      CE9: Prerrequisito = Correquisito: Error!
 *      CE10: Prerrequisito y  Correquisito, Vacios: Registra materia
 *      CE11: Prerrequisito != Correquisito: Registra materia
 *      CE12: m0 -> m1 -> m2 NO puede m2 -> m0 NO m2 -> m1
 * 
 * 
 * 
 */
public class ServicesJUnitTest {
    
    public ServicesJUnitTest() {
    }
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void clearBD() throws SQLException {
        /*
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "anonymous", "");
        Statement stmt = conn.createStatement();
        stmt.execute("delete from Asignatura");
        stmt.execute("delete from Clase");
        stmt.execute("delete from Clase_Recur");
        stmt.execute("delete from Comit_Profe");
        stmt.execute("delete from Comite");
        stmt.execute("delete from Corequisito");
        stmt.execute("delete from HorarioProf");
        stmt.execute("delete from Mater_Perio");
        stmt.execute("delete from Materia");
        stmt.execute("delete from Periodo");
        stmt.execute("delete from Prerequisito");
        stmt.execute("delete from Profesor");
        stmt.execute("delete from Programa");
        stmt.execute("delete from Recurso");
        conn.commit();
        conn.close(); */
    }
    
    /**
     * Obtiene una conexion a la base de datos de prueba
     * @return
     * @throws SQLException 
     * @throws edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST 
     */ /*
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "anonymous", "");        
    }*/

    /*
   @Test
    public void pruebaCeroTest() throws SQLException, ExcepcionServiciosUPPOST {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente
        Connection conn=getConnection();
        Statement stmt=conn.createStatement();        
        stmt.execute("INSERT INTO `SUS_SUSCRIPTORES` (`id`, `nombre`,`anyo_nacimiento`,`total_suscripciones`) VALUES (123,'PEDRO PEREZ',1980,10)");
        
        stmt.execute("INSERT INTO `Materia` (`codigo`, `nombre`, `cohorte`, `numClases`, `numHoras`, `profesor`, `asignatura`, `clases`, `preRequisitos`, `coRequisitos`) VALUES ()");
        conn.commit();
        conn.close();
        
        //Asignatura asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales", post1);
        //Profesor prof1 = new Profesor(1, "German Motta");    
        //PostGrado post1 = new PostGrado(prof1, new ArrayList<>()); // lista 1 es vacia
        //Materia mat1 = new Materia("M1", "Gerencia de riesgos", 24, 1, 1, prof1, asig1, clasesM1, new ArrayList<Materia>(), new ArrayList<Materia>() );
	
        //Realizar la operacion de la logica y la prueba
        
        // --List<Comentario> comentarios=ServiciosSuscripcionesFactory.getInstance().getSuscriptionServicesForTesting().comenteriosMasBajosPorRangoNacimiento(1980, 2000);
        
        //assert ...
        //Assert.fail("Pruebas no implementadas aun...");
        
    }     */
    
    
    @Test
    public void CF1() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServicesForTesting();
        sp.insertarMateria();
        List<Materia> materias=sp.consultarMaterias(2017,1);      
        
        
        Assert.assertEquals("Deberia almacenas las materias agregadas, tamano > 0",1, materias.size());
        
    }
    
}
