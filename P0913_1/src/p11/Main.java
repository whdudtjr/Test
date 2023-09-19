package p11;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();

		list.add(new Student("한조1", 30, 90));
		list.add(new Student("한조2", 29, 50));
		list.add(new Student("한조3", 19, 60));
		list.add(new Student("한조4", 36, 80));
		list.add(new Student("한조5", 33, 20));
		list.add(new Student("한조6", 32, 40));
		list.add(new Student("한조7", 31, 50));
		list.add(new Student("한조8", 20, 60));
		
		//acc는 무조건 0이 아님
		list.stream()
				.filter(e -> e.getAge()<30)
				.forEach(e -> System.out.println(e.getName()))
				;
	}

}
class Student{
	private String name;
	private int age;
	private int score;
	
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}