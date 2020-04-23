package com.example.controller;

import com.example.HibernateUtil;
import com.example.entity.Appointment;


import javax.persistence.EntityManager;
import java.util.List;

public class AppointmentController extends AbstractController{
    private static AppointmentController instance = new AppointmentController();

    public static AppointmentController getInstance() {
        return instance;
    }

    public List<Appointment> getAll() {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (List<Appointment>) em.createNamedQuery("Appointment.findAll")
                    .getResultList();
        } catch (Exception e){
            System.out.println("Error! Can't complete method 'Appointment.getAll' "+e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }
}
