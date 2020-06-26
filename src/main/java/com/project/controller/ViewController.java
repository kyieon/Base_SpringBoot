package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.vo.TestVO;

@Controller
public class ViewController {

	@RequestMapping(method = RequestMethod.GET)
	public String thymeleafTest(Model model) {
		TestVO testModel = new TestVO(1, "AAA");
		model.addAttribute("testModel", testModel);
		return "TestView";
	}

}
