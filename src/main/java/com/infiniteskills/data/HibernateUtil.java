package com.infiniteskills.data;

import com.infiniteskills.data.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by client on 01.01.2018.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory=buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            Configuration configuration=new Configuration();
            configuration.addAnnotatedClass(User.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        }catch(Exception e){
            e.printStackTrace();
        }


        return null;
    }

    public static SessionFactory getSessionFactory(){
        return  sessionFactory;
    }


}
