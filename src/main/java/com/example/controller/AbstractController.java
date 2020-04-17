package com.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.io.Serializable;


public abstract class AbstractController implements Serializable {

    protected AbstractController() {

    }

    //protected static Logger logger = LoggerFactory.getLogger(AbstractController.class);
    protected static Logger logger = LoggerFactory.getLogger(AbstractController.class);


    protected void rollbackTransaction(EntityManager em) {
        try {
            if (em != null) {
                em.getTransaction().rollback();
            }
        } catch (Exception ex) {
            logger.debug("Error when rollback transaction", ex);
        }
    }

    protected void closeEntityManager(EntityManager em) {
        try {
            if (em != null) {
                em.close();
            }
        } catch (Exception ex) {
            logger.debug("Error when close EntityManager", ex);
        }
    }

}