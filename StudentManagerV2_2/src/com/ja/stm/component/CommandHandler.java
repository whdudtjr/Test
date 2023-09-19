package com.ja.stm.component;

import com.ja.stm.dto.StudentDto;
import com.ja.stm.util.IoUtil;

public class CommandHandler {

	private DataModel dataModel = new DataModel();

	
	public void addStudent() {
		IoUtil.println("학생 정보를 입력하세요");
		String name = IoUtil.input("이름: ");
		int age = Integer.parseInt(IoUtil.input("나이: "));
		int score = Integer.parseInt(IoUtil.input("점수: "));
		
		StudentDto studentDto = new StudentDto(name,age,score);
		dataModel.add(studentDto);
	}
	
	public void printStudentInfo() {
		IoUtil.println("학생 정보를 출력합니다");
		StudentDto[] list = dataModel.getList();
		
		for(StudentDto studentDto : list) {
			String text = "이름: " + studentDto.getName();
			text += "나이: " + studentDto.getAge();
			text += "점수: " + studentDto.getScore();
			
			IoUtil.println(text);
		}
		IoUtil.println("총 학생 수: " + dataModel.getCount());	
	}
	
	public void searchStudent() {
		IoUtil.println("학생 검색을 시작하겠습니다");
		String search = IoUtil.input("검색할 학생 이름을 입력하세요");
		int searchCount = 0;
		StudentDto[] list = dataModel.getList();
		for(StudentDto studentDto : list) {
			if(!studentDto.getName().equals(search)) continue;
			String text = "이름: " + studentDto.getName();
			text += "나이: " + studentDto.getAge();
			text += "점수: " + studentDto.getScore();
			
			IoUtil.println(text);
			searchCount++;
		}
		IoUtil.println("검색된 학생 수: " + searchCount);
	}
	
	public void removeStudent() {
		IoUtil.println("정보 삭제를 시작하겠습니다.");
		String name = IoUtil.input("삭제할 정보를 입력해주세요 > ");
		int removeCount = dataModel.remove(name);
		IoUtil.println("삭제된 학생 수: " + removeCount);
	}
	
	public void Statistics() {
		StudentDto[] list = dataModel.getList();
		int sum = 0;
		for(StudentDto studentDto: list) {
			sum += studentDto.getScore();
		}
		IoUtil.println("총 합계: " + sum);
		
		double average = sum/(double)list.length;
		IoUtil.println("평균: " + average);
	}
}
