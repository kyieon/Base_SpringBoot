package com.project.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.vo.TestVO;

@Mapper
public interface TestDAO {
	public TestVO select(int id);
	public List<TestVO> selectList();
}
