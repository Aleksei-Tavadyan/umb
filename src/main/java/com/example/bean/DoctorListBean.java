package com.example.bean;

import com.example.controller.DoctorController;
import com.example.entity.Doctor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name = "doctorListBean")
@ViewScoped

public class DoctorListBean {

    private List<Doctor> doctorList;

    @PostConstruct
    public void init() {
        doctorList = DoctorController.getInstance().getAll();
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }
}
