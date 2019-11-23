package com.sda.school.model;

import com.sda.school.model.PersonInformation.Person;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Student")
@Table(name = "student")
public class Student extends EntityBase {

    //  FIELDS  //

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Subject> subjects;

    @ManyToOne(optional = false)
    @JoinColumn(name = "school_class")
    private List<SchoolClass> classes;

    @OneToMany(mappedBy = "lesson")
    private List<Lesson> lessons;


    //  METHODS //

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //  GETTERS & SETTERS   //


    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<SchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(List<SchoolClass> classes) {
        this.classes = classes;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
