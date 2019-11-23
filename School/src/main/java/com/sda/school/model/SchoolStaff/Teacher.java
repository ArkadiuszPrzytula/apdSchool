package com.sda.school.model.SchoolStaff;

import com.sda.school.model.ClassTeacher;
import com.sda.school.model.EntityBase;
import com.sda.school.model.PersonInformation.Person;
import com.sda.school.model.enums.SubjectPool;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Teacher")
@Table(name = "teacher")
public class Teacher extends EntityBase {

    //  FIELDS  //

    @Column(name = "subject")
    private List<SubjectPool> subjectPools;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;


    @OneToMany(mappedBy = "class_teacher")
    private List<ClassTeacher> classes;


    //  METHODS //



    // CONSTRUCTORS //

    public Teacher() {
        //  EMPTY   //
    }

    public Teacher(Person person) {
        this.person = person;
    }

    // GETTERS & SETTERS    //

    public List<SubjectPool> getSubjectPools() {
        return subjectPools;
    }

    public void setSubjectPools(List<SubjectPool> subjectPools) {
        this.subjectPools = subjectPools;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<ClassTeacher> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassTeacher> classes) {
        this.classes = classes;
    }
}
