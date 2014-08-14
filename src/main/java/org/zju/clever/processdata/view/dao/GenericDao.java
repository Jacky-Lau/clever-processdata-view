package org.zju.clever.processdata.view.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, ID extends Serializable> {
	public T findById(ID id);

	@SuppressWarnings("rawtypes")
	public List findByHQL(String hql, Object... params);
	
	public List<T> selectAll();

	public T findUniqueByProperty(String propertyName, Object value);
}
