package com.example.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name = "appointment")
public class Appointment implements Serializable{

    @Id
    @Column(name = "app_unid")
    private Integer appUnid;

    @Column(name = "app_docunid")
    private Integer appDocUnid;

    @Column(name = "app_patunid")
    private Integer appPatUnid;

    @Column(name = "app_appointmentunid")
    private boolean appType;

    @Column(name = "app_name")
    private String appName;

    @Column(name = "app_date")
    private Date appDate;

    @Column(name = "app_dateexpire")
    private Timestamp appDateExp;

    @Column(name = "app_diagnosis")
    private String appDiagnosis;

    @Column(name = "app_result")
    private Integer appResultId;

    @Column(name = "app_nodes")
    private String appNotes;

    @Column(name = "app_additionalfilepath")
    private String appFilePath;


    public Integer getAppUnid() {
        return appUnid;
    }

    public void setAppUnid(Integer appUnid) {
        this.appUnid = appUnid;
    }

    public Integer getAppDocUnid() {
        return appDocUnid;
    }

    public void setAppDocUnid(Integer appDocUnid) {
        this.appDocUnid = appDocUnid;
    }

    public Integer getAppPatUnid() {
        return appPatUnid;
    }

    public void setAppPatUnid(Integer appPatUnid) {
        this.appPatUnid = appPatUnid;
    }

    public boolean isAppType() {
        return appType;
    }

    public void setAppType(boolean appType) {
        this.appType = appType;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public Timestamp getAppDateExp() {
        return appDateExp;
    }

    public void setAppDateExp(Timestamp appDateExp) {
        this.appDateExp = appDateExp;
    }

    public String getAppDiagnosis() {
        return appDiagnosis;
    }

    public void setAppDiagnosis(String appDiagnosis) {
        this.appDiagnosis = appDiagnosis;
    }

    public Integer getAppResultId() {
        return appResultId;
    }

    public void setAppResultId(Integer appResultId) {
        this.appResultId = appResultId;
    }

    public String getAppNotes() {
        return appNotes;
    }

    public void setAppNotes(String appNotes) {
        this.appNotes = appNotes;
    }

    public String getAppFilePath() {
        return appFilePath;
    }

    public void setAppFilePath(String appFilePath) {
        this.appFilePath = appFilePath;
    }

    Appointment()
    {

    }
}