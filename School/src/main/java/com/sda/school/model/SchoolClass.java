package com.sda.school.model;

import com.sda.school.model.SchoolStaff.Teacher;
import com.sda.school.model.enums.ProfileClass;
import com.sda.school.model.enums.YearStep;

import javax.persistence.*;
import java.util.List;

@Table(name = "grade")
@Entity(name = "Grade")
public class SchoolClass extends EntityBase {

    //  FIELDS  //

    @Column(name = "year_step")
    @Enumerated(EnumType.STRING)
    private YearStep yearStep;

    @Column(name = "profile_class")
    @Enumerated(EnumType.STRING)
    private ProfileClass profileClass;

    @OneToMany(mappedBy = "student")
    private List<Student> students;

    @OneToMany(mappedBy = "class_teacher")
    private ClassTeacher classTeacher;


    //  METHODS //

    // CONSTRUCTORS //

    public SchoolClass() {
        //  EMPTY   //
    }

    public SchoolClass(YearStep yearStep, ProfileClass profileClass) {
        this.yearStep = yearStep;
        this.profileClass = profileClass;
    }

    // GETTERS & SETTERS    //

    public YearStep getYearStep() {
        return yearStep;
    }

    public void setYearStep(YearStep yearStep) {
        this.yearStep = yearStep;
    }

    public ProfileClass getProfileClass() {
        return profileClass;
    }

    public void setProfileClass(ProfileClass profileClass) {
        this.profileClass = profileClass;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public ClassTeacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(ClassTeacher classTeacher) {
        this.classTeacher = classTeacher;
    }
}
