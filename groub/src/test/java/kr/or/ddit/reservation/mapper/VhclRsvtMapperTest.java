package kr.or.ddit.reservation.mapper;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.reservation.vo.VhclRsvtVO;


public interface VhclRsvtMapperTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});

		VhclRsvtMapper vhclRsvtMapper = (VhclRsvtMapper)context.getBean("vhclRsvtMapper");
		System.out.println(vhclRsvtMapper);

		VhclRsvtVO vhclRsvtVO = new VhclRsvtVO();

		vhclRsvtVO.setStrtRsvtDt("202307070900");
		vhclRsvtVO.setEndRsvtDt("202307071200");
		vhclRsvtVO.setVRsvtNo(13);

		System.out.println(vhclRsvtVO);

		int cnt = vhclRsvtMapper.update(vhclRsvtVO);

		System.out.println(cnt);


	}
}
