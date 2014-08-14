package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.OrderActionLog;

@Repository("orderActionLogDao")
public class OrderActionLogDaoImpl extends
		AbstractGenericDao<OrderActionLog, Integer> implements
		OrderActionLogDao {

}
