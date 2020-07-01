package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SearchDao;

//bean의 자동생성을 요청하는 어노테이션
@Service
public class SearchServiceImpl implements SearchService {
	//DAO 변수를 선언
	//setter를 만들어주는 기능과 동일한 자료형의 bean을 주입받아주는 어노테이션
		@Autowired
	private SearchDao searchDao;
		
	@Override
	public void detail() {
		System.out.println(searchDao.detail(1));
	}
	
}
