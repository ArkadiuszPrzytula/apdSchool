package com.sda.school.model;


import com.sda.school.model.SchoolStaff.Teacher;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ClassTeacher")
@Table(name = "class_teacher")
public class ClassTeacher extends EntityBase {

    //  FIELDS  //

    @ManyToOne(optional = false)
    @JoinColumn(name = "teacher_id")
    private Teacher teachers;

    @ManyToOne(optional = false)
    @JoinColumn(name = "class_id")
    private SchoolClass classes;


    //  METHODS //

    // CONSTRUCTORS //

    public ClassTeacher() {
    }

    public ClassTeacher(Teacher teachers, SchoolClass classes) {
        this.teachers = teachers;
        this.classes = classes;
    }

// GETTERS & SETTERS //


    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }

    public SchoolClass getClasses() {
        return classes;
    }

    public void setClasses(SchoolClass classes) {
        this.classes = classes;
    }
}
