package org.alfac.examples.phonebook.config.persistence;

import org.apache.log4j.Logger;

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

    @SuppressWarnings("unused")
    private static final transient Logger LOG = Logger.getLogger(EntityManagerProducer.class);

    @PersistenceUnit
    private EntityManagerFactory factory;

    @Produces
    @RequestScoped
    @ReqScopedEntityManager
    public EntityManager createReqScopedInstance() {
        return factory.createEntityManager();
    }

    public void disposeReqScopedInstance(@Disposes @ReqScopedEntityManager EntityManager instance) {
        if (instance.isOpen()) {
            instance.close();
        }
    }
}
