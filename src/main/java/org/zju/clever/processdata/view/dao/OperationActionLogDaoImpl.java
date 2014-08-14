package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.OperationActionLog;

@Repository("operationActionLogDao")
public class OperationActionLogDaoImpl extends
		AbstractGenericDao<OperationActionLog, Integer> implements
		OperationActionLogDao {

}
