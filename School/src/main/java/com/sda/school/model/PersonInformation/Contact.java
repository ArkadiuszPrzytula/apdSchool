package com.sda.school.model.PersonInformation;

import com.sda.school.model.PersonInformation.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "contact")
@Entity(name = "Contact")
public class Contact {

    //  FIELDS  //

    @Column(name = "home_phone_number")
    private String homePhoneNumber;

    @Column(name = "tel_Kom")
    private String telKom;

    @Column(name = "mail")
    private String mail;


    private Person person;


    //  METHODS //

}
