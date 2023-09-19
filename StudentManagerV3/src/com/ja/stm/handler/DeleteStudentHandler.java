package com.ja.stm.handler;

import com.ja.stm.component.DataModel;
import com.ja.stm.util.IoUtil;

public class DeleteStudentHandler implements CommandHandler {

	private DataModel dataModel;

	public DeleteStudentHandler(DataModel dataModel) {
		this.dataModel = dataModel;
	}
	public void doProcess() {
		IoUtil.println("학생 정보 삭제를 시작합니다.");
		String delete = IoUtil.input("삭제할 학생의 이름 > ");
		
		int count = dataModel.remove(delete);
		
		IoUtil.println(count + "명의 학생 정보가 삭제되었습니다.");
	}
}
