package kr.or.ddit.schedule.mapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.schedule.vo.ScheduleVO;

public interface ScheduleMapperTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});

		ScheduleMapper scheduleMapper = (ScheduleMapper)context.getBean("scheduleMapper");

		ScheduleVO scheduleVO = new ScheduleVO();

		String startDateString = "2023-07-18 11:00";
		String endDateString = "2023-07-18 12:00";

		scheduleVO.setSchdlNo("10");
		scheduleVO.setStrtSchdlDt(startDateString);
		scheduleVO.setEndSchdlDt(endDateString);

		System.out.println(scheduleMapper);



		scheduleMapper.dragDropUpdate(null);


	}


}
