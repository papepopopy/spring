package com.springstudy.springbootJsp.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springstudy.springbootJsp.member.mapper.MemberXmlSQLMapperInterface;
import com.springstudy.springbootJsp.member.vo.MemberVO;

@Repository
public class MemberDAOMybatis {
	// 객체 = sqlSession" 클레스 = "sqlSession"
	
	@Autowired
	private SqlSession session;
	
	@Autowired
	private MemberXmlSQLMapperInterface memberXmlSqlDao;
	
	// mybatis xml과 java mapper interface 연결 테스트
	public String getTime() {
		return memberXmlSqlDao.getTime();
	}
	public String getTime2() {
		return session.selectOne("getTime");
	}
	
	//회원 목록 조회
	public List<MemberVO> getMemberList() {
		return memberXmlSqlDao.getMemberList();
	}
	
	//회원 조회
	public MemberVO getMemberView(String id) {
		//return memberXmlSqlDao.getMemberView(id);
		return session.selectOne("getMemberView", id);
	}
	
	//회원 등록
	public void insertMember(MemberVO vo) {
		memberXmlSqlDao.insertMember(vo);
		
		//int isOK = 0;
		//isOK = memberXmlSqlDao.insertMember(vo);
		
		return;
	}
	
	//회원 삭제
	public void deleteMember(String id) {
		memberXmlSqlDao.deleteMember(id);
		/* session.delete("deleteMember", id); */
		return;
	}
	
	//회원 수정
	public void updateMember(MemberVO vo) {
		memberXmlSqlDao.updateMember(vo);
		
		session.update("updateMember", vo);
		return;
	}
	
	//중복 아이디 체크
	public String idCheck(String id) {
		return memberXmlSqlDao.idCheck(id);
	}
}
