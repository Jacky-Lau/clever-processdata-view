package org.zju.clever.processdata.view.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zju.clever.processdata.view.entity.Action;
import org.zju.clever.processdata.view.model.PatientIndex;
import org.zju.clever.processdata.view.service.MainService;

@Controller
public class MainController {

	@Resource(name = "mainService")
	private MainService mainService;

	@RequestMapping(value = "/processData/{patientId}/{dataType}/{dataIndex}")
	public ModelAndView getView(@PathVariable String patientId,
			@PathVariable String dataType, @PathVariable String dataIndex)
			throws Exception {
		String type = "";
		String indexName = "";
		String finalState = "";
		List<Action> actions = new ArrayList<Action>();
		if (dataType == "emr") {
			type = "EMR";
		} else if (dataType.equals("firstpage")) {
			type = "病案首页";
		} else if (dataType.equals("exam")) {
			type = "检查";
			indexName = "检查申请单号";
			actions = this.mainService.getExamActions(dataIndex);
		} else if (dataType.equals("labTest")) {
			type = "检验";
			indexName = "检验申请单号";
			actions = this.mainService.getLabTestActions(dataIndex);
		} else if (dataType.equals("operation")) {
			type = "手术";
		} else if (dataType.equals("order")) {
			type = "医嘱";
			indexName = "医嘱号";
			actions = this.mainService.getOrderActions(dataIndex);
		} else if (dataType.equals("presc")) {
			type = "处方";
		} else {
			throw new Exception("Data type " + dataType + " is not supported.");
		}
		finalState = actions.get(actions.size() - 1).getActionType();
		Map<String, Object> model = new HashMap<String, Object>();
		PatientIndex patientIndex = this.mainService
				.getPatientIndexById(patientId);
		model.put("patientIndex", patientIndex);
		model.put("actions", actions);
		model.put("type", type);
		model.put("dataIndex", dataIndex);
		model.put("indexName", indexName);
		model.put("finalState", finalState);
		return new ModelAndView("index", model);
	}
}
