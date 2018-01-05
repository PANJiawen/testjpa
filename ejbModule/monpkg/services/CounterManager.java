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
//@TransactionManagement(TransactionManagementType.BEAN)
public class CounterManager {

    @PersistenceContext(unitName = "myMySQLBase")
    EntityManager em;
    @EJB
    CounterRemover cr;

    public Counter getCounter(String name) {
        return em.find(Counter.class, name);
    }

    public void removeCounter(String name) {
        Counter c = em.find(Counter.class, name);
        if (c != null) {
            em.remove(c);
        }
    }

    public void createCounter(String name, Integer value) throws BadCounter {
        removeCounter(name);
        Counter c = new Counter();
        c.setName(name);
        c.setValue(value);
        em.persist(c);
        if (value < 0) {
            throw new BadCounter("pas moins de z�ro");
        }
        
    }
    public void createCounter2(String name, Integer value) throws BadCounter {
        cr.removeCounter(name);
        Counter c = new Counter();
        c.setName(name);
        c.setValue(value);
        em.persist(c);
        if (value < 0) {
            throw new BadCounter("pas moins de z�ro");
        }
    }

}