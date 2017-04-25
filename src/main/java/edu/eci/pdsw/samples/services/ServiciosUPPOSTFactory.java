/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;

import edu.eci.pdsw.sampleprj.dao.ClaseDAO;
import edu.eci.pdsw.sample.dao.mybatisimpl.MyBatisDaoClase;
import edu.eci.pdsw.samples.services.impl.ServiciosUPPOSTImpl;

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
    
    private ServiciosUPPOSTFactory(){
        injector = createInjector(new XMLMyBatisModule() {

                    @Override
                    protected void initialize() {
                        install(JdbcHelper.PostgreSQL);
                        setClassPathResource("mybatis-config.xml");                        
                        bind(ServiciosUPPOST.class).to(ServiciosUPPOSTImpl.class);
                        bind(ClaseDAO.class).to(MyBatisDaoClase.class);
                        
                    }

                }
                
        );
        
        testingInjector = createInjector(new XMLMyBatisModule() {

                    @Override
                    protected void initialize() {
                        install(JdbcHelper.PostgreSQL);                        
                        setClassPathResource("h2-mybatis-config.xml");                        
                        bind(ServiciosUPPOST.class).to(ServiciosUPPOSTImpl.class);
                        bind(ClaseDAO.class).to(MyBatisDaoClase.class);
                        
                    }

                }
                
        );
        
    }

    public ServiciosUPPOST getUPPOSTServices(){
        return injector.getInstance(ServiciosUPPOST.class);   
    }

    public ServiciosUPPOST getUPPOSTServicesForTesting(){
        return testingInjector.getInstance(ServiciosUPPOST.class);   
    }


    
    public static ServiciosUPPOSTFactory getInstance(){
        return instance;
    }
    public static void main(String a[]) throws ExcepcionServiciosUPPOST{
       //System.out.println(ServiciosSuscripcionesFactory.getInstance().getSuscriptionServices().comenteriosMasBajosPorRangoEdad(1, 10));
    }
}
