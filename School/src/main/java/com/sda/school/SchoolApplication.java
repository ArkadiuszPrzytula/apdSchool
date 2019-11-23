package com.sda.school;

import com.google.common.collect.Lists;
import com.sda.school.model.Grade;
import com.sda.school.model.PersonInformation.Person;
import com.sda.school.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SchoolApplication {


    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.sda.school_project");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Person p = new Person();
        p.setFirstName("Jan");
        p.setLastName("Kowalski");

        Student s = new Student();
        s.setPerson(p);

        em.persist(s);

        em.getTransaction().commit();

        String query = "SELECT s FROM Student s WHERE s.person.firstName =:firstName AND s.person.lastName=:lastName";

        List<Student> people = em.createQuery(query)
                .setParameter("lastName", "Kowalski").setParameter("firstName", "Jan").getResultList();
        System.out.println(people);
    }
}
