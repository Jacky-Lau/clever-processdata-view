package org.zju.clever.processdata.view.dao;

import org.springframework.stereotype.Repository;
import org.zju.clever.processdata.view.model.PatientIndex;

@Repository("patientIndexDao")
public class PatientIndexDaoImpl extends
		AbstractGenericDao<PatientIndex, Integer> implements PatientIndexDao {

}
