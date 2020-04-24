package com.example.medical;

import com.example.controller.PatientController;
import com.example.entity.Patient;

import java.util.List;

public class Application {

    public static void main(String[] args) {

//        PatientController patientController = PatientController.getInstance();
        List<Patient> patientList = PatientController.getInstance().getAll();
        for (Patient patient : patientList) {
            System.out.println(patient.getpFullName());
        }
    }

}