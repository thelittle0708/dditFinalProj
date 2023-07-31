package kr.or.ddit.admin.log.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.user.mapper.UserMapper;
import kr.or.ddit.user.vo.UserLogVO;
import kr.or.ddit.user.vo.UserVO;

public interface LogMapperTest {

	//Test클래스에서 main함수 실행
	public static void main(String[] args) {
		//context설정 (src/test/resources경로의 context를 호출)
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});
		//mapper호출
		LogMapper logMapper = (LogMapper)context.getBean("logMapper");
		//test하려는 mapper.method의 파라미터 설정
		String coId = "Google";
		//실행 및 작동확인
		List<UserLogVO> list = logMapper.logList(coId);
		for(UserLogVO userLogVO : list) {
			System.out.println(userLogVO.getLogYmd());
		}
	}


}
