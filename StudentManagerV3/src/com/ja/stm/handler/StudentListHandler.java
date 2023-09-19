package com.ja.stm.handler;

import com.ja.stm.component.DataModel;
import com.ja.stm.dto.StudentDto;
import com.ja.stm.util.IoUtil;

public class StudentListHandler implements CommandHandler {

	private DataModel dataModel;

	public StudentListHandler(DataModel dataModel) {
		this.dataModel = dataModel;
	}
	
	public void doProcess() {
		// TODO Auto-generated method stub
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

}
