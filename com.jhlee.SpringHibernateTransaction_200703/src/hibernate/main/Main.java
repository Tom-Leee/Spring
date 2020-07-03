package hibernate.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import hibernate.dao.MovieDAO;
import hibernate.dao.TransactionDAO;

public class Main {

	public static void main(String[] args) {
		try {
			//Spring 설정 파일의 경로를 설정
			GenericXmlApplicationContext context
				= new GenericXmlApplicationContext("applicationContext.xml");
			
			/*
			//DataSource 가져오기 - 데이터베이스 연결 확인 작업!
			//끝나면 콘솔화면의 정리를 위해 주석처리를 해주는게 좋다.
			DataSource dataSource = context.getBean(DataSource.class);
			Connection con = dataSource.getConnection();
			System.out.println(con);
			*/
			
			/*
			//DAO 인스턴스를 가져와서 삽입하는 메소드 호출
			TransactionDAO dao = context.getBean(TransactionDAO.class);
			dao.insert();
			*/
			
			/*
			//하버네이트 설정 확인
			SessionFactory sessionFactory = context.getBean(SessionFactory.class);
			System.out.println(sessionFactory);
			*/
			
			/*
			//데이터 삽입
			MovieDAO movieDao = context.getBean(MovieDAO.class);
			movieDao.insert();
			*/
			
			/*
			//데이터 수정
			MovieDAO movieDao = context.getBean(MovieDAO.class);
			movieDao.update();
			*/
			
			/*
			//데이터 삭제
			MovieDAO movieDao = context.getBean(MovieDAO.class);
			movieDao.delete();
			*/
			
			/*
			//전체 데이터 조회
			MovieDAO movieDao = context.getBean(MovieDAO.class);
			movieDao.list();
			*/
			
			//기본키로 데이터 조회
			MovieDAO movieDao = context.getBean(MovieDAO.class);
			movieDao.getMovie();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
