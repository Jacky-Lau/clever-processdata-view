package org.zju.clever.processdata.view.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zju.clever.processdata.view.entity.Action;
import org.zju.clever.processdata.view.model.PatientIndex;
import org.zju.clever.processdata.view.service.MainService;

@Controller
public class MainController {
	public final static Logger logger = Logger.getLogger(MainController.class);

	@Resource(name = "mainService")
	private MainService mainService;

	@RequestMapping(value = "/processData/{patientId}/{dataType}/{dataIndex}")
	public ModelAndView getView(@PathVariable String patientId,
			@PathVariable String dataType, @PathVariable String dataIndex) {
		Map<String, Object> model = new HashMap<String, Object>();
		try {
			logger.debug("user mainService");
			String type = "";
			String indexName = "";
			String finalState = "";
			List<Action> actions = new ArrayList<Action>();
			if (dataType.equals("emr")) {
				logger.debug("emr");
				type = "EMR";
				indexName = "病历文档号";
				actions = this.mainService.getEMRActions(dataIndex);

			} else if (dataType.equals("firstpage")) {
				logger.debug("firstpage");
				type = "病案首页";
				indexName = "病案首页号";
				actions = this.mainService.getEMRFirstPageActions(dataIndex);
			} else if (dataType.equals("exam")) {
				logger.debug("exam");
				type = "检查";
				indexName = "检查申请单号";
				actions = this.mainService.getExamActions(dataIndex);
			} else if (dataType.equals("labTest")) {
				logger.debug("labTest");
				type = "检验";
				indexName = "检验申请单号";
				actions = this.mainService.getLabTestActions(dataIndex);
			} else if (dataType.equals("operation")) {
				logger.debug("operation");
				type = "手术";
				indexName = "手术申请号";
				actions = this.mainService.getOperationActions(dataIndex);
			} else if (dataType.equals("order")) {
				logger.debug("order");
				type = "医嘱";
				indexName = "医嘱号";
				actions = this.mainService.getOrderActions(dataIndex);
			} else if (dataType.equals("presc")) {
				logger.debug("presc");
				type = "处方";
				indexName = "处方号";
				actions = this.mainService.getPrescActions(dataIndex);
			} else {
				throw new Exception("Data type " + dataType
						+ " is not supported.");
			}
			logger.debug("dataType:" + dataType);
			finalState = actions.get(actions.size() - 1).getActionType();

			PatientIndex patientIndex = this.mainService
					.getPatientIndexById(patientId);
			model.put("patientIndex", patientIndex);
			model.put("actions", actions);
			model.put("type", type);
			model.put("dataIndex", dataIndex);
			model.put("indexName", indexName);
			model.put("finalState", finalState);
		} catch (Exception ex) {
			logger.error("MainController Error:"+ex.getStackTrace().toString());
		}
		return new ModelAndView("index", model);
	}
}
