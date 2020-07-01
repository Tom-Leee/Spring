package com.jhlee.SpringDB_200701;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
/*
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//SprinBeanConfiguration 파일을 실행시켜 테스트하기 위한 코드
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"applicationContext.xml"})
*/
public class DBTest {
	
	@Test
	public void dbConnect() {
		try {
			//1. 드라이버 클래스를 로드 - 1번만 수행!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 데이터베이스 연결
			Connection con = 
				DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.200:1521:xe",
					"user20","user20");
			//3. 데이터베이스 사용
			System.out.println(con);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
