package com.example.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@ManagedBean
public class MenuView {

    public boolean isSearchAppShow() {
        return searchAppShow;
    }

    public boolean isSearchPatShow() {
        return searchPatShow;
    }

    public void setSearchPatShow(boolean searchPatShow) {
        this.searchPatShow = searchPatShow;
    }

    private boolean searchPatShow;

    public void setSearchAppShow(boolean searchAppShow) {
        this.searchAppShow = searchAppShow;
    }

    private boolean searchAppShow = false;

    public boolean isPatientsShow() {
        return patientsShow;
    }

    public void setPatientsShow(boolean patientsShow) {
        this.patientsShow = patientsShow;
    }

    private boolean patientsShow = false;

    public boolean isAppointmentsShow() {
        return appointmentsShow;
    }

    public void setAppointmentsShow(boolean appointmentsShow) {
        this.appointmentsShow = appointmentsShow;
    }

    private boolean appointmentsShow = false;

    public boolean isDoctorsShow() {
        return doctorsShow;
    }

    public void setDoctorsShow(boolean doctorsShow) {
        this.doctorsShow = doctorsShow;
    }

    private boolean doctorsShow = false;

    private MenuModel model;

    //private ArrayList<Boolean> list;
    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();

        //list.add(searchAppShow)
        //Submenus PATIENTS APPOINTMENTS & COLLEGIES
        DefaultSubMenu patients = new DefaultSubMenu("Пациенты");
        DefaultSubMenu appointments = new DefaultSubMenu("Посещения");
        DefaultSubMenu doctors = new DefaultSubMenu("Коллеги");
        //2 MENU ITEMS
        DefaultMenuItem patientsList = new DefaultMenuItem("Список пациентов");
        //patientsList.
        DefaultMenuItem findPatById = new DefaultMenuItem("Найти пациента по ID");
        //ADDING PATIENTS MENU ITEMS TO SUBMENU PATIENTS
        patients.getElements().add(patientsList);
        patients.getElements().add(findPatById);
        //SUBMENU APPOINTMNETS
        DefaultMenuItem appointmentsList = new DefaultMenuItem("Список посещений");
        DefaultMenuItem findAppbyId = new DefaultMenuItem("Найти посещение по ID");
        DefaultMenuItem addApp = new DefaultMenuItem("Добавить посещение");
        //ADDING APPOINTMENTS MENU ITEMS TO SUBMENU APPOINTMNETS
        appointments.getElements().add(appointmentsList);
        appointments.getElements().add(findAppbyId);
        appointments.getElements().add(addApp);
        //

    }

    public MenuModel getModel() {
        return model;
    }

    public void setBooleans(boolean booleanToSetTrue)
    {

    }
    public void save() {
        addMessage("Success", "Data saved");

    }

    public void update() {
        addMessage("Success", "Data updated");
    }

    public void delete() {
        addMessage("Success", "Data deleted");
    }

    public void showPatientList()
    {

        patientsShow = true;
        appointmentsShow = false;
        doctorsShow = false;

    }
    public void showSearchApp()
    {
        searchAppShow = true;
    }
    public void showSearchPat()
    {
        searchPatShow = true;
    }
    public void showAppointmentsList()
    {

        appointmentsShow = true;
        doctorsShow = false;
        patientsShow = false;
    }
    public void showDoctorsList()
    {

        doctorsShow = true;
        appointmentsShow = false;
        patientsShow = false;
    }
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}