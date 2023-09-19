package p6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// List API
		// 앞으로 변수 선언할 때는 추상화를 높여서 선언할 것이다.
		// List 사용 시: 제너릭(<>) 선언이 분명해야 한다.
		//List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>();
		//Stack<String> list = new Stack<>();
		List<String> list = new Vector<>();
		list.add("안녕");
		list.add("안녕");
		list.add("안녕");
		list.add("안녕");
		
		//웬만하면 반복문 돌릴 때 foreach문 사용
		for(String e : list) {
			System.out.println(e);
		}
		
		////////////////////////////////////////
		
		list.contains("111");//요소 존재 여부
		list.get(0); //값 추출 ArrayList 일 때만 사용
		list.indexOf(1);
		list.size(); // 요소의 개수
		
		
		
	}

}
