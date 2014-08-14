package org.zju.clever.processdata.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/processData/{dataType}/{dataIndex}")
	public ModelAndView getView(@PathVariable String dataType,
			@PathVariable String dataIndex) {
		System.out.println("Type: " + dataType + ", index: " + dataIndex);
		return new ModelAndView("index");
	}
}
