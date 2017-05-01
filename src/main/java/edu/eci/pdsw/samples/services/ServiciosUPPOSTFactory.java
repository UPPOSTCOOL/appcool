/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.pdsw.samples.dao.mybatisimpl.MyBatisDaoAsignatura;

import edu.eci.pdsw.samples.daos.ClaseDAO;
import edu.eci.pdsw.samples.dao.mybatisimpl.MyBatisDaoClase;
import edu.eci.pdsw.samples.dao.mybatisimpl.MyBatisDaoMateria;
import edu.eci.pdsw.samples.dao.mybatisimpl.MyBatisDaoPAcademico;
import edu.eci.pdsw.samples.dao.mybatisimpl.MyBatisDaoProfesor;
import edu.eci.pdsw.samples.daos.AsignaturaDAO;
import edu.eci.pdsw.samples.daos.MateriaDAO;
import edu.eci.pdsw.samples.daos.PAcademicoDAO;
import edu.eci.pdsw.samples.daos.ProfesorDAO;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImpl;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImplStub;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

/**
 *
 * @author juan
 */
public class ServiciosUPPOSTFactory {

    private static ServiciosUPPOSTFactory instance = new ServiciosUPPOSTFactory();

    private static Injector injector;
    private static Injector testingInjector;

    private ServiciosUPPOSTFactory() {
        
        injector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setClassPathResource("mybatis-config.xml");
                bind(ServiciosUPPOST.class).to(ServiciosUPPOSTImpl.class);
                bind(ClaseDAO.class).to(MyBatisDaoClase.class);
                bind(MateriaDAO.class).to(MyBatisDaoMateria.class);
                bind(PAcademicoDAO.class).to(MyBatisDaoPAcademico.class);
                bind(ProfesorDAO.class).to(MyBatisDaoProfesor.class);
                bind(AsignaturaDAO.class).to(MyBatisDaoAsignatura.class);
            }

        });

        testingInjector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("h2-mybatis-config.xml");
                bind(ServiciosUPPOST.class).to(ServiciosUPPOSTImpl.class);
                bind(ClaseDAO.class).to(MyBatisDaoClase.class);
                bind(MateriaDAO.class).to(MyBatisDaoMateria.class);
                bind(PAcademicoDAO.class).to(MyBatisDaoPAcademico.class);
                bind(ProfesorDAO.class).to(MyBatisDaoProfesor.class);
                bind(AsignaturaDAO.class).to(MyBatisDaoAsignatura.class);
            }
        });

    }

    public ServiciosUPPOST getUPPOSTServices() {
        return injector.getInstance(ServiciosUPPOST.class);
    }
    
    public ServiciosUPPOST getUPPOSTServicesLocal() {
        return new ServiciosUPPOSTImplStub();
    }

    public ServiciosUPPOST getUPPOSTServicesForTesting() {
        return testingInjector.getInstance(ServiciosUPPOST.class);
    }

    public static ServiciosUPPOSTFactory getInstance() {
        return instance;
    }

    public AsignaturaDAO getAsignaturaDAO() {
        return injector.getInstance(AsignaturaDAO.class);
    }

    public ClaseDAO getClaseDAO() {
        return injector.getInstance(ClaseDAO.class);
    }

    public MateriaDAO getMateriaDAO() {
        return injector.getInstance(MateriaDAO.class);
    }

    public PAcademicoDAO getPAcademicoDAO() {
        return injector.getInstance(PAcademicoDAO.class);
    }

    public ProfesorDAO getProfesorDAO() {
        return injector.getInstance(ProfesorDAO.class);
    }

    public AsignaturaDAO getAsignaturaDAOTest() {
        return testingInjector.getInstance(AsignaturaDAO.class);
    }

    public ClaseDAO getClaseDAOTest() {
        return testingInjector.getInstance(ClaseDAO.class);
    }

    public MateriaDAO getMateriaDAOTest() {
        return testingInjector.getInstance(MateriaDAO.class);
    }

    public PAcademicoDAO getPAcademicoDAOTest() {
        return testingInjector.getInstance(PAcademicoDAO.class);
    }

    public ProfesorDAO getProfesorDAOTest() {
        return testingInjector.getInstance(ProfesorDAO.class);
    }

    public static void main(String a[]) throws ExcepcionServiciosUPPOST {
        //System.out.println(ServiciosSuscripcionesFactory.getInstance().getSuscriptionServices().comenteriosMasBajosPorRangoEdad(1, 10));
    }
}
