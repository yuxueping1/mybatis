package com.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yxp.bean.Tuser1;
import com.yxp.mapper.UserMapper;

public class MyBatisTest {
	private SqlSessionFactory sf;
	private SqlSession session;
	private UserMapper userMapper;
	
//	这里的@before表示在执行测试用例之前会执行该方法，
//	before方法的作用是用来解析mybatis的总配置文件,获取userMapper;
	@Before
	public void before() {
		try {
			Reader re=Resources.getResourceAsReader("mybatis.xml");
			sf=new SqlSessionFactoryBuilder().build(re);
			session=sf.openSession();
			userMapper=session.getMapper(UserMapper.class);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void Test1() {
		Tuser1 user=new Tuser1();
		user.setTname("admin");
		userMapper.save(user);
	}
	
	@After
	public void after() {
		session.commit();
		session.close();
	}
}
