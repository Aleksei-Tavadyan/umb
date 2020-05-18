package com.example.bean;

import com.example.controller.PatientController;
import com.example.entity.Patient;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name="patientBean")
@ViewScoped
public class PatientBean {

    private List<Patient> patient;

    private Integer size;

    private Integer selectedPatientId;

    public Integer getSelectedPatientId() {
        return selectedPatientId;
    }

    public void setSelectedPatientId(Integer selectedPatientId) {
        this.selectedPatientId = selectedPatientId;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    private Patient currentPatient;
    public PatientBean() {

    }

    @PostConstruct
    public void init() {
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

    public void selectCurrentPatient()
    {
        currentPatient = PatientController.getInstance().getById(selectedPatientId);
    }
}
