package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.LabTestActionLog;

@Repository("labTestActionLogDao")
public class LabTestActionLogDaoImpl extends
		AbstractGenericDao<LabTestActionLog, Integer> implements
		LabTestActionLogDao {

}
