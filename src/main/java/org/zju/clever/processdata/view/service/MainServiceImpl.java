package org.zju.clever.processdata.view.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.zju.clever.processdata.view.dao.ExamActionDao;
import org.zju.clever.processdata.view.dao.PatientIndexDao;
import org.zju.clever.processdata.view.model.ExamAction;
import org.zju.clever.processdata.view.model.PatientIndex;

@Service("mainService")
public class MainServiceImpl implements MainService{

	@Resource(name = "patientIndexDao")
	private PatientIndexDao patientIndexDao;
	@Resource(name = "examActionDao")
	private ExamActionDao examActionDao;

	@Override
	public PatientIndex getPatientDetails(String id) {
		return this.patientIndexDao.findUniqueByProperty("patientId", id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ExamAction> getExamActions(String id) {
		Map<String, String> model = new HashMap<String, String>();
		model.put("examReqId", id);
		return this.examActionDao.findByHQL(
				"from ExamAction action where action.examReqId = :examReqId",
				model);
	}
	
}
