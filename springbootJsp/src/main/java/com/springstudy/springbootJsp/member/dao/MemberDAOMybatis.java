package com.springstudy.springbootJsp.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springstudy.springbootJsp.member.mapper.MemberXmlSQLMapperInterface;
import com.springstudy.springbootJsp.member.vo.MemberVO;

@Repository
public class MemberDAOMybatis {
	
	@Autowired
	private SqlSession session;
	
	@Autowired
	private MemberXmlSQLMapperInterface memberXmlSqlDao;
	
	// mybatis xml와 java mapper interface 연결 테스트
	public String getTime() {
		return  memberXmlSqlDao.getTime(); 
	}
	public String getTime2() {
		return  session.selectOne("getTime");
	}
	
	// 회원 목록 조회
	public List<MemberVO> getMemberList(){
		return memberXmlSqlDao.getMemberList();
		
		// Mybatis의 SqlSession객체를 이용
		//return session.selectList("getMemberList");
	}
	// 회원 정보 조회
	public MemberVO getMemberView(String id) {
		
		//return memberXmlSqlDao.getMemberView(id);
		return session.selectOne("getMemberView", id);
	}
	// 회원 등록
	public int insertMember(MemberVO vo) {
		int isOK = 0;
		isOK = memberXmlSqlDao.insertMember(vo);
		
//		isOK = session.update("insertMember", vo);
//		session.commit();
		
		return isOK;
	}
	
}