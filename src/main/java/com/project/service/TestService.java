package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.TestDAO;
import com.project.vo.TestVO;

@Service
public class TestService {

	@Autowired
	private TestDAO testDAO;

	public List<TestVO> getDatas() {
		return testDAO.selectList();
	}
	
	public TestVO getData(int id) {
		return testDAO.select(id);
	}
	
}
