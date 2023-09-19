package p7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Set: 사실...거의...잘 안씀...
		
		Set<String> set = new TreeSet<>();
		//Set<String> set = new HashSet<>();
		
		set.add("안녕1");
		set.add("안녕1");// 추가 실패 및 return false, 중복값은 들어가지 않음
		set.add("안녕2");
		set.add("안녕3");
		
		boolean a =set.contains("안녕3");// 핵심 API, if문에 쓰임
		
		for(String e : set) {
			System.out.println(e);
		}
		///////////////////////////////////
		
		set.size();
	}

}
