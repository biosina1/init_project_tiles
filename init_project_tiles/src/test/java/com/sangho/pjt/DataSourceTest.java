package com.sangho.pjt;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// RunWith, ContextConfiguration
// 테스트 코드 실행시, 스프링이 로딩되도록 설정
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DataSourceTest {

	@Autowired
	private DataSource ds;

	@Test
	public void testConnection() throws Exception {
		try {
			Connection con = ds.getConnection();
			System.out.println("dataSource Connection con :: " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
