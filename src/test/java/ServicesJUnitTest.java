/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "anonymous", "");
        Statement stmt = conn.createStatement();
        stmt.execute("delete from SUS_COMENTARIOS");
        stmt.execute("delete from SUS_SUSCRIPTORES");
        conn.commit();
        conn.close();
    }
    
    /**
     * Obtiene una conexion a la base de datos de prueba
     * @return
     * @throws SQLException 
     */
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "anonymous", "");        
    }

   @Test
    public void pruebaCeroTest() throws SQLException, ExcepcionServiciosUPPOST {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente
        Connection conn=getConnection();
        Statement stmt=conn.createStatement();        
        stmt.execute("INSERT INTO `SUS_SUSCRIPTORES` (`id`, `nombre`,`anyo_nacimiento`,`total_suscripciones`) VALUES (123,'PEDRO PEREZ',1980,10)");
        stmt.execute("INSERT INTO `SUS_COMENTARIOS` (`id`, `comentario`, `puntaje`, `fecha`, `CLIENTES_id`) VALUES (3,'El periodico llego en mal estado',3,'2015-01-01 00:00:00',123)");          
        conn.commit();
        conn.close();
	
        //Realizar la operacion de la logica y la prueba
        
        // --List<Comentario> comentarios=ServiciosSuscripcionesFactory.getInstance().getSuscriptionServicesForTesting().comenteriosMasBajosPorRangoNacimiento(1980, 2000);
        
        //assert ...
        //Assert.fail("Pruebas no implementadas aun...");
        
    }    
    
    
    
}
