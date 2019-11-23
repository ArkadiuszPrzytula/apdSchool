package com.sda.school.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "subject")
@Entity(name = "Subject")
public class Subject extends EntityBase {

    //  FIELDS  //

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "average", nullable = false)
    private Double average = setAverage();

    @OneToMany(mappedBy = "grade")
    private List<Grade> grades;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id")
    private Student student;


    //  METHODS //

    // CONSTRUCTORS //

    public Subject() {
        // EMPTY //
    }

    public Subject(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    // GETTERS & SETTERS    //

    private Double setAverage() {
        Double tmpValue = 0.0;
        Double tmpWeight = 0.0;
        for (int i = 0; i < grades.size() - 1; i++) {
            tmpValue += grades.get(i).getValue() * grades.get(i).getWeigh();
            tmpWeight += grades.get(i).getWeigh();
        }
        return (tmpValue / tmpWeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getAverage() {
        return average;
    }
}
