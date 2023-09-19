package com.ja.stm.component;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import java.util.Scanner;

public class Wrapper {
	
	private CommandHandler commandHandler = new CommandHandler();
	private Scanner scn = new Scanner(System.in);
	
	public void run() {
		System.out.println("**********************");
		System.out.println("* 학생관리프로그램 v.final *");
		System.out.println("**********************");
		
		while(true) {
			System.out.println("******** 메뉴 ********");
			System.out.println("1. 입력");
			System.out.println("2. 리스트 출력");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 통계");
			System.out.println("q. 종료");
			System.out.print("커맨드 입력 > ");
			
			String command = scn.nextLine();
			
			if(command.equals("q")) {
				break;
			}
			
			if(command.equals("1")) {
				commandHandler.addStudent();
				
			}else if(command.equals("2")) {
				commandHandler.showList();
				
			}else if(command.equals("3")) {
				commandHandler.searchStudent();
				
			}else if(command.equals("4")) {
				commandHandler.deleteStudent();
				
			}else if(command.equals("5")) {
				commandHandler.showStatistics();
				
			}else {
				System.out.println("잘못 입력하셨습니다");
			}
			System.out.println("계속하시려면 enter를 입력해주세요");
			scn.nextLine();
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
	}
}
