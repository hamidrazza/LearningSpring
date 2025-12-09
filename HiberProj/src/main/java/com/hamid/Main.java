package com.hamid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        //Student s2 = null;
        s1.setName("Mahi");
        s1.setRollNo(27);
        s1.setAge(23);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.hamid.Student.class);
//        cfg.configure();

        // The thing is we're using the above lines only one time
        // So why don't we just reduce it

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.hamid.Student.class)
                .configure()
                .buildSessionFactory();
        // Here we just reduced the above lines directly into 'SessionFactory'

        //SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        //Transaction trnx1 = session.beginTransaction();
        // For fetching the data we don't need transaction so let's comment those lines
        // Fetching data
        //s2 = session.find(Student.class,12);

        //session.persist(s1);
        //trnx1.commit();

        // Now, let's update the record
        // First create the object with the updated data
        Student s3 = new Student();
        s3.setName("Hamid");
        s3.setRollNo(10);
        s3.setAge(19);

        // Now use the .merge()->(because .update() is deprecated)
        //session.merge(s3); // One big advantage is, It's also insert the data if it's not available
        // This will select and update the data, but doesn't save it
        // So for saving we have to .commit() the transaction
        Transaction trnx2 = session.beginTransaction();
        //trnx2.commit();

        // For deleting the data
        // Use .remove(Object o)
        // So for removing you can first fetch the data using Primary data
        // Or you can just pass the object directly
        Student s4 = new Student();
        s4 = session.find(Student.class, 12);

        session.remove(s4);
        trnx2.commit();
        session.close();
        sf.close();
        //System.out.println(s2);
    }
}

