package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.SearchService;
import service.SearchServiceImpl;

@Controller
public class SearchController {
	//Service 인스턴스를 저장할 변수 생성
	@Autowired
	private SearchService searchService;
	
	//상세보기를 위한 메소드
	public void detail() {
		searchService.detail();
	}
	
}
