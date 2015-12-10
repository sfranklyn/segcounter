/*
 * ClaimsDaoBean.java
 * 
 * Created on Dec 16, 2008, 2:46:54 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Claims;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
@Transactional
public class ClaimsDaoBean {

    @Inject
    private EntityManager em;

    public void insert(Claims claims) {
        em.persist(claims);
        em.flush();
    }

    public void update(Claims claims) {
        em.merge(claims);
        em.flush();
    }

    public void delete(Integer claimId) {
        Claims claims = em.find(Claims.class, claimId);
        em.remove(claims);
        em.flush();
    }
}
