package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "patient")
@NamedQueries({
            @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
            @NamedQuery(name = "Patient.findByFirstName", query = "SELECT p FROM Patient p WHERE p.pFirstName = :pname"),
            @NamedQuery(name = "Patient.findById", query = "SELECT p FROM Patient p WHERE p.pUnid = :pid")
        })

public class Patient implements Serializable {
    @Id
    @Column(name = "p_unid")
    private Integer pUnid;

    @Column(name = "p_passportunid")
    private Integer passportUnid;

    @Column(name = "p_firstname")
    private String pFirstName;

    @Column(name = "p_secondname")
    private String pSecondName;

    @Column(name = "p_thirdname")
    private String pThirdName;

    @Column(name = "p_fullname")
    private String pFullName;

    @Column(name = "p_dmsnumber")
    private String pDmsNumber;

    @Column(name = "p_birthday")
    private Date pBirthDay;

    public Integer getpUnid() {
        return pUnid;
    }

    public void setpUnid(Integer pUnid) {
        this.pUnid = pUnid;
    }

    public Integer getPassportUnid() {
        return passportUnid;
    }

    public void setPassportUnid(Integer passportUnid) {
        this.passportUnid = passportUnid;
    }

    public String getpFirstName() {
        return pFirstName;
    }

    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    public String getpSecondName() {
        return pSecondName;
    }

    public void setpSecondName(String pSecondName) {
        this.pSecondName = pSecondName;
    }

    public String getpThirdName() {
        return pThirdName;
    }

    public void setpThirdName(String pThirdName) {
        this.pThirdName = pThirdName;
    }

    public String getpFullName() {
        return pFullName;
    }

    public void setpFullName(String pFullName) {
        this.pFullName = pFullName;
    }

    public String getpDmsNumber() {
        return pDmsNumber;
    }

    public void setpDmsNumber(String pDmsNumber) {
        this.pDmsNumber = pDmsNumber;
    }

    public Date getpBirthDay() {
        return pBirthDay;
    }

    public void setpBirthDay(Date pBirthDay) {
        this.pBirthDay = pBirthDay;
    }

    public Patient() {

    }
}
