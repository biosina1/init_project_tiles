package com.sangho.pjt;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//RunWith, ContextConfiguration
//�׽�Ʈ �ڵ� �����, �������� �ε��ǵ��� ����
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
			// sqlFactory���� �������� ���������� ������ ���, SqlSessionFactory�� ���Խ����� ���� �䱸�Ѵ�.
			// SqlSessionFactroy�� ������ �ִٸ�, sqlFactory�� ������ �߻��Ѵ�.
			SqlSession session = sqlFactory.openSession();
			System.out.println("session :: " + session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
