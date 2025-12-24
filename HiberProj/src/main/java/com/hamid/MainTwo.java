package com.hamid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainTwo {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop();
        lap1.setLid(1);
        lap1.setBrand("Dell");
        lap1.setModel("Inspiron");
        lap1.setRam(12);

        Laptop lap2 = new Laptop();
        lap2.setLid(2);
        lap2.setBrand("Hp");
        lap2.setModel("Pavilion");
        lap2.setRam(16);

        Laptop lap3 = new Laptop();
        lap3.setLid(3);
        lap3.setBrand("Apple");
        lap3.setModel("Macbook Air");
        lap3.setRam(8);

        Employees emp1 = new Employees();
        emp1.seteId(101);
        emp1.setName("Hamid");
        emp1.setTech("Java");

        Employees emp2 = new Employees();
        emp2.seteId(102);
        emp2.setName("Toheed");
        emp2.setTech("Python");

        Employees emp3 = new Employees();
        emp3.seteId(103);
        emp3.setName("Mahi");
        emp3.setTech("Next.js");

        emp1.setLaptops(List.of(lap2,lap3));
        emp2.setLaptops(List.of(lap1,lap2));
        emp3.setLaptops(List.of(lap1));

//        lap1.setEmployees(List.of(emp2,emp3));
//        lap2.setEmployees(List.of(emp1,emp2));
//        lap3.setEmployees(List.of(emp1));


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.hamid.Employees.class)
                .addAnnotatedClass(com.hamid.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction trnx = session.beginTransaction();

        session.persist(lap1);
        session.persist(lap2);
        session.persist(lap3);

//        session.persist(emp1);
//        session.persist(emp2);
//        session.persist(emp3);

        trnx.commit();

        Employees emp4 = session.find(Employees.class,102);
        System.out.println(emp4);

        session.close();
        sf.close();
    }
}
