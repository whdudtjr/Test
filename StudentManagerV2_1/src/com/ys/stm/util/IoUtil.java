package com.ys.stm.util;

import java.util.Scanner;

public class IoUtil {
	//static은 인스턴수 생성을 하지 않아도 다른 클래스에서 사용 가능함 , ex) ~.input
	private static Scanner scanner = new Scanner(System.in);
	
	// 입력 , 출력, 중지
	// 입력
	public static String input(String text) {
		System.out.println(text);
		String input = scanner.nextLine();
		return input;
	}
	public static void println(String text) {
		System.out.println(text);
	}
	
	public static void pause() {
		System.out.println("계속 하시려면 enter를 쳐 주세요");
		scanner.nextLine();
	}
	
}
