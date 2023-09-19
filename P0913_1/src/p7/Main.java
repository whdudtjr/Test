package p7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// 함수형 프로그래밍 : 스트림 API
		List<String> list = new ArrayList<>();
		list.add("안녕1");
		list.add("안녕2");
		list.add("안녕3");
		list.add("안녕4");
		list.add("안녕5");
		
		list.forEach(new QQQ());
		list.forEach((t) -> {
			System.out.println(t);
		});
		
		list.forEach(t-> System.out.println(t));
		
		list.forEach(System.out::println);
	}

}
class QQQ implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
}