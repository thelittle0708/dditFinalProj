package kr.or.ddit.common.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CommonService {

	/**
	 * 선택한 분류의 매니지 코드의 리스트를 가져오는 메서드
	 * 
	 * @param grCd Groub 공통코드 대분류
	 * @return manage manage 코드의 리스트
	 */
	public List<Map<String, String>> selectMngCdList(String grCd);

	/**
	 * 기업의 모든 부서 명칭과 코드의 리스트를 가져오는 메서드
	 * 
	 * @param coId 로그인된 회원의 회사를 식별할 수 있는 회사아이디
	 * @return 부서 명칭과 코드
	 */
	public List<Map<String, String>> selectDeptNoList(String coId);

	/**
	 * 기업의 모든 부서 명칭과 코드의 리스트를 가져오는 메서드
	 * 
	 * @param grCd grCd Groub 공통코드 대분류
	 * @param coId 로그인된 회원의 회사를 식별할 수 있는 회사아이디
	 * @return CUSTOME_CODE 테이블의 코드와 그 이름
	 */
	public List<Map<String, String>> selectCstCdList(@Param("grCd") String grCd, @Param("coId") String coId);

}
