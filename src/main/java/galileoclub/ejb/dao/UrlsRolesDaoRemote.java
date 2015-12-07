/*
 * UrlsRolesDaoRemote.java
 * 
 * Created on Oct 16, 2008, 3:56:23 PM
 */
package galileoclub.ejb.dao;


import galileoclub.jpa.UrlsRoles;
import galileoclub.jpa.UrlsRolesPK;

/**
 *
 * @author Samuel Franklyn
 */
public interface UrlsRolesDaoRemote {

    void insert(UrlsRoles urlRole);

    void delete(UrlsRolesPK urlsRolesPK);
}
