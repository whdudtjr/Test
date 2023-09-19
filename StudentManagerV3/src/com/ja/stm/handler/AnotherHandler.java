package com.ja.stm.handler;

import com.ja.stm.util.IoUtil;

public class AnotherHandler implements CommandHandler{

	public void doProcess() {
		IoUtil.println("잘못 입력하였습니다");
		IoUtil.println("다시 입력해주세요");
	}
	

}
