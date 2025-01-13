package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.io.File;

public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;

    static {
        try{
            String hibernatePropsFilePath = "./src/hibernate.cfg.xml";
            File hibernatePropsFile = new File(hibernatePropsFilePath);
            SESSION_FACTORY = new Configuration().configure(hibernatePropsFile).buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Error por lo que sea" + ex.getMessage());
            throw new ExceptionInInitializerError();
        }
    }

    public static SessionFactory get(){
        return SESSION_FACTORY;
    }

}
