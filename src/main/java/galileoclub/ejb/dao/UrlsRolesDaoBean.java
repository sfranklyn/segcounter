/*
 * UrlsRolesDaoBean.java
 * 
 * Created on Oct 16, 2008, 3:56:23 PM
 */
package galileoclub.ejb.dao;

import javax.persistence.EntityManager;
import galileoclub.jpa.UrlsRoles;
import galileoclub.jpa.UrlsRolesPK;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
@Transactional
public class UrlsRolesDaoBean implements UrlsRolesDaoRemote {

    @Inject
    private EntityManager em;

    public void insert(UrlsRoles urlRole) {
        em.persist(urlRole);
        em.flush();
    }

    public void delete(UrlsRolesPK urlsRolesPK) {
        UrlsRoles urlsRoles = em.find(UrlsRoles.class, urlsRolesPK);
        em.remove(urlsRoles);
        em.flush();
    }
}
