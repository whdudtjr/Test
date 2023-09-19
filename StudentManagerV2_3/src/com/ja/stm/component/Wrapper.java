package com.ja.stm.component;

import com.ja.stm.util.IoUtil;

public class Wrapper {
	
	private CommandHandler commandHandler = new CommandHandler();
	
	public void run() {
		printWelcomeMessage();
		
		while(true) {
			printCommandMenu();
			String command = IoUtil.input("메뉴를 선택해주세요 > ");
			
			if(command.equals("q")) {
				break;
			}
			switch(command) {
			case "1":
				commandHandler.addStudent();
				break;
			case "2":
				commandHandler.printStudentList();
				break;
			case "3":
				commandHandler.searchStudent();
				break;
			case "4":
				commandHandler.removeStudent();
				break;
			case "5":
				commandHandler.statistics();
				break;
			default:
				IoUtil.println("잘못 입력하셨습니다");
				IoUtil.println("다시 입력해주세요");
			}
			IoUtil.pause();
			
		}
		IoUtil.println("프로그램이 종료되었습니다");
	}
	
	private void printWelcomeMessage() {
		IoUtil.println("**********************");
		IoUtil.println("*****학생 관리 프로그램*****");
		IoUtil.println("**********************");
	}
	
	private void printCommandMenu() {
		IoUtil.println("1. 정보 입력");
		IoUtil.println("2. 리스트 출력");
		IoUtil.println("3. 정보 검색");
		IoUtil.println("4. 정보 삭제");
		IoUtil.println("5. 점수 통계");
		IoUtil.println("q. 프로그램 종료");
	}
	
	private void printByeMessage() {
		IoUtil.println("프로그램이 종료합니다. 이용해 주셔서 감사합니다.");
	}
}
