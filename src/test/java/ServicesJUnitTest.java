/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.samples.entities.*;
import edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST;
import edu.eci.pdsw.samples.services.*;
import edu.eci.pdsw.samples.services.impl.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Tuple;
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
 * PRUEBAS - REGISTRAR MATERIA Resultado 
 * CE1: Nombre ya existe: No puede agregar
 * un nombre existente a otra materia: Nada 
 * CE2: Nombre no existe: Puede agregar
 * el nombre a la materia: Agrega nombre a la materia en creación 
 * CE3: Codigo ya
 * existe: No puede agregar un codigo que es de otra materia: Nada 
 * CE4: Codigo
 * no existe: Puede agregar el codigo unico a la materia: Agrega codigo a la
 * Materia en creación 
 * CE5: Nombre y Codigo, vacios: No puede agregar una
 * materia sin identificadores: Nada 
 * CE6: Nombre y Codigo, no Vacios: Puede
 * agregar atributos identificadores a la materia: Agrega nombre y codigo a la
 * materia en creación 
 * CE7: Descipcion Vacia: La materia puede no tener
 * descripción: Agregar Materia 
 * CE8: Descipcion no Vacia: Agrega la descripción
 * a la materia: Registra materia 
 * CE9: Prerrequisito = Correquisito: Una materia
 * no puede tener otras materias como prerrequisito y correquisito a la vez:
 * Error! 
 * CE10: Prerrequisito y Correquisito, Vacios: Puede registrar una
 * materia que no tenga dependencia de otra: Registra materia 
 * CE11:
 * Prerrequisito != Correquisito: Una materia puede tener prerrequisitos y
 * correquisitosRegistra: Registra Materia 
 * CE12: M.i -> M.j -> M.k "i< j< k<
 * Total.Materias": Si una materia tiene prerrequisitos en comun con otra que es
 * prerrequisito de ella, los prerrequisitos de la otra materia son tambien
 * prerrequisitos de la primera, No puede haber una materia que sea
 * prerrequisito de otra y esta no sea prerequisito de ella: Nada
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
     *
     * @throws SQLException
     * @throws edu.eci.pdsw.samples.services.ExcepcionServiciosUPPOST
     */
    /*
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
 /*
    CE1: Nombre ya existe: No puede agregar un nombre existente a otra materia: 
    *          Nada
     */
    @Test
    public void CF1() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();
                
        List<Materia> materias = sp.consultarMaterias();

        String nombre = "materia prueba";
        Materia mat = new Materia();
        mat.setNombre(nombre);  
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        Assert.assertEquals("Deberia almacenar las materias agregadas, tamano = 1", 0, materias.size());

    }

    /*      CE2: Nombre no existe: Puede agregar el nombre a la materia: 
 *          Agrega nombre a la materia en creación
     */
    @Test
    public void CF2() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String nombre = "materia prueba";
        
        Materia mat = new Materia();
        mat.setNombre(nombre);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getNombre());
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());

    }

    /*      CE3: Codigo ya existe: No puede agregar un codigo que es de otra materia: 
 *          Nada
     */
    @Test
    public void CF3() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        Materia mat = new Materia();
        mat.setCodigo(codigo);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 0, materias.size());

    }

    /*      CE4: Codigo no existe: Puede agregar el codigo unico a la materia: 
 *          Agrega codigo a la Materia en creación
     */
    
    @Test
    public void CF4() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        Materia mat = new Materia();
        mat.setCodigo(codigo);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", codigo, materias.get(0).getCodigo());

    }
    
 /*      CE5: Nombre y Codigo, vacios: No puede agregar una materia sin identificadores: 
 *          Nada
     */
    
    @Test
    public void CF5() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "";
        String nombre = "";
        Materia mat = new Materia();
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 0, materias.size());
    }
    
 /*      CE6: Nombre y Codigo, no Vacios: Puede agregar atributos identificadores a la materia:  
 *          Agrega nombre y codigo a la materia en creación
     */
    
   @Test
    public void CF6() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        String nombre = "materia prueba";
        Materia mat = new Materia();
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", codigo, materias.get(0).getCodigo());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getNombre());

    }
    
 /*      CE7: Descipcion Vacia: La materia puede no tener descripción: 
 *          Agregar Materia
     */
    
    
      @Test
    public void CF7() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        String nombre = "materia prueba";
        String descripcion = "";
        Materia mat = new Materia();
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        mat.setDescripcion(descripcion);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", codigo, materias.get(0).getCodigo());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getNombre());
    }
    
 /*      CE8: Descipcion no Vacia: Agrega la descripción a la materia: 
 *          Registra materia
     */
 
 @Test
    public void CF8() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        String nombre = "materia prueba";
        String descripcion = "materia prueba con nombre codigo y descripcion";
        Materia mat = new Materia();
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        mat.setDescripcion(descripcion);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", codigo, materias.get(0).getCodigo());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getNombre());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getDescripcion());
    }
 
 /*      CE9: Prerrequisito = Correquisito: Una materia no puede tener las mismas materias como prerrequisito y correquisito a la vez: 
 *          Error!
     */
    
    @Test
    public void CF9() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        String nombre = "materia prueba";
        String descripcion = "materia prueba con nombre codigo y descripcion";
        Materia mat = new Materia();
        Materia matP = new Materia();       
        
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        mat.setDescripcion(descripcion);
        
        List<Materia> pre = new ArrayList<>(); 
        
        pre.add(matP);
        
        mat.setPreRequisitos(pre);
        mat.setCoRequisitos(pre);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 0, materias.size());
    }
    
    
 /*      CE10: Prerrequisito y  Correquisito, Vacios: Puede registrar una materia que no tenga dependencia de otra: 
 *          Registra materia
     */
    
    @Test
    public void CF10() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        String nombre = "materia prueba";
        String descripcion = "materia prueba con nombre codigo y descripcion";
        Materia mat = new Materia();      
        
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        mat.setDescripcion(descripcion);
        
        List<Materia> pre = new ArrayList<>();
        List<Materia> cor = new ArrayList<>();
        
        mat.setPreRequisitos(pre);
        mat.setCoRequisitos(cor);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        //pre: mat y progra (cod y cod)  S y S
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", codigo, materias.get(0).getCodigo());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getNombre());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getDescripcion());
        Assert.assertEquals("Deberia agregar el nombre a la materia", 0, materias.get(0).getPreRequisitos().size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", 0, materias.get(0).getCoRequisitos().size());
    }
    
    
 /*      CE11: Prerrequisito != Correquisito: Una materia puede tener prerrequisitos y correquisitosRegistra:
 *          Registra Materia
     */
    
    
    @Test
    public void CF11() throws SQLException, ExcepcionServiciosUPPOST {
        ServiciosUPPOST sp = new ServiciosUPPOSTImpl();

        String codigo = "COD1";
        String nombre = "materia prueba";
        String descripcion = "materia prueba con nombre codigo y descripcion";
        Materia mat = new Materia();
        Materia matP = new Materia();
        Materia matC = new Materia();
        
        mat.setNombre(nombre);
        mat.setCodigo(codigo);
        mat.setDescripcion(descripcion);
        
        matP.setNombre("pre");
        matC.setNombre("cor");
        
        List<Materia> pre = new ArrayList<>();
        List<Materia> cor = new ArrayList<>();
        
        pre.add(matP);
        pre.add(matC);
        
        mat.setPreRequisitos(pre);
        mat.setPreRequisitos(cor);
        
        List<Tuple> tPre = new ArrayList<>();
        List<Tuple> tCor = new ArrayList<>();
        List<Asignatura> asigs = new ArrayList<>();
        
        sp.insertarMateria(mat, tPre, tCor, asigs);
        
        List<Materia> materias = sp.consultarMaterias();
        
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", codigo, materias.get(0).getCodigo());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getNombre());
        Assert.assertEquals("Deberia agregar el nombre a la materia", nombre, materias.get(0).getDescripcion());
        Assert.assertEquals("Deberia agregar el nombre a la materia", 1, materias.get(0).getPreRequisitos().size());
        Assert.assertEquals("Deberia agregar el nombre a la materia", 0, materias.get(0).getCoRequisitos().size());
    }
    
 /*      CE12: M.i -> M.j -> M.k "i< j< k< Total.Materias": Si una materia tiene prerrequisitos en comun con otra 
 *          que es prerrequisito de ella, los prerrequisitos de la otra materia son tambien prerrequisitos de la primera,
 *          No puede haber una materia que sea prerrequisito de otra y esta no sea prerequisito de ella:
 *          Nada
 * 
     */
     @Test
    public void CF12() throws SQLException, ExcepcionServiciosUPPOST {
    
    }
    
    
}
