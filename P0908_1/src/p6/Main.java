package p6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// 중요한 API: 날짜 숫자 문자의 변환
		// 숫자 -> 문자
		int a1 = 10;
		String a2 = a1 + "";
		String a3 = String.valueOf(a1);
		
		//문자 -> 숫자
		String b1 = "20";
		int b2 = Integer.parseInt(b1);
		
		//숫자 -> 날짜
		long c1 = 11232312;
		Date c2 = new Date(c1);
		
		//날짜 -> 숫자
		Date d1 = new Date();
		long d2 = d1.getTime();

		//추가 내용
		int d3 = d1.getDay();//요일,,, 0..일요일
		
		//날짜 -> 문자
		Date e1 = new Date();
		System.out.println(e1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String e2 = sdf.format(e1);
		System.out.println(e2);
		
		//문자 -> 날짜
		String f1 = "2020-07-08";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date f2 = sdf2.parse(f1);
			System.out.println(f2);
		}catch(Exception e) {
			
		}
		
	}
}













