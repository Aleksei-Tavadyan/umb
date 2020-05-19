package com.example.bean;

import com.example.controller.AppointmentController;
import com.example.entity.Appointment;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.sql.SQLOutput;
import java.util.List;

@ManagedBean(name="appointmentBean")
@ViewScoped
public class AppointmentBean {

    private List<Appointment> appointments;

    private Integer size;

    public boolean isAppVisible() {
        return isAppVisible;
    }

    public void setAppVisible(boolean appVisible) {
        isAppVisible = appVisible;
    }

    private boolean isAppVisible = false;
    private Integer selectedAppId;
    private Appointment currentAppointment;

    public AppointmentBean() {

    }

    @PostConstruct
    public void init() {
        appointments = AppointmentController.getInstance().getAll();
        size = appointments.size();
    }


    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void selectCurrentApp()
    {
        currentAppointment = AppointmentController.getInstance().getById(selectedAppId);
        isAppVisible = true;
    }


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSelectedAppId() {
        return selectedAppId;
    }

    public void setSelectedAppId(Integer selectedAppId) {
        this.selectedAppId = selectedAppId;
    }

    public Appointment getCurrentAppointment() {
        return currentAppointment;
    }

    public void setCurrentAppointment(Appointment currentAppointment) {
        this.currentAppointment = currentAppointment;
    }
}
