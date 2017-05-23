/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.uppostcool.entities.Asignatura;
import edu.eci.pdsw.uppostcool.entities.Programa;
import edu.eci.pdsw.uppostcool.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOST;
import edu.eci.pdsw.uppostcool.services.ServiciosUPPOSTFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.apache.ibatis.exceptions.PersistenceException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2092815
 *
 * Pruebas para los servicios de Programa
 *
 */
public class ProgramaJUnitTest {

    public ProgramaJUnitTest() {
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
     * CE1: No se puede agregar un programa que ya existe - ResultadoEsperado:
     * ExcepcionServiciosUPPOST
     */
    @Test
    public void CE1Test() throws ExcepcionServiciosUPPOST {
        ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServicesForTesting();

        Programa p1 = new Programa(1, "Gerencia");

        Programa p2 = new Programa(2, "Gerencia");

        try {

            inp.registrarPrograma(p1);

            inp.registrarPrograma(p2);

            Assert.fail("Deberia capturar una Excepcion de PersistenceException ya que el nombre del programa ya existe");

        } catch (PersistenceException ex) {

        }
    }

    /**
     * CE2: Se debe poder agregar una lista de asignaturas al programa -
     * ResultadoEsperado:
     *
     * @Test public void CE2Test(){ ServiciosUPPOST inp =
     * ServiciosUPPOSTFactory.getInstance().getUPPOSTServicesForTesting();
     *
     * Programa p1 = new Programa(3, "Maestria ing civil");
     *
     * try { inp.registrarPrograma(p1); //inp.registrarPrograma(p2);
     *
     * } catch (ExcepcionServiciosUPPOST ex) {
     *
     * Assert.assertTrue("Deberia capturar una Excepcion", true);
     *
     * }
     *
     * }
     */
    /**
     * CE3: Se debe poder consultar un programa por el nombre -
     *
     */
    @Test
    public void CE3Test() throws ExcepcionServiciosUPPOST {
        ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServicesForTesting();

        Programa p1 = new Programa(4, "El nombre");

        List<Asignatura> lista1 = new ArrayList<>();

        Asignatura asig1 = new Asignatura(1, "conocimiento y habilidad es gerenciales", p1);
        Asignatura asig2 = new Asignatura(2, "tdgp", p1);
        Asignatura asig3 = new Asignatura(3, "semi", p1);
        Asignatura asig4 = new Asignatura(4, "conf", p1);
        Asignatura asig5 = new Asignatura(5, "ejecucuion", p1);

        lista1.add(asig1);
        lista1.add(asig2);
        lista1.add(asig3);
        lista1.add(asig4);
        lista1.add(asig5);
        
        p1.setAsignaturas(lista1);

        inp.registrarPrograma(p1);

        Programa p2 = inp.consultarPrograma("El nombre");

        Assert.assertEquals("No esta consultando los programas por el nombre", p1, p2);

    }

    /**
     * CE4: Se debe poder consultar todos los programas -
     *
     */
    @Test
    public void CE4Test() throws ExcepcionServiciosUPPOST {
        ServiciosUPPOST inp = ServiciosUPPOSTFactory.getInstance().getUPPOSTServicesForTesting();

        Programa p1 = new Programa(12, "GestionDelSaber");
        Programa p2 = new Programa(7, "EnNombreDeDios");
        Programa p3 = new Programa(5, "SuperAlgebra");

        List<Programa> pList1 = new ArrayList<>();

        pList1.add(p1);
        pList1.add(p2);
        pList1.add(p3);

        inp.registrarPrograma(p1);

        inp.registrarPrograma(p2);

        inp.registrarPrograma(p3);

        List<Programa> pList2 = inp.consultarProgramas();

        Assert.assertEquals("No esta consultando todos los programas", pList1, pList2);

    }

}
