package org.example;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Fetch {
    public static void main(String[] args) {
        String hibernateConfigPath = "hibernate.cfg.xml";

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure(hibernateConfigPath)
                .build();

        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        Query<Employee> query = session.createQuery("from Employee e", Employee.class);
        List<Employee> list = query.getResultList();

        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.getEmployeeId() + " " + emp.getFname() + " " + emp.getLname() + " " + emp.getEmail());

            // Assuming Employee has the appropriate getter for 'address'
            Address address = emp.getAddress();

            System.out.println(
                    address.getAddressLine1() + " " + address.getCity() + " " +
                            address.getState() + " " + address.getCountry() + " " + address.getZipcode()
            );
        }

        session.close();
        System.out.println("success");
    }
}
