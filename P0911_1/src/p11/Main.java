package p11;

import java.util.ArrayList;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class Main {

	public static void main(String[] args) {
		// 제너릭 실 사용 예제
		//Student[] arr = new Student[10];
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		
		Student e = list.get(0);
		
		HashMap<String,Student> map = new HashMap<>();
		
		
	}

}

class Student{
	String name;
	int age;
	int score;
}


