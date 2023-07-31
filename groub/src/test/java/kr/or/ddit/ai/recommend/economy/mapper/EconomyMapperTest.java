package kr.or.ddit.ai.recommend.economy.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.ai.recommend.economy.vo.EconomyVO;

public interface EconomyMapperTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});

		EconomyMapper economyMapper = (EconomyMapper)context.getBean("economyMapper");
		System.out.println(economyMapper);

		List<EconomyVO> list = economyMapper.symbolPrices("2023-06-01","KS11");
		System.out.println(list.size());
		for(EconomyVO userVO: list) {

			System.out.println(userVO);
		}

	}

}
