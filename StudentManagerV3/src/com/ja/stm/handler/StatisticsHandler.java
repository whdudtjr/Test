package com.ja.stm.handler;

import com.ja.stm.component.DataModel;
import com.ja.stm.dto.StudentDto;
import com.ja.stm.util.IoUtil;

public class StatisticsHandler implements CommandHandler{
	
	private DataModel dataModel;
	
	public StatisticsHandler(DataModel dataModel) {
		this.dataModel = dataModel;
	}
	public void doProcess() {
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
