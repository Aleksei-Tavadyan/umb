package com.example.bean;

import com.example.controller.AppointmentController;
import com.example.entity.Appointment;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name = "appointmentListBean")
@ViewScoped

public class AppointmentListBean {

    private List<Appointment> appointmentList;

    @PostConstruct
    public void init() {
        appointmentList = AppointmentController.getInstance().getAll();
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }
}
