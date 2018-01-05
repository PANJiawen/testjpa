package monpkg.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import monpkg.entities.Counter;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CounterManager {

    @PersistenceContext(unitName = "myMySQLBase")
    EntityManager em;

    public Counter getCounter(String name) {
        return em.find(Counter.class, name);
    }

    public void removeCounter(String name) {
        Counter c = em.find(Counter.class, name);
        if (c != null) {
            em.remove(c);
        }
    }

    public void createCounter(String name, Integer value) {
        removeCounter(name);
        Counter c = new Counter();
        c.setName(name);
        c.setValue(value);
        em.persist(c);
    }

}