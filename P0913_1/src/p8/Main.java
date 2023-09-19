package p8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 스트림 API = 함수형 프로그래밍 = 가독성 향상
		List<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(5);
		list.stream().forEach(e -> System.out.println(e));
		
		for(int e : list) {
			if(e % 2==0) continue;
			System.out.println(e);
		}
		System.out.println("============================");
		//filter는 true인 경우에만 출력됨
		list.stream()
			.filter(e-> e%2==0)
			.filter(e -> e!=3)
			.forEach(e -> System.out.println(e));
		;
		
	}

}
