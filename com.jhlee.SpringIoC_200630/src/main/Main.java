package main;

import domain.Search;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import domain.SearchFactory;

public class Main {

	public static void main(String[] args) {
		/*
		//어노테이션을 이용해서 Bean을 생성
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SearchFactory.class);
		*/
		//XML을 이용해서 Bean을 생성
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Search srch = context.getBean("build", Search.class);
		srch.setMoviecode("a1asdd");
		srch.setMovietitle("달려라 하니");
		srch.setMovieruntime("152");
		System.out.println(srch);
	
		Search srch2 = context.getBean("build", Search.class);
		srch.setMoviecode("asgmals");
		srch.setMovietitle("카피추");
		srch.setMovieruntime("205");
		System.out.println(srch2);
		
		//해시코드 출력 - 해시코드가 동일하게 출력
		//해시코드가 동일하면 동일한 메모리 영역을 사용하고 있는 것이다.
		System.out.println(System.identityHashCode(srch));
		System.out.println(System.identityHashCode(srch2));
		
		//상수는 상수 풀에 저장하고 풀에 저장한 상수의 참조를 변수에 저장한다.
		int a = 10;
		int b = 10;
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		context.close();
	}

}
