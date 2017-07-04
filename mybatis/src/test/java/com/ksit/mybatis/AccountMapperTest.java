package com.ksit.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ksit.entity.Account;
import com.ksit.mapper.AccountMapper;
import com.ksit.utils.MyBatisUtil;
public class AccountMapperTest {
	private Logger logger = LoggerFactory.getLogger(AccountMapperTest.class);
	
	@Test
	public void findById() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		AccountMapper accMapper = sqlSession.getMapper(AccountMapper.class);
		Account acc = accMapper.selectById(7);
		logger.debug("acc->{}",acc);
//		System.out.println(acc.toString());
		sqlSession.close();
	}
	
	
}
