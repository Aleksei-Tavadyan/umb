package com.example.bean;

import com.example.controller.AppointmentController;
import com.example.entity.Appointment;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name="appoitmentBean")
@ViewScoped
public class AppointmentBean {

    private List<Appointment> appointments;

    private Integer size;

    public AppointmentBean() {

    }

    @PostConstruct
    public void init() {
        appointments = AppointmentController.getInstance().getAll();
        size = appointments.size();
    }


    public List<Appointment> getAppointment() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
