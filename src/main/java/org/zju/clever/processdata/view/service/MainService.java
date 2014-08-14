package org.zju.clever.processdata.view.service;

import java.util.List;

import org.zju.clever.processdata.view.entity.Action;
import org.zju.clever.processdata.view.model.ExamAction;
import org.zju.clever.processdata.view.model.PatientIndex;

public interface MainService {

	public PatientIndex getPatientIndexById(String id);

	public List<Action> getExamActions(String id);

	public List<Action> getLabTestActions(String id);

	public List<Action> getOrderActions(String id);

	public List<Action> getOperationActions(String id);

	public List<Action> getPrescActions(String id);

	public List<Action> getEMRActions(String id);

	public List<Action> getEMRFirstPageActions(String id);

}
