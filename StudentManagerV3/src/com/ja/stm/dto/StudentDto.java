package com.ja.stm.dto;
//DTO, VO: 개념적 데이터 구조체로써의 클래스
// Data Transfer Object
// set이 없고 get만 있는 경우, readonly
// get이 없고 set만 있는 경우, writeonly
public class StudentDto {
	private String name;
	private int age;
	private int score;
	
	public StudentDto() {}
	
	public StudentDto(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
}
