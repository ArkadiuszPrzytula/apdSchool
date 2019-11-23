package com.sda.school.model.PersonInformation;


import com.sda.school.model.EntityBase;

import javax.persistence.*;


@Entity(name = "Address")
@Table(name = "address")
public class Address extends EntityBase {

    //  FIELDS  //

    private String city;
    private String street;
    private String localNumber;


    //  METHODS //

}

