package p10;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// StringTokenizer - 문자열 분리
		String str = "안녕하세요,반갑습니다,잘부탁드립니다.";
		
		String[] arr = str.split(",");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		
		//has~뭐시기는 while문에 쓰임
		while(st.hasMoreTokens()) {
			String value = st.nextToken();//인덱스가 하나씩 추출됨
			System.out.println(value);
		}

	}

}
