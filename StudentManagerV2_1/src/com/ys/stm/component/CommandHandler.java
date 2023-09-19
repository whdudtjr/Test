package com.ys.stm.component;

import com.ys.stm.dto.StudentDto;
import com.ys.stm.util.IoUtil;

public class CommandHandler {
	
	private DataModel dataModel = new DataModel();
	
	public void addStudent() {
		IoUtil.println("학생 정보 등록을 시작하겠습니다");
		String name = IoUtil.input("학생 이름 입력: ");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력: "));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력: "));
		
		StudentDto studentDto = new StudentDto(name,age,score);
		dataModel.add(studentDto);
		
	}
	public void printStudentList() {
		IoUtil.println("학생 정보 리스트를 출력하겠습니다.");
		StudentDto[] list = dataModel.getList();
		
		for(StudentDto studentDto: list) {
			String text = "이름: " + studentDto.getName();
			text += "나이: " + studentDto.getAge();
			text += "점수: " + studentDto.getScore();
			
			IoUtil.println(text);
		}
		
		IoUtil.println("총 " + dataModel.getCount() + "명이 있습니다." );
	}
	public void searchStudent() {
		IoUtil.println("학생 정보를 검색합니다.");
		String search = IoUtil.input("검색할 학생을 입력 > ");
		
		StudentDto[] list = dataModel.getList();
		
		int searchCount = 0;
		
		for(StudentDto studentDto : list) {
			if(!studentDto.getName().contains(search)) {
				continue;
			}
			String text = "이름: " + studentDto.getName();
			text += "나이: " + studentDto.getAge();
			text += "점수: " + studentDto.getScore();
			
			IoUtil.println(text);
			searchCount++;
		}
		IoUtil.println("총 검색 수: " + searchCount);
	}
	public void deleteStudent() {
		IoUtil.println("학생 정보 삭제하겠습니다.");
		String delete = IoUtil.input("삭제할 학생 정보를 입력하세요 > ");
		
		int deleteCount = dataModel.remove(delete);
		IoUtil.println("총 삭제 수: " + deleteCount);
	}
	public void printStatistics() {
		IoUtil.println("학생 점수 통계");
		
		StudentDto[] list = dataModel.getList();
		
		
		int sum = 0;
		for(StudentDto studentDto : list) {
			sum += studentDto.getScore();
		}
		
		double average = sum/(double)dataModel.getCount();
		IoUtil.println("총 합: " + sum);
		IoUtil.println("평균: " + average);
	}
}




