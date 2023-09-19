package com.ys.stm.component;

import com.ys.stm.dto.StudentDto;

public class DataModel {
	
	
	private StudentDto[] studentList = new StudentDto[10];
	private int count = 0;
	
	public void add(StudentDto studentDto) {
		studentList[count] = studentDto;
		count++;
		if(studentList.length == count) {
			StudentDto[] newStudentList = new StudentDto[studentList.length * 2];
			for(int x = 0; x < count; x++) {
				newStudentList[x] = studentList[x];
			}
			studentList = newStudentList;
		}
	}
	public StudentDto[] getList() {
		StudentDto[] cloneList = new StudentDto[count];
		for(int x = 0; x < count; x++) {
			
			StudentDto newStudentDto = new StudentDto(
					studentList[x].getName(),
					studentList[x].getAge(),
					studentList[x].getScore()
					);			
		cloneList[x] = newStudentDto;
		}
		return cloneList;
	}
	public int remove(String name) {
		//만약에 이름이 같다면 삭제
		int removeCount = 0;
		for(int x = 0; x < count; x++) {
			if(studentList[x].getName().equals(name)) {
				for(int y = x; y < studentList.length -1; y++) {
					studentList[y] = studentList[y+1];
				}
				x--;
				count--;
				removeCount++;
			}
		}
		return removeCount;
	}
	public int getCount() {
		return count;
	}
}
