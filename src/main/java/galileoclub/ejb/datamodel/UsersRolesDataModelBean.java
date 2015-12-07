/*
 * UsersRolesDataModelBean.java
 * 
 * Created on Oct 16, 2008, 4:52:48 PM
 */
package galileoclub.ejb.datamodel;

import javax.inject.Singleton;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
public class UsersRolesDataModelBean extends BaseDataModelBean implements UsersRolesDataModelRemote {

    public static final String SELECT_ALL = "UsersRoles.selectAll";
    public static final String SELECT_ALL_COUNT = "UsersRoles.selectAllCount";
}
