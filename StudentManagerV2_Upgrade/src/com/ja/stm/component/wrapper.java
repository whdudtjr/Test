package com.ja.stm.component;


import com.ja.stm.util.IoUtil;

public class wrapper {
	//라이프사이클을 높이기 위해 멤버 변수로 올림
	//클래스는 인스턴스가 없으면 안된다 ex) static 제외
	//new 가 없으면 nullpointexception 발생
	private CommandHandler commandHandler = new CommandHandler();
	
	//실행
	public void run() {
		printWelcomMessage();
		commandHandler.load();
		while(true) {
			printCommandMenu();
			String input = IoUtil.input("입력 > ");
			
			if(input.equals("q")) break;
			
			switch(input) {
				case "1":
					commandHandler.addStudent();
					break;
				case "2":
					commandHandler.printStudentsList();
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
					IoUtil.println("잘못된 커맨드를 입력하셨습니다. 다시 시도해주세요");		
			}
			IoUtil.pause();
		}
		commandHandler.save();
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
