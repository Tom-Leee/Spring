import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.dao.MovieDAO;

public class Main {

	public static void main(String[] args) /* throws Exception */ {
		try {
			//Spring 설정 파일 실행
			GenericXmlApplicationContext context
				= new GenericXmlApplicationContext("applicationContext.xml");
			//DAO DataSource 가져오기
			MovieDAO moviedao = context.getBean(MovieDAO.class);
			System.out.println(moviedao);
			context.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
