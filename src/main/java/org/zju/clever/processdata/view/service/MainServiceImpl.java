package org.zju.clever.processdata.view.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zju.clever.processdata.view.dao.ActionClinicDictDao;
import org.zju.clever.processdata.view.dao.ExamActionDao;
import org.zju.clever.processdata.view.dao.PatientIndexDao;
import org.zju.clever.processdata.view.entity.Action;
import org.zju.clever.processdata.view.model.ActionClinicDict;
import org.zju.clever.processdata.view.model.ExamAction;
import org.zju.clever.processdata.view.model.PatientIndex;

@Service("mainService")
@Transactional
public class MainServiceImpl implements MainService {

	@Resource(name = "patientIndexDao")
	private PatientIndexDao patientIndexDao;
	@Resource(name = "examActionDao")
	private ExamActionDao examActionDao;
	@Resource(name = "actionClinicDictDao")
	private ActionClinicDictDao actionClinicDictDao;

	@Override
	public PatientIndex getPatientDetails(String id) {
		return this.patientIndexDao.findUniqueByProperty("patientId", id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Action> getExamActions(String id) {
		Map<String, String> model = new HashMap<String, String>();
		model.put("examReqId", id);
		List<ExamAction> exams = this.examActionDao.findByHQL(
				"from ExamAction action where action.examReqId = :examReqId",
				model);
		return exams
				.stream()
				.map(exam -> {
					Action action = new Action();
					action.setActionId(exam.getSerialNo());
					action.setActionDateTime(exam.getActionDateTime());
					action.setActionName(this.getActionDictByType("检查").get(
							Integer.valueOf(exam.getActionTypeId())));
					action.setActorName(exam.getActorName());
					return action;
				}).collect(Collectors.toList());
	}

	@Cacheable(value = "actionDictCache", key = "#type")
	private Map<Integer, String> getActionDictByType(String type) {
		Map<String, String> model = new HashMap<String, String>();
		model.put("codeType", type);
		List<ActionClinicDict> dicts = this.actionClinicDictDao.findByHQL(
				"from ActionClinicDict dict where dict.codeType = :codeType",
				model);
		return dicts.stream()
				.collect(
						Collectors.toMap(dict -> dict.getCode(),
								dict -> dict.getName()));
	}

}
