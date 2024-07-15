package com.springstudy.springbootJsp.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springstudy.springbootJsp.member.vo.MemberVO;

@Mapper
public interface MemberXmlSQLMapperInterface {
	//기능수행 합수 선언
	
	//0. test 기능
	// 메서드 이름과 mapper xml의 select 태그 id값이 동일행 연결됨
	public String getTime();
	
	//1. 목록조회기능
	public List<MemberVO> getMemberList();
	
	//2. 등록기능
	public int insertMember(MemberVO vo);
	
	//3. 수정기능
	public void updateMember(MemberVO vo);
	
	//4. 삭제기능
	public void deleteMember(@Param("id") String id);
	
	//5. 조회기능
	public MemberVO getMemberView(@Param("id") String id);
	
	//6. 아이디 중복체크
	public String idCheck(@Param("id") String id);
	
	//7. 검색기능
	
}
