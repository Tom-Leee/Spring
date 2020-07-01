import org.springframework.context.support.GenericXmlApplicationContext;

import controller.SearchController;
import dao.SearchDao;
import domain.Search;
import service.SearchService;
import service.SearchServiceImpl;

public class Main {

	public static void main(String[] args) {
		/*
		//Dao 인스턴스를 생성
		SearchDao searchDao = new SearchDao();
		//Service 인스턴스를 생성
		//이렇게 하면 생성자를 이용한 주입이라고 한다.
		
		SearchService serchService = new SearchServiceImpl(searchDao);
		
		
		//프로퍼티를 이용한 주입
		SearchServiceImpl searchService = new SearchServiceImpl();
		searchService.setSearchDao(searchDao);
		
		//Controller를 인스턴스를 생성
		SearchController searchController = new SearchController();
		searchController.setSearchService(searchService);
		searchController.detail();
		*/
		
		GenericXmlApplicationContext context 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		SearchController searchController = context.getBean(SearchController.class);
		searchController.detail();
		
		context.close();
	}

}
