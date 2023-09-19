package p8;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Map
		// 값을 통합시키는것 ex) StudentDto
		// ArrayList .add() 와 HashMap .put() 을 잘 써야한다.
		Map<String, Object> map = new HashMap<>();
		
		map.put("name", "한조");
		map.put("age", 30);
		map.put("score", 99);
		
		//Map계열은 Iterator가 없어서 반복 못 돌림
		String name = (String)map.get("name"); // Map에서 Object이지만 String으로 typecasting을 한다.
		

	}

}
