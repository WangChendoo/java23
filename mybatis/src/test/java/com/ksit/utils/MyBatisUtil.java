package com.ksit.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	private static SqlSessionFactory sessionFactory = builderSessionFactory();

	private static SqlSessionFactory builderSessionFactory() {
		
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			return new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			throw new RuntimeException("读取mybatis配置文件异常",e);
		}
		//2.创建sqlsessionfactory
	}
	public static SqlSessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static SqlSession getSqlSession() {
		return getSessionFactory().openSession();
	}
	
	
}
