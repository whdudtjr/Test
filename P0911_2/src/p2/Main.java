package p2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linkedlist 와 arraylist 는 사용하는 케이스에 따라 속도가 많이 차이난다.
		//중간값을 조회하려면 arraylist가 유용
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("안녕0");
		linkedList.add("안녕1");
		linkedList.add("안녕2");
		linkedList.add("안녕3");
		linkedList.add("안녕4");
		
		for(String e : linkedList) {
			System.out.println(e);
		}
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("안녕0");
		for(String e : arrayList) {
			System.out.println(e);
		}
		
		arrayList.add("안녕");
		linkedList.add("안녕");
		
		arrayList.get(10); //최대 강점
		linkedList.get(10); //최대 약점
		
		//아래 괜찮음 이렇게 하지도 않지만
		for(int x = 0; x < arrayList.size(); x++) {
			System.out.println(arrayList.get(x));
		}
		//아래 정신 나감 이렇게 하지도 않지만
		for(int x = 0; x < linkedList.size(); x++) {
			System.out.println(linkedList.get(x));
		}
		
		arrayList.remove(0); // 최대 약점
		linkedList.remove(0); // 강점

		arrayList.add(50000, "ddd"); // 최대 약점
		linkedList.add(50000, "ddd"); // 강점
	}

}
