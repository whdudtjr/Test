package com.ja.stm.component;
import com.ja.stm.dto.*;

public class DataModel {
	
	private StudentDto[] studentList = new StudentDto[10];
	private int count;
	
	public void add(StudentDto studentDto) {
		studentList[count] = studentDto;
		count++;
		if(count == studentList.length) {
			StudentDto[] newList = new StudentDto[studentList.length * 2];
			for(int i = 0; i < count; i++) {
				newList[i] = studentList[i];
			}
			studentList = newList;
		}
	}
	
	
	public StudentDto[] getList() {
				
		//얕은 복사 - 실제 데이터와 가까움 하나의 메모리를 걸침 ex) setter가 없으면 쓰지 못하기 때문에 상관 없음
		StudentDto[] cloneList = new StudentDto[count];
		for(int x = 0; x < count; x++) {
			//cloneList[x] = studentList[x];// 이 코드가 얕은 복사의 핵심임
			
		//깊은 복사
		StudentDto newStudentDto = new StudentDto(
				studentList[x].getName(),
				studentList[x].getAge(),
				studentList[x].getScore()
				);
		// 깊은 복사의 핵심
		cloneList[x] = newStudentDto;			
		
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
				count--;
				x--;
				removeCount++;
			}
		}
		return removeCount;
	}
	public int getCount() {
		return count;
	}
	
}
