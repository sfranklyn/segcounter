/*
 * RolesDataModelBean.java
 * 
 * Created on Oct 16, 2008, 9:19:29 AM
 */
package galileoclub.ejb.datamodel;

import javax.inject.Singleton;

/**
 *
 * @author Samuel Franklyn
 */
@Singleton
public class RolesDataModelBean extends BaseDataModelBean implements RolesDataModelRemote {

    public static final String SELECT_ALL = "Roles.selectAll";
    public static final String SELECT_ALL_COUNT = "Roles.selectAllCount";
}
