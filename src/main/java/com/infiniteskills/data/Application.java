package com.infiniteskills.data;

import org.hibernate.Session;

/**
 * Created by client on 01.01.2018.
 */
public class Application {
    public static void main(String[] args){
        Session session= HibernateUtil.getSessionFactory().openSession();

        //session.beginTransaction();
        //session.close();
    }
}
