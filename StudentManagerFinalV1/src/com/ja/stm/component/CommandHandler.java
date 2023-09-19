package com.ja.stm.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ja.stm.dto.StudentDto;

public class CommandHandler {
	//필드
	private Scanner scn = new Scanner(System.in);
	private List<StudentDto> list = new ArrayList<>();
	//메서드
	public void addStudent() {
		System.out.print("이름 입력: ");
		String name = scn.nextLine();
		System.out.print("나이 입력: ");
		int age = Integer.parseInt(scn.nextLine());
		System.out.print("점수 입력: ");
		int score = Integer.parseInt(scn.nextLine());
	
		//요즘 이렇게 하는게 추세. 실제로 내부 동작을 이렇게 함
//		StudentDto student = new StudentDto();
//		student.setName(name);
//		student.setAge(age);
//		student.setScore(score);
	
		StudentDto student = new StudentDto(name,age,score);
		list.add(student);
		
		System.out.println("학생 등록이 완료되었습니다.");
	}
	
	public void showList() {
		for(StudentDto student: list) {
			String result = "";
			result += "이름: " + student.getName();
			result += " 나이: " + student.getAge();
			result += " 점수: " + student.getScore();
			System.out.println(result);
//			System.out.print("이름: " + student.getName());
//			System.out.print(" 나이: " + student.getAge());
//			System.out.println(" 점수: " + student.getScore());
		}
		System.out.println("학생 리스트 출력이 완료되었습니다.");
	}
	
	public void searchStudent() {
		System.out.print("검색할 학생의 이름을 입력하세요: ");
		String searchName = scn.nextLine();
		int searchCount = 0;
		for(StudentDto student: list) {
			if(!student.getName().equals(searchName)) continue;
			System.out.print("이름: " + student.getName());
			System.out.print(" 나이: " + student.getAge());
			System.out.println(" 점수: " + student.getScore());
			searchCount++;
		}
		System.out.println("검색된 학생 수는 "+searchCount+"명입니다.");
		System.out.println("학생 검색이 완료되었습니다.");
	}
	
	public void deleteStudent() {
		System.out.print("삭제할 학생의 이름을 입력하세요: ");
		String deleteName = scn.nextLine();
		int deleteCount = 0;
		
		list.removeIf(e -> e.getName().equals(deleteName));
		
		System.out.println("삭제된 학생의 수는 " + deleteCount + "명입니다.");
	}
	
	public void showStatistics() {
		
	}
}
