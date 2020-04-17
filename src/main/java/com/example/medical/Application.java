package com.example.medical;

import com.example.controller.PatientController;
import com.example.entity.Patient;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        PatientController patientController = PatientController.getInstance();
        List<Patient> patientList = patientController.getAll();
        for (int i=0; i<patientList.size();i++)
        {
            System.out.println(patientList.get(i).getpFullName());
        }
    }

}