package kr.or.ddit.common.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public interface CommonMapperTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});

		CommonMapper commonMapper = (CommonMapper)context.getBean("commonMapper");
		System.out.println(commonMapper);

		List<Map<String, String>> mapList = commonMapper.selectCstCdList("JG","NAVER");

		for (Map<String, String> map : mapList) {
		    // map에서 각 요소를 가져옵니다.
			System.out.println(map);
		}

	}


}
