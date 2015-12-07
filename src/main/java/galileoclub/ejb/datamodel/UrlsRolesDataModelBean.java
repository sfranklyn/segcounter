/*
 * UrlsRolesDataModelBean.java
 * 
 * Created on Oct 16, 2008, 4:08:08 PM
 */
package galileoclub.ejb.datamodel;

import javax.inject.Singleton;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
public class UrlsRolesDataModelBean extends BaseDataModelBean implements UrlsRolesDataModelRemote {

    public static final String SELECT_ALL = "UrlsRoles.selectAll";
    public static final String SELECT_ALL_COUNT = "UrlsRoles.selectAllCount";
}
