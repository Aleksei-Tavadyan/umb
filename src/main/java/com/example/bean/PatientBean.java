package com.example.bean;

import com.example.controller.PatientController;
import com.example.entity.Patient;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class PatientBean {

    public static final String BEAN_NAME = "patientBean";

    private List<Patient> patient;

    private Integer size;

    public PatientBean(){

    }

    @PostConstruct
    public void init(){
        patient = PatientController.getInstance().getAll();
        size = patient.size();
    }


    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
