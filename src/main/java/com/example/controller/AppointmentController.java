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

    public Appointment getById(Integer id)
    {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (Appointment) em.createNamedQuery("Appointment.findById").setParameter("aid", id).getSingleResult();
        } catch (Exception e){
            logger.error("Error! Can't complete method Patient.getAll" + e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
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
