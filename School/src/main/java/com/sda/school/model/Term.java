package com.sda.school.model;

import com.sda.school.model.enums.Status;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "term")
@Entity(name = "Term")
public class Term extends EntityBase {

    //  FIELDS  //

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;

    //  METHODS //

    // CONSTRUCTORS //

    public Term() {
        //  EMPTY //
    }

    public Term(Date beginDate, Date endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.status = Status.PENDING;
    }
}
