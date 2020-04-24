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
@Table(name = "doctor")
@NamedQueries({
        @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d")})

public class Doctor implements Serializable{

    @Id
    @Column(name = "doc_unid")
    private Integer docUnid;

    @Column(name = "doc_passportunid")
    private Integer passportUnid;

    @Column(name = "doc_fullname")
    private String docFullname;

    @Column(name = "doc_specializationunid")
    private Integer docSpecId;

    public Integer getdUnid() {
        return docUnid;
    }

    public void setdUnid(Integer docUnid) {
        this.docUnid = docUnid;
    }

    public Integer getPassportUnid() {
        return passportUnid;
    }

    public void setPassportUnid(Integer passportUnid) {
        this.passportUnid = passportUnid;
    }

    public String getdFullName() {
        return docFullname;
    }

    public void setdFullName(String docFullname) {  this.docFullname = docFullname;   }

    public Integer getdSpecId() { return docSpecId;}

    public Doctor() {

    }
}