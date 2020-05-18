package com.example.bean;

import com.example.controller.DoctorController;
import com.example.entity.Doctor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name="doctorBean")
@ViewScoped
public class DoctorBean {

    private List<Doctor> doctors;

    private Integer size;

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    private Integer selectedDocId;

    public Doctor getCurrentDoctor() {
        return currentDoctor;
    }

    public void getSelectedDoctor()
    {
        currentDoctor = DoctorController.getInstance().getAll().get(selectedDocId);
    }
    public void setCurrentDoctor(Doctor currentDoctor) {
        this.currentDoctor = currentDoctor;
    }

    private Doctor currentDoctor;

    public DoctorBean() {

    }

    @PostConstruct
    public void init() {
        doctors = DoctorController.getInstance().getAll();
        size = doctors.size();
    }

    public void selectCurrentDoc()
    {
        currentDoctor = DoctorController.getInstance().getAll().get(selectedDocId);
    }


    public List<Doctor> getDoctor() {
        return doctors;
    }

    public void setDoctor(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
