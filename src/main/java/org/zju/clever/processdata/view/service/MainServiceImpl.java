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
import org.zju.clever.processdata.view.dao.LabTestActionLogDao;
import org.zju.clever.processdata.view.dao.OperationActionLogDao;
import org.zju.clever.processdata.view.dao.OrderActionLogDao;
import org.zju.clever.processdata.view.dao.PatientIndexDao;
import org.zju.clever.processdata.view.entity.Action;
import org.zju.clever.processdata.view.model.ActionClinicDict;
import org.zju.clever.processdata.view.model.ExamAction;
import org.zju.clever.processdata.view.model.LabTestActionLog;
import org.zju.clever.processdata.view.model.OrderActionLog;
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
	@Resource(name = "labTestActionLogDao")
	private LabTestActionLogDao labTestActionLogDao;
	@Resource(name = "operationActionLogDao")
	private OperationActionLogDao operationActionLogDao;
	@Resource(name="orderActionLogDao")
	private OrderActionLogDao orderActionLogDao;

	@Override
	public PatientIndex getPatientIndexById(String id) {
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
					action.setActionType(this.getActionDictByType("检查").get(
							Integer.valueOf(exam.getActionTypeId())));
					action.setActorName(exam.getActorName());
					return action;
				})
				.sorted((action1, action2) -> Integer.compare(
						action1.getActionId(), action2.getActionId()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Action> getLabTestActions(String id) {
		Map<String, String> model = new HashMap<String, String>();
		model.put("testReqId", id);
		List<LabTestActionLog> logs = this.labTestActionLogDao.findByHQL(
				"from LabTestActionLog log where log.testReqId = :testReqId",
				model);
		return logs
				.stream()
				.map(log -> {
					Action action = new Action();
					action.setActionId(log.getSerialNo());
					action.setActionDateTime(log.getActionDateTime());
					action.setActionType(this.getActionDictByType("检验").get(
							Integer.valueOf(log.getActionTypeId())));
					action.setActorName(log.getActorName());
					return action;
				})
				.sorted((action1, action2) -> Integer.compare(
						action1.getActionId(), action2.getActionId()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Action> getOrderActions(String id) {
		Map<String, Integer> model = new HashMap<String, Integer>();
		model.put("orderId", Integer.valueOf(id));
		List<OrderActionLog> logs = this.orderActionLogDao.findByHQL(
				"from OrderActionLog log where log.orderId = :orderId",
				model);
		return logs
				.stream()
				.map(log -> {
					Action action = new Action();
					action.setActionId(log.getActionId());
					action.setActionDateTime(log.getActionDateTime());
					action.setActionType(log.getActionType());
					action.setActorName(log.getActorName());
					return action;
				})
				.sorted((action1, action2) -> Integer.compare(
						action1.getActionId(), action2.getActionId()))
				.collect(Collectors.toList());
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
