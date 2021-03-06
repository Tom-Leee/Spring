package domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Spring Bean Factory 클래스를 만들어주는 어노테이션
//annotation: 자주 사용되는 복잡한 코드를 하나의 단어로 만들어 놓은 것인데
//자바에서는 하나의 클래스다.
//build가 될 때는 자바 코드로 변경이 된다.
@Configuration
public class SearchFactory {
	//Spring에서 Bean(인스턴스)을 생성해주는 메소드를 만들기 위한 어노테이션
	//클래스 내부에 만들어지는 메소드가 인스턴스 변수(프로퍼티)를 사용하지 않는다면
	//static 메소드를 만들어서 클래스를 가지고 바로 호출할 수 있도록 만드는 것이 효율적이다.
	@Bean
	public Search build() {
		Search srch = new Search();
		return srch;
	}
}
