package p1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 람다식(문법), 스트림 처리(API)
		// 절차 지향 -> 객체 지향 -> 함수형 프로그래밍
		// 완벽하게 for문, 컬렉션, 인터페이스에 대한 베이스가 거의 완벽해야 쓸 수 있다.
		// 람다식(문법), 스트림(API) <-> for문, interface하고 고전문법으로 바꿀 수 있어야 한다.
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(9);
		
		//1. 고전적 for문 사용법 (비추)
		for(int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
		
		
		//2. 향상된 for문(foreach문) (추천)
		for(int e: list) {
			System.out.println(e);
		}
		
		//3-1. 함수형 프로그래밍(람다식)
		list.forEach(e ->{
			System.out.println(e);
		});
		
		//3-2. 함수형 프로그래밍(메서드 상속 활용)
		list.forEach(System.out::println);
	}

}
