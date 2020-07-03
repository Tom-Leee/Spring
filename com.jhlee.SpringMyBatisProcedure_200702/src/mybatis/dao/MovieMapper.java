package mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import mybatis.domain.MovieVO;

//MyBatis Mapper로 사용할 인터페이스
public interface MovieMapper {
	
	//전체 데이터를 가져오는 메소드
	@Select("select code, name, regdate from movies")
	public List<MovieVO> allMovie();
		
	//code를 가지고 하나의 데이터를 찾아오는 메소드
	@Select("select code, name, regdate from movies where code=#{code}")
	public MovieVO getMovie(int code);
	
	//데이터를 삽입하는 메소드
	@Insert("insert into movies(code, name, regdate) "
			+ "values(#{code}, #{name}, #{regdate})")
	public int insertMovie(MovieVO movieVO);
	/*
	//데이터를 수정하는 메소드
	@Update("update movies "
			+ "set name = #{name}, regdate = #{regdate} "
			+ "where code = #{code}")
	public int updateMovie(MovieVO movieVO);
	
	//데이터를 삭제하는 메소드
	@Delete("delete from movies "
			+ "where code = #{code}")
	public int deleteMovie(int code);
	*/
	
	//��ü �����͸� �������� �޼ҵ�
		//@Select("select code, name, regdate from movies")
		//public List<MovieVO> allMovie();
		
		//code�� ������ �ϳ��� �����͸� ã�ƿ��� �޼ҵ�
		//@Select("select code, name, regdate "
		//		+ "from movies where code=#{code}")
		//public MovieVO getMovie(int code);
		
//		//�����͸� �����ϴ� �޼ҵ�
//		@Insert("insert into movies(code, name, regdate) "
//				+ "values(#{code}, #{name}, #{regdate})")
//		public int insertMovie(MovieVO movieVO);
		
		//�����͸� �����ϴ� �޼ҵ�
		@Update("update movies "
				+ "set name=#{name}, regdate=#{regdate} "
				+ "where code = #{code}")
		public int updateMovie(MovieVO movieVO);
		
		//�����͸� �����ϴ� �޼ҵ�
		@Delete("delete from movies where code = #{code}")
		public int deleteMovie(int code);
}
