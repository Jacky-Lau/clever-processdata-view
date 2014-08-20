package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.PrescActionLog;

@Repository("prescActionLogDao")
public class PrescActionLogDaoImpl extends
AbstractGenericDao<PrescActionLog, Integer> implements PrescActionLogDao {

}
