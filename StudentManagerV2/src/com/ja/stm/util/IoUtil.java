package com.ja.stm.util;

import java.util.Scanner;

public class IoUtil {
	
	private static Scanner scanner = new Scanner(System.in);
	
	// 글로벌하게 쓰기 위해 static으로 선언
	public static void println(String text) {
		System.out.println(text);
	}
	
	public static String input(String text) {
		System.out.print(text);
		String input = scanner.nextLine();
		return input;
		//return scanner.nextLine(); <- 이렇게 해도 된다.
	}
	
	public static void pause() {
		System.out.println("계속하시려면 enter를 입력해주세요");
		scanner.nextLine();
	}
}
