package com.ksit.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ksit.entity.Account;
import com.ksit.utils.MyBatisUtil;

public class MyBatisTest {
	private Logger logger = LoggerFactory.getLogger(MyBatisTest.class);
	
	@Test
	public void first() {
		 //1.加载配置文件
		Reader reader;
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		//4.操作数据库
//			Account acc = sqlSession.selectOne("com.ksit.mapper.AccountMapper.selectById", 2);
//			System.out.println(acc);
		
		
//			Account acc = new Account();
//			acc.setUserName("james");
//			acc.setAddress("北京");
//			acc.setPassword("888999");
//			sqlSession.insert("com.ksit.mapper.AccountMapper.save",acc);
		
//			sqlSession.delete("com.ksit.mapper.AccountMapper.deleteById",2);
		
		
//			Account acc = sqlSession.selectOne("com.ksit.mapper.AccountMapper.selectById", 7);
//			acc.setPassword("123456");
//			acc.setUserName("paul");
//			sqlSession.update("com.ksit.mapper.AccountMapper.modify",acc);
		
		List<Account> accountList = sqlSession.selectList("com.ksit.mapper.AccountMapper.findAll");
		for(Account acc : accountList) {
//				System.out.println(acc.getUserName()+"-->"+acc.getAddress());
			logger.debug("{}->{}->{}",acc.getUserName(),acc.getAddress(),acc.getPassword());
		}
//			sqlSession.commit();
		//5.关闭sqlSession
		sqlSession.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
	
}
