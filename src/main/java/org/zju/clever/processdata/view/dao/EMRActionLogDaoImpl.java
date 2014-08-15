package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.EMRActionLog;

@Repository("emrActionLogDao")
public class EMRActionLogDaoImpl extends
		AbstractGenericDao<EMRActionLog, Integer> implements EMRActionLogDao {

}
