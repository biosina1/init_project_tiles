package com.sangho.pjt;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//RunWith, ContextConfiguration
//테스트 코드 실행시, 스프링이 로딩되도록 설정
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MyBatisTest {
	@Autowired
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() {
		System.out.println("sqlFactory :: " + sqlFactory);
	}

	@Test
	public void testSession() {
		try {
			// sqlFactory에는 스프링이 정상적으로 동작할 경우, SqlSessionFactory를 주입시켜줄 것을 요구한다.
			// SqlSessionFactroy에 문제가 있다면, sqlFactory에 오류가 발생한다.
			SqlSession session = sqlFactory.openSession();
			System.out.println("session :: " + session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
