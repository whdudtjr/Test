package p4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name= "해1";
		s1.age= 30;
		s1.score=90;
		
		Student s2 = new Student();
		s2.name= "해2";
		s2.age= 30;
		s2.score=90;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}

class Student{
	String name;
	int age;
	int score;

	public int hashCode() {
		int result = name.hashCode() + age + score;
		return result;
	}

}
