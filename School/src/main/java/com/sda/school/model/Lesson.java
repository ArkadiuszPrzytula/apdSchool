package com.sda.school.model;

import com.sda.school.model.enums.NumberOfLesson;
import com.sda.school.model.enums.PresentStatus;
import com.sda.school.model.enums.SubjectPool;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Lesson extends EntityBase {

    //  FILES   //
    @Column(name = "lesson_data", nullable = false)
    private Date lessonDate;

    @Column(name = "number_of_lesson")
    private NumberOfLesson numberOfLesson;

    @Column(name = "start_time", nullable = false)
    private String startTime;

    @Column(name = "end_time", nullable = false)
    private String endTime;

    @Column(name = "subject", nullable = false)
    private SubjectPool subject;

    @Column(name = "present_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private PresentStatus status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "term")
    private Term term;

    // METHODS  //

    // CONSTRUCTORS //

    public Lesson() {
        // EMPTY    //
    }

    public Lesson(Date lessonDate, NumberOfLesson numberOfLesson, SubjectPool subject, PresentStatus status, Student student, Term term) {
        this.lessonDate = lessonDate;
        this.numberOfLesson = numberOfLesson;
        this.subject = subject;
        this.status = status;
        this.student = student;
        this.term = term;
    }

    // METHODS //


    public Date getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public NumberOfLesson getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(NumberOfLesson numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SubjectPool getSubject() {
        return subject;
    }

    public void setSubject(SubjectPool subject) {
        this.subject = subject;
    }

    public PresentStatus getStatus() {
        return status;
    }

    public void setStatus(PresentStatus status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }
}

