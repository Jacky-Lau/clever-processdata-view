package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.ActionClinicDict;

@Repository("actionClinicDictDao")
public class ActionClinicDictDaoImpl extends
		AbstractGenericDao<ActionClinicDict, Integer> implements
		ActionClinicDictDao {

}
