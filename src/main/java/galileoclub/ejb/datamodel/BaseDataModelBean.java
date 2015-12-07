/*
 * BaseDataModelBean.java
 * 
 * Created on Oct 16, 2008, 9:09:11 AM
 */
package galileoclub.ejb.datamodel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

/**
 *
 * @author Samuel Franklyn
 */
@Transactional
public class BaseDataModelBean implements DataModelDao {

    @Inject
    private EntityManager em;

    @Override
    public List getAll(String id, Map<String, Object> param, int first, int max) {
        Query query = em.createNamedQuery(id);
        query.setFirstResult(first);
        if (max > 0) {
            query.setMaxResults(max);
        }
        if ((param != null) && (param.size() > 0)) {
            for (String key : param.keySet()) {
                query.setParameter(key, param.get(key));
            }
        }
        return query.getResultList();
    }

    @Override
    public Long getAllCount(String id, Map<String, Object> param) {
        Query query = em.createNamedQuery(id);
        if ((param != null) && (param.size() > 0)) {
            for (String key : param.keySet()) {
                query.setParameter(key, param.get(key));
            }
        }
        Long count = (long) 0;
        try {
            Object obj = query.getSingleResult();
            if (obj != null) {
                if (obj.getClass().getSimpleName().equals("Long")) {
                    count = (Long) obj;
                    return count;
                }
                if (obj.getClass().getSimpleName().equals("BigDecimal")) {
                    BigDecimal bd = (BigDecimal) obj;
                    count = bd.longValue();
                    return count;
                }
                if (obj instanceof Object[]) {
                    Object[] objArray = (Object[]) obj;
                    if (objArray.length >= 1) {
                        if (objArray[0] != null) {
                            Object objValue = objArray[0];
                            if (objValue.getClass().getSimpleName().equals("Long")) {
                                count = (Long) objValue;
                                return count;
                            }
                            if (objValue.getClass().getSimpleName().equals("BigDecimal")) {
                                BigDecimal bd = (BigDecimal) objValue;
                                count = bd.longValue();
                                return count;
                            }
                        }
                    }
                }
            }
        } catch (NoResultException ex) {
        }
        return count;
    }
}
