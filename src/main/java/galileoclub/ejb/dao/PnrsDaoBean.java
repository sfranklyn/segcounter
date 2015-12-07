/*
 * PnrsDaoBean.java
 * 
 * Created on Nov 27, 2008, 4:43:12 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Pnrs;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
@Transactional
public class PnrsDaoBean {

    @Inject
    private EntityManager em;

    public void updateNotActive() {
        Query query = em.createNamedQuery("Pnrs.updateNotActive");
        query.executeUpdate();
        em.flush();
    }

    public void insert(Pnrs pnrs) {
        em.persist(pnrs);
        em.flush();
    }

    public void delete(Integer pnrsId) {
        Pnrs pnrs = em.find(Pnrs.class, pnrsId);
        em.remove(pnrs);
        em.flush();
    }

    public void update(Pnrs pnrs) {
        em.merge(pnrs);
        em.flush();
    }

    public void deleteNotActive() {
        Query query = em.createNamedQuery("Pnrs.deleteNotActive");
        query.executeUpdate();
        em.flush();
    }
}
