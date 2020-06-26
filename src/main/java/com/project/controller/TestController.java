package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.TestService;
import com.project.vo.TestVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<TestVO> getDatas() {
		log.info(">> Input Request");
		return testService.getDatas();
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public TestVO getData(@PathVariable("id") int id) {
		log.info(">> Input Request >> param :: " + id);
		return testService.getData(id);
	}
}
