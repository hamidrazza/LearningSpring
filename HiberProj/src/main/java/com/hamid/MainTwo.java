package com.hamid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTwo {
    public static void main(String[] args) {

        Laptop lap = new Laptop();
        lap.setLid(1);
        lap.setBrand("Dell");
        lap.setModel("Inspiron");
        lap.setRam(12);

        Employees emp = new Employees();
        emp.setName("Hamid");
        emp.seteId(101);
        emp.setTech("Java");
        emp.setLaptop(lap);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.hamid.Employees.class)
                .addAnnotatedClass(com.hamid.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction trnx = session.beginTransaction();

        session.persist(lap);
        session.persist(emp);
        trnx.commit();

        session.close();
        sf.close();
    }
}
