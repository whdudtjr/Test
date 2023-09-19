package com.ja.stm.component;

import com.ja.stm.handler.CommandHandler;
import com.ja.stm.handler.container.CommandHandlerContainer;
import com.ja.stm.util.IoUtil;

public class wrapper {
	//라이프사이클을 높이기 위해 멤버 변수로 올림
	//클래스는 인스턴스가 없으면 안된다 ex) static 제외
	//new 가 없으면 nullpointexception 발생
	private CommandHandlerContainer commandHandlerContainer = new CommandHandlerContainer();
	
	//실행
	public void run() {
		printWelcomMessage();
		while(true) {
			printCommandMenu();
			String input = IoUtil.input("입력 > ");
			
			if(input.equals("q")) break;
			
			CommandHandler commandHandler = commandHandlerContainer.get(input);
			commandHandler.doProcess();
			
			IoUtil.pause();
		}
		
		printByeMessage();
	}
	
	private void printCommandMenu() {
		IoUtil.println("1. 정보 입력");
		IoUtil.println("2. 리스트 출력");
		IoUtil.println("3. 정보 검색");
		IoUtil.println("4. 정보 삭제");
		IoUtil.println("5. 점수 통계");
		IoUtil.println("q. 프로그램 종료");
	}
	private void printWelcomMessage() {
		IoUtil.println("************************");
		IoUtil.println("* 학생 정보 관리 프로그램 v1 *");
		IoUtil.println("************************");
	}
	
	private void printByeMessage() {
		IoUtil.println("프로그램이 종료합니다. 이용해 주셔서 감사합니다.");
	}
	
	
}
