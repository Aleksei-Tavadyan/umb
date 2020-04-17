package com.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private static HibernateUtil instance = new HibernateUtil();
    private static final String PERSISTENT_UNIT_NAME="medical";

    /*
     * Конструктор
     */
    public HibernateUtil() {
        try {
            emf = Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
        } catch (Throwable ex) {
            System.out.println(ex);
        }
    }

    /**
     * Возвращает экземпляр объекта
     */
    public static HibernateUtil getInstance() {
        return instance;
    }

    //Фабрика для получения экземпляра EntityManager
    private EntityManagerFactory emf;

    /*
     * Получение экземпляра EntityManager
     */
    public EntityManager getEntityManager() {
        return emf.createEntityManager();

    }
}
