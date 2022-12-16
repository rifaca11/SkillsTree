package com.koala.skillstree.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Config {
    private EntityManagerFactory emf;

    private static Config config = new Config();

    private Config(){
        this.emf = Persistence.createEntityManagerFactory("skills");
    }

    public EntityManagerFactory getEmf(){
        return emf;
    }

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static Config getConfig(){
        return config;
    }
}