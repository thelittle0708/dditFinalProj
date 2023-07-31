package kr.or.ddit.reservation.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.reservation.vo.OffmVO;


public interface OffmRsvtMapperTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});

		OffmRsvtMapper offmRsvtMapper = (OffmRsvtMapper)context.getBean("offmRsvtMapper");
		System.out.println(offmRsvtMapper);

		String coId = "NAVER";
		List<OffmVO> list = offmRsvtMapper.getOffmList(coId);

		for(OffmVO vo : list) {
		System.out.println(vo);
		}

	}
}
