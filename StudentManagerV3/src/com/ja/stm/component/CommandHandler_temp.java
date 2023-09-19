package com.ja.stm.component;

import com.ja.stm.dto.*;

import com.ja.stm.util.IoUtil;

public class CommandHandler_temp {
	
	private DataModel dataModel = new DataModel();
	
	public void addStudent() {
		IoUtil.println("학생 정보 등록을 시작합니다.");
		String name = IoUtil.input("학생 정보 입력 > ");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력 > "));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력 > "));
		
		StudentDto studentDto = new StudentDto(name,age,score);
		dataModel.add(studentDto);
		
		
		IoUtil.println("학생 정보 등록이 완료되었습니다");
	}
	
	public void printStudentsList() {
		IoUtil.println("학생 정보 리스트를 출력합니다.");
		
		StudentDto[] list = dataModel.getList();
		
		
		for(StudentDto studentDto : list) {
			String text = "이름: " + studentDto.getName();
			text += ", 나이: " + studentDto.getAge();
			text += ", 점수: " + studentDto.getScore();
			
			IoUtil.println(text);
		}
		IoUtil.println("총 학생 수: " + list.length);
	}
	
	public void searchStudent() {
		IoUtil.println("학생 검색을 시작합니다.");
		String search = IoUtil.input("검색할 학생 이름 입력 > ");
		
		StudentDto[] list = dataModel.getList();
		
		int searchCount = 0;
		for(StudentDto studentDto : list) {
			if(!studentDto.getName().contains(search)) continue;
			String text = "이름: " + studentDto.getName();
			text += ", 나이: " + studentDto.getAge();
			text += ", 점수: " + studentDto.getScore();
			
			IoUtil.println(text);
			searchCount++;
		}
		IoUtil.println("검색된 학생 수: " + searchCount);
	}
	
	public void deleteStudent() {
		IoUtil.println("학생 정보 삭제를 시작합니다.");
		String delete = IoUtil.input("삭제할 학생의 이름 > ");
		
		int count = dataModel.remove(delete);
		
		IoUtil.println(count + "명의 학생 정보가 삭제되었습니다.");
	}
	
	public void printStatistics() {
		IoUtil.println("학생 정보 통계");
		StudentDto[] list = dataModel.getList();
		
		int sum = 0;
		for(StudentDto studentDto: list) {
			sum += studentDto.getScore();
		}
		double average = sum/(double)list.length;
		
		IoUtil.println("총 인원: " + list.length);
		IoUtil.println("평균 점수: " + average);
	}
}
