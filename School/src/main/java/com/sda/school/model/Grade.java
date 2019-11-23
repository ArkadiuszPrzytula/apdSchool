package com.sda.school.model;

import com.sda.school.model.SchoolStaff.Teacher;

import javax.persistence.*;

@Table(name = "grade")
@Entity(name = "Grade")
public class Grade extends EntityBase {

    //  FIELDS  //
    @Column(name = "value", nullable = false)
    private Integer value;

    @Column(name = "weigh", nullable = false)
    private Double weigh;

    @ManyToOne(optional = false)
    @JoinColumn( name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne(optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;


    @ManyToOne(optional = false)
    @JoinColumn(name = "term")
    private Term term;

    //  METHODS //

    //  CONSTRUCTORS    //

    public Grade() {
        //For ORM
    }

    public Grade(Integer value, Double weigh, Teacher teacher, Subject subject, Term term) {
        this.value = value;
        this.weigh = weigh;
        this.teacher = teacher;
        this.subject = subject;
        this.term = term;
    }

    // METHODS  //

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Double getWeigh() {
        return weigh;
    }

    public void setWeigh(Double weigh) {
        this.weigh = weigh;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }
}

