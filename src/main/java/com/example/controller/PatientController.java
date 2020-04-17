package com.example.controller;

import com.example.HibernateUtil;
import com.example.entity.Patient;

import javax.persistence.EntityManager;
import java.util.List;

public class PatientController extends AbstractController {

    private static PatientController instance = new PatientController();

    public static PatientController getInstance() {
        return instance;
    }

    public List<Patient> getAll() {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (List<Patient>) em.createNamedQuery("Patient.findAll")
                    .getResultList();
        } catch (Exception e){
            System.out.println("Error! Can't complete method 'Patient.getAll' "+e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }
}
