package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.domain.MovieVO;

//Controller, Service, Repository, Component
//bean을 자동 생성해주는 어노테이션 - IoC(제어의 역전)
@Repository
public class MovieDAO {
	//데이터베이스 연동 프레임워크의 변수
	//@Autowired
	private SqlSession sqlSession;
	
	//전체 데이터를 가져오는 메소드
	//파라미터 없이 전체 데이터를 가져오는 SQL을 호출
	public List<MovieVO> allMovie(){
		return sqlSession.selectList("movie.allovie");
	}
	
	//code를 입력받아서 데이터 1개를 찾아오는 메소드
	public MovieVO getMovie(int code) {
		return sqlSession.selectOne("movie.getmovie", code);
	}
	
	//데이터를 삽입하는 메소드
	public int insertMovie(MovieVO movieVO) {
		return sqlSession.insert("movie.insertmovie", movieVO);
	}

	//데이터를 수정하는 메소드
	public int updateMovie(MovieVO movieVO) {
		return sqlSession.update("movie.updatemovie", movieVO);
	}

	//데이터를 삭제하는 메소드
	public int deleteMovie(int code) {
		return sqlSession.delete("movie.deletemovie", code);
	}
	
	//name의 일부분을 가지고 name이 포함된 데이터를 찾아오는 메소드
	public List<MovieVO> searchMovie(String name) {
		return sqlSession.selectList("movie.searchmovie", name);
	}
	
}
