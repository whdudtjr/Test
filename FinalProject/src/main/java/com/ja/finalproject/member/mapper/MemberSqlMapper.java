package com.ja.finalproject.member.mapper;

import java.util.List;

import com.ja.finalproject.dto.HobbyCategoryDto;
import com.ja.finalproject.dto.MailAuthDto;
import com.ja.finalproject.dto.MemberDto;
import com.ja.finalproject.dto.MemberHobbyDto;

public interface MemberSqlMapper {
	// insert, delete, update 사실상 리턴타입 void
	// select는 리턴타입 고려해야함
	
	public int createPk();
	
	public void insert(MemberDto memberDto);
	public MemberDto selectByUserIdAndPw(MemberDto memberDto); 
	
	public MemberDto selectById(int id);
	
	public int countByUserId(String userId);
	
	
	// 취미 관련
	public List<HobbyCategoryDto> selectHobbyList();
	public void insertMemberHobby(MemberHobbyDto memberHobbyDto); 
	
	// 메일 인증
	public void insertMailAuth(MailAuthDto mailAuthDto);
	public void updateCompleteYByKey(String key);
	
}












