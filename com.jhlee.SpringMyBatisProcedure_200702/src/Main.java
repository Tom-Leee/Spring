import java.sql.Connection;
import java.util.Date;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.dao.MovieDAO;
import mybatis.dao.MovieMapper;
import mybatis.domain.MovieVO;

public class Main {

	public static void main(String[] args) {
		try {
			
			//Spring 설정 파일의 경로를 설정
			GenericXmlApplicationContext context
				= new GenericXmlApplicationContext("applicationContext.xml");
			
			/*
			//DataSource 가져오기
			DataSource dataSource = context.getBean(DataSource.class);
			Connection con = dataSource.getConnection();
			System.out.println(con);
			
			//SqlSession 주입받아보기
			//출력되면 MyBatis 설정에는 문제가 없다.
			SqlSession sqlSession = context.getBean(SqlSession.class);
			System.out.println(sqlSession);
			//context.close();
			*/
			MovieMapper moviemapper = context.getBean(MovieMapper.class);
			System.out.println(moviemapper.allMovie());
			
			context.close();
			//MovieDAO movieDAO = context.getBean(MovieDAO.class);
			//전체 데이터 가져오기
			//System.out.println(movieDAO.allMovie());
			//MovieVO movieVO = new MovieVO();
			
			/*
			//삽입할 데이터를 생성
			
			movieVO.setCode(9);
			movieVO.setName("김종욱찾기");
			movieVO.setRegdate(new Date());
			
			System.out.println(movieDAO.insertMovie(movieVO));
			*/
			
			/*
			//데이터 수정 확인
			MovieVO movieVO = new MovieVO();
			movieVO.setCode(6);
			movieVO.setName("알라딘");
			movieVO.setRegdate(new Date());
			
			System.out.println(movieDAO.updateMovie(movieVO));
			*/ 
			
			//데이터 삭제
			//System.out.println(movieDAO.deleteMovie(5));
			
			//System.out.println(movieDAO.searchMovie("반지"));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
