package dao;

import org.springframework.stereotype.Repository;

import domain.Search;

//bean의 자동생성을 요청하는 어노테이션
@Repository
public class SearchDao {
	//메소드
	//상세보기를 위한 메소드
	//기본키를 매개변수로 받아서 하나의 DTO를 생성해서 리턴
	public Search detail(int num) {
		Search srch = new Search();
		srch.setMoviecode("1");
		srch.setMovietitle("반지의제왕");
		return srch;
	}
}
