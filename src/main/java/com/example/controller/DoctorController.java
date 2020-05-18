package com.example.controller;

import com.example.HibernateUtil;
import com.example.entity.Doctor;

import javax.persistence.EntityManager;
import java.util.List;

public class DoctorController extends AbstractController{
    private static DoctorController instance = new DoctorController();

    public static DoctorController getInstance() {
        return instance;
    }

    public Doctor getById(Integer id)
    {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (Doctor) em.createNamedQuery("Doctor.findById").setParameter("did", id).getSingleResult();
        } catch (Exception e){
            logger.error("Error! Can't complete method Patient.getAll" + e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }

    public List<Doctor> getAll() {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (List<Doctor>) em.createNamedQuery("Doctor.findAll")
                    .getResultList();
        } catch (Exception e){
            System.out.println("Error! Can't complete method 'Doctor.getAll' "+e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }
}
