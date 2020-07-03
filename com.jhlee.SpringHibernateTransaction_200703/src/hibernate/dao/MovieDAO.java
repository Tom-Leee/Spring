package hibernate.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernate.domain.Movie;

@Repository
public class MovieDAO {
	@Autowired
	//하이버네이트 사용 객체
	private SessionFactory sessionFactory;
	
	//데이터 삽입
	@Transactional
	public void insert() {
		Movie movie = new Movie();
		movie.setCode(1);
		movie.setName("용가리");
		movie.setRegdate(new Date());
		
		//데이터 삽입
		sessionFactory.getCurrentSession().save(movie);
	}
	
	//데이터 수정
	//기본키를 조건으로 해서 나머지 항목을 수정
	//없는 기본키를 대입하면 아무일도 하지 않는다.
	@Transactional
	public void update() {
		Movie movie = new Movie();
		movie.setCode(1);
		movie.setName("아저씨");
		movie.setRegdate(new Date());
			
		//데이터 삽입
		sessionFactory.getCurrentSession().update(movie);
		}
	
	//데이터 삭제
	//기본키 항목외에는 아무것도 필요 없다.
	//기본키를 조건으로 해서 삭제
	@Transactional
	public void delete() {
		Movie movie = new Movie();
		movie.setCode(1);
			
		//데이터 삽입
		sessionFactory.getCurrentSession().delete(movie);
		}	
	
	//전체 데이터 가져오기
	@Transactional
	public void list() {
		List<Movie> list = (List<Movie>)sessionFactory
				.getCurrentSession().createCriteria(Movie.class).list();
		
		/*
		//SQL 사용
		List<Movie> list = sessionFactory.getCurrentSession()
				.createSQLQuery("select * from movie").addEntity(Movie.class).list()
		*/
		
		//데이터 출력
		for(Movie movie : list) {
			System.out.println(movie);
		}
	}
	
	//기본키를 가지고 데이터 1개 가져오기
	@Transactional
	public void getMovie() {
		//Criteria 사용
		Movie movie = sessionFactory.getCurrentSession().get(Movie.class, 1);
		
		System.out.println(movie);
	}	
	
	
}
