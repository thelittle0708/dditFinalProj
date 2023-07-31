package kr.or.ddit.user.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.user.vo.UserVO;

public interface UserMapperTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"test-context.xml"});

		UserMapper userMapper = (UserMapper)context.getBean("userMapper");
		System.out.println(userMapper);

		UserVO userVO = new UserVO();
		userVO.setUserId("NAVER_2023060001");

		UserVO userVO1 = userMapper.detailUserAuth(userVO);

			System.out.println(userVO1);

	}

}
