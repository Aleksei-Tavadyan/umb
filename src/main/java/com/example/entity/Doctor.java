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
        @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
        @NamedQuery(name = "Doctor.findById", query = "SELECT d FROM Doctor d WHERE d.docUnid= :did")
})

public class Doctor implements Serializable {

    @Id
    @Column(name = "doc_unid")
    private Integer docUnid;

    public Integer getDocUnid() {
        return docUnid;
    }

    public void setDocUnid(Integer docUnid) {
        this.docUnid = docUnid;
    }

    public Integer getPassportUnid() {
        return passportUnid;
    }

    public void setPassportUnid(Integer passportUnid) {
        this.passportUnid = passportUnid;
    }

    @Column(name = "doc_passportunid")
    private Integer passportUnid;

    public String getDocFullname() {
        return docFullname;
    }

    public void setDocFullname(String docFullname) {
        this.docFullname = docFullname;
    }

    @Column(name = "doc_fullname")
    private String docFullname;

    public Integer getDocSpecId() {
        return docSpecId;
    }

    public void setDocSpecId(Integer docSpecId) {
        this.docSpecId = docSpecId;
    }

    @Column(name = "doc_specializationunid")
    private Integer docSpecId;

    public Doctor() {

    }
}