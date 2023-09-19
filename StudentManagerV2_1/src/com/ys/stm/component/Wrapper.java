package com.ys.stm.component;

import com.ys.stm.util.IoUtil;

public class Wrapper {
	private CommandHandler commandHandler = new CommandHandler();
	//인스턴수 변수
	
	
	//생성자
		
		
	//메서드
	public void run() {
		printWelcomeMessage();
		while(true) {
			printCommandMenu();
			String command = IoUtil.input("메뉴를 입력해주요 > ");
			
			if(command.equals("q")) {
				printByeMessage();
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
					commandHandler.deleteStudent();
					break;
					
				case "5":
					commandHandler.printStatistics();
					break;
					
				default:
					IoUtil.println("잘못 입력하셨습니다.");
					IoUtil.println("다시 입력해주세요");
					
			}
			IoUtil.pause();
		}
	}
	
	private void printCommandMenu(){
		IoUtil.println("1. 정보 입력");
		IoUtil.println("2. 리스트 출력");
		IoUtil.println("3. 정보 검색");
		IoUtil.println("4. 정보 삭제");
		IoUtil.println("5. 점수 통계");
		IoUtil.println("q. 프로그램 종료");
	}
	private void printWelcomeMessage(){
		IoUtil.println("************************");
		IoUtil.println("* 학생 정보 관리 프로그램 v2 *");
		IoUtil.println("************************");
	}
	private void printByeMessage(){
		IoUtil.println("프로그램이 종료합니다. 이용해 주셔서 감사합니다.");
	}
}
