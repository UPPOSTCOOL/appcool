/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.uppostcool.entities.Profesor;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import edu.eci.pdsw.uppostcool.services.impl.ServiciosUPPOSTImpl;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2092669
 */
public class ProfesorJUnitTest {
    
    public ProfesorJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void ConsultarProfesorXnombreTest() throws SQLException, ExcepcionServiciosUPPOST {

        //consultar profesor por nombre o apellido segun sea el criterio del usuario
        
        ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServicesForTesting();
        //System.out.println("HOla aqui estoy");
        List<Profesor> profesor = inp.consultarProfesoresXnombre("Claudia");
        Assert.assertTrue("el nombre del profesor no coicide con Claudia", profesor.get(1).getNombre().contains("Claudia"));

    }
    
    

}


