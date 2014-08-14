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
import org.zju.clever.processdata.view.model.Action;
import org.zju.clever.processdata.view.model.PatientIndex;
import org.zju.clever.processdata.view.service.MainService;

@Controller
public class MainController {

	@Resource(name = "mainService")
	private MainService mainService;

	@RequestMapping(value = "/processData/{patientId}/{dataType}/{dataIndex}")
	public ModelAndView getView(@PathVariable String patientId,
			@PathVariable String dataType, @PathVariable String dataIndex) {
		System.out.println("Type: " + dataType + ", index: " + dataIndex);
		Map<String, Object> model = new HashMap<String, Object>();
		PatientIndex patientIndex = this.mainService
				.getPatientDetails(patientId);
		List<Action> actions = new ArrayList<Action>();
		actions.addAll(this.mainService.getExamActions(dataIndex));
		actions.stream().sorted((action1,action2)->Integer.compare(action1.getSerialNo(), action2.getSerialNo()));
		model.put("patientIndex", patientIndex);
		model.put("actions", actions);
		return new ModelAndView("index", model);
	}
}
