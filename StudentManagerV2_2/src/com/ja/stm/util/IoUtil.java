package com.ja.stm.util;

import java.util.Scanner;

public class IoUtil {

	private static Scanner scanner = new Scanner(System.in);
	
	//출력
	public static void println(String text) {
		System.out.println(text);
	}
	
	//입력
	public static String input(String text) {
		System.out.print(text);
		String input = scanner.nextLine();
		return input;
	}
	
	//중지
	public static void pause() {
		System.out.println("계속할려면 Enter를 눌러주세요");
		scanner.nextLine();
	}

}
