package p5;

import java.util.HashMap;



public class Main {

	public static void main(String[] args) {
		// HashMap
		// 다진다는 의미, 암호화, 검색
		// 키는 무조건 String, 값은 넣고싶은 것
		// 값의 중복은 허용하나 키의 중복은 허용하지않는다.
		// 순서가 없다.
		// 중복된 키가 있을 때는 원래 있던 값에 덮어씌운다.
		// 키로 값을 뽑아낸다.
		// y=f(x), 단방향
		// 복호화 불가, y로 x를 예측 불가
		// 아무리 큰 데이터를 입력해도 x값이 특정 범위의 값이 나온다. 
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("1111", 999);
		map.put("1111", 99);
		map.put("1113", 9);
		map.put("1114", 0);
		
		int v = map.get("1111");
		System.out.println(v);
	}

}
