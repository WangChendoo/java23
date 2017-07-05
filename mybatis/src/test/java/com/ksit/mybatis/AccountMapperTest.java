package com.ksit.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ksit.entity.Account;
import com.ksit.mapper.AccountMapper;
import com.ksit.utils.MyBatisUtil;
public class AccountMapperTest {
	private Logger logger = LoggerFactory.getLogger(AccountMapperTest.class);
	SqlSession sqlSession = null;
	AccountMapper accMapper = null;
	@Before
	public void before() {
		sqlSession = MyBatisUtil.getSqlSession();
		accMapper = sqlSession.getMapper(AccountMapper.class);
	}
	@After
	public void after() {
		sqlSession.close();
	}
	
	@Test
	public void findById() {
		Account acc = accMapper.selectById(7);
		logger.debug("acc->{}",acc);
//		System.out.println(acc.toString());
	}
	@Test
	public void findAll() {
		List<Account> accList = accMapper.findAll();
		for(Account acc: accList) {
			logger.debug("{}-*>{}",acc.getUserName(),acc.getDept().getDeptName());
		}
	}
	@Test
	public void findAllLoadDept() {
		List<Account> accList = accMapper.findAllLoadDept();
		for(Account acc: accList) {
			logger.debug("{}-*>{}",acc.getUserName(),acc.getDept().getDeptName());
		}
	}
	
}
