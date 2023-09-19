package com.ja.stm.component;

import com.ja.stm.dto.StudentDto;

public class DataModel {

	private StudentDto[] studentList = new StudentDto[10];
	private int count = 0;
	
	public void add(StudentDto studentDto) {
		studentList[count] = studentDto;
		count++;
		if(studentList.length == count) {
			StudentDto[] newList = new StudentDto[studentList.length * 2];
			for(int x = 0; x < count; x++) {
				newList[x] = studentList[x];
			}
			studentList = newList;
		}
	}

	public StudentDto[] getList() {
		StudentDto[] cloneList = new StudentDto[count];
		for(int x = 0; x < count; x++) {
			//cloneList[x] = studentList[x]; //얇은 복사
			StudentDto newList = new StudentDto(
			     studentList[x].getName(),
			     studentList[x].getAge(),
			     studentList[x].getScore()
			);
			//배열 요소로 받음
			cloneList[x] = newList;//깊은 복사
		}
		return cloneList;
	}
	
	public int remove(String name) {
		int removeCount = 0;
		for(int x = 0; x < count; x++) {
			StudentDto studentDto = studentList[x];
			if(studentDto.getName().equals(name)) {
				for(int y = x; y < studentList.length-1; y++) {
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
