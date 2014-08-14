package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.EMRFirstPageActionLog;

@Repository("emrFirstPageActionLogDao")
public class EMRFirstPageActionLogDaoImpl extends
		AbstractGenericDao<EMRFirstPageActionLog, Integer> implements
		EMRFirstPageActionLogDao {

}
