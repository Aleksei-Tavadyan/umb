package com.example.bean;

import com.example.controller.PatientController;
import com.example.entity.Patient;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name = "patientListBean")
@ViewScoped

public class PatientListBean {

    private List<Patient> patientList;

    @PostConstruct
    public void init() {
        patientList = PatientController.getInstance().getAll();
    }

    public List<Patient> getPatientList() {
        return patientList;
    }
}
