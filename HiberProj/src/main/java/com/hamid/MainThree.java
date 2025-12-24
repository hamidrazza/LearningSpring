package com.hamid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class MainThree {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.setLid(4);
        lap1.setBrand("Dell");
        lap1.setModel("XPS");
        lap1.setRam(16);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.hamid.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(lap1);

        String brnd = "Dell";
//        Query query1 = session.createQuery("from Laptop where brand like 'Dell'");
        Query query2 = session.createQuery("select model from Laptop where brand like ?1");
        query2.setParameter(1,brnd);

        List<String> laptops = query2.getResultList();

        System.out.println(laptops);

//        transaction.commit();
        session.close();
        sf.close();
    }
}
