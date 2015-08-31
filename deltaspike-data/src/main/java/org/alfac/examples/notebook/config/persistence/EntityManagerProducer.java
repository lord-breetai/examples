package org.alfac.examples.notebook.config.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * @author ivan.
 */
@ApplicationScoped
public class EntityManagerProducer {

    @PersistenceUnit
    private EntityManagerFactory factory;

    @Produces
    @RequestScopedEntityManager
    @RequestScoped
    public EntityManager createRequestEntityManager() {
        return factory.createEntityManager();
    }

    public void disposeRequestEntityManager(@Disposes @RequestScopedEntityManager EntityManager instance) {
        if (instance.isOpen()) {
            instance.close();
        }
    }
}
