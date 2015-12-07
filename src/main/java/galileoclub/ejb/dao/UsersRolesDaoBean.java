/*
 * UsersRolesDaoBean.java
 * 
 * Created on Oct 16, 2008, 4:32:16 PM
 */
package galileoclub.ejb.dao;

import javax.persistence.EntityManager;
import galileoclub.jpa.UsersRoles;
import galileoclub.jpa.UsersRolesPK;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
public class UsersRolesDaoBean implements UsersRolesDaoRemote {

    @Inject
    private EntityManager em;

    @Override
    public void insert(UsersRoles userRole) {
        em.persist(userRole);
        em.flush();
    }

    @Override
    public void delete(UsersRolesPK usersRolesPK) {
        UsersRoles usersRoles = em.find(UsersRoles.class, usersRolesPK);
        em.remove(usersRoles);
        em.flush();
    }
}
