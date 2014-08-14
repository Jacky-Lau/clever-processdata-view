package org.zju.clever.processdata.view.service;

import java.util.List;

import org.zju.clever.processdata.view.entity.Action;
import org.zju.clever.processdata.view.model.ExamAction;
import org.zju.clever.processdata.view.model.PatientIndex;

public interface MainService {

	public PatientIndex getPatientDetails(String id);

	public List<Action> getExamActions(String id);

}
