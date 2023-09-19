package com.ja.stm.component;

import com.ja.stm.dto.StudentDto;
import com.ja.stm.util.IoUtil;

public class CommandHandler {

	private DataModel dataModel = new DataModel();
	
	public void addStudent() {
		IoUtil.println("학생 정보를 등록하겠습니다.");
		String name = IoUtil.input("이름: ");
		int age = Integer.parseInt(IoUtil.input("나이: "));
		int score = Integer.parseInt(IoUtil.input("점수: "));
		
		StudentDto studentDto = new StudentDto(name,age,score);
		dataModel.add(studentDto);
		IoUtil.println("학생 정보 등록을 마쳤습니다.");
	}
	
	public void printStudentList() {
		IoUtil.println("학생 리스트를 출력하겠습니다.");
		StudentDto[] cloneList = dataModel.getList();
		
		for(StudentDto studentDto : cloneList) {
			String text = "학생: " + studentDto.getName();
			text += "나이: " + studentDto.getAge();
		    text += "점수: " + studentDto.getScore();
		    IoUtil.println(text);
		}
		
		IoUtil.println("학생 리스트 출력을 완료했습니다.");
		IoUtil.println("총 학생 수: " + dataModel.getCount());
	}
	
	public void searchStudent() {
		IoUtil.println("학생 검색을 시작하겠습니다.");
		String search = IoUtil.input("검색할 학생을 입력해주세요: ");
		int searchCount = 0;
		StudentDto[] cloneList = dataModel.getList();
		for(StudentDto studentDto : cloneList) {
			if(!studentDto.getName().equals(search)) continue;
			String text = "학생: " + studentDto.getName();
			text += "나이: " + studentDto.getAge();
		    text += "점수: " + studentDto.getScore();
		    IoUtil.println(text);
		    searchCount++;
		}
		IoUtil.println("학생 검색을 완료했습니다.");
		IoUtil.println("총 검색된 수: " + searchCount);
	}
	
	public void removeStudent() {
		IoUtil.println("학생 삭제를 시작하겠습니다.");
		String name = IoUtil.input("삭제할 학생을 입력해주세요: ");
		int removeCount = dataModel.removeCount(name);
		IoUtil.println("학생 삭제가 끝났습니다.");
		IoUtil.println("총 삭제된 수: " + removeCount);
	
	}
	
	public void statistics() {
		StudentDto[] list = dataModel.getList();
		int sum = 0;
		for(StudentDto studentDto : list) {
			sum += studentDto.getScore();
		}
		double average = sum/(double)list.length;
		IoUtil.println("총 합: " + sum);
		IoUtil.println("평균: " + average);
	}
}
