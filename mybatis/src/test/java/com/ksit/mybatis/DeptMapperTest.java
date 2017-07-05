package com.ksit.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ksit.entity.Account;
import com.ksit.entity.Dept;
import com.ksit.mapper.DeptMapper;
import com.ksit.utils.MyBatisUtil;

public class DeptMapperTest {
	private Logger logger = LoggerFactory.getLogger(DeptMapperTest.class);
	SqlSession sqlSession = null;
	DeptMapper deptMapper = null;
	@Before	
	public void before() {
		sqlSession = MyBatisUtil.getSqlSession();
		deptMapper = sqlSession.getMapper(DeptMapper.class);
	}
	
	@After
	public void after() {
		sqlSession.close();
	}
	@Test
	public void findByIdLoadAccount() {
		Dept dept = deptMapper.findByIdLoadAccount(1);
//		logger.debug("{}",dept.getDeptName());
		List<Account> accList = dept.getAccList();
		System.out.println(accList.size());
		for(Account acc : accList) {
			
			logger.debug("{}--->{}",acc.getUserName(),dept.getDeptName());
		}
	}
	
	
}
