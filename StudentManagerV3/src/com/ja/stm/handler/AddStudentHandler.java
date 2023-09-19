package com.ja.stm.handler;

import com.ja.stm.component.DataModel;
import com.ja.stm.dto.StudentDto;
import com.ja.stm.util.IoUtil;

public class AddStudentHandler implements CommandHandler{
	private DataModel dataModel;

	public AddStudentHandler(DataModel dataModel) {
		this.dataModel = dataModel;
	}
	@Override//컴파일 실수 방지용 어노테이션
	public void doProcess() {
		IoUtil.println("학생 정보 등록을 시작합니다.");
		String name = IoUtil.input("학생 정보 입력 > ");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력 > "));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력 > "));
		
		StudentDto studentDto = new StudentDto(name,age,score);
		dataModel.add(studentDto);
		
		
		IoUtil.println("학생 정보 등록이 완료되었습니다");
		
	}

}
