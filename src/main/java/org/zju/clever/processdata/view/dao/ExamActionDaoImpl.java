package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.ExamAction;

@Repository("examActionDao")
public class ExamActionDaoImpl extends AbstractGenericDao<ExamAction,Integer> implements ExamActionDao {

}
