package com.example.controller;

import com.example.HibernateUtil;
import com.example.entity.Patient;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;

public class PatientController extends AbstractController {

    private static PatientController instance = new PatientController();

    public static PatientController getInstance() {
        return instance;
    }

    public Patient getByFirstName(String name)
    {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (Patient) em.createNamedQuery("Patient.findByFirstName").setParameter("pname", name).getResultList();
        } catch (Exception e){
            logger.error("Error! Can't complete method Patient.getAll" + e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }

    public Patient getById(Integer id)
    {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (Patient) em.createNamedQuery("Patient.findById").setParameter("pid", id).getSingleResult();
        } catch (Exception e){
            logger.error("Error! Can't complete method Patient.getAll" + e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }

    public List<Patient> getAll() {
        EntityManager em = null;
        try {
            em = HibernateUtil.getInstance().getEntityManager();
            return (List<Patient>) em.createNamedQuery("Patient.findAll").getResultList();
        } catch (Exception e){
            logger.error("Error! Can't complete method Patient.getAll" + e);
        }
        finally {
            closeEntityManager(em);
        }
        return null;
    }
}
