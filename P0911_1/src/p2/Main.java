package p2;

public class Main {
	
	public static void main(String[]args) {
		// Object equals
		Student s1 = new Student();
		s1.name = "한조";
		s1.age = 20;
		s1.score = 90;

		Student s2 = new Student();
		s2.name = "한조";
		s2.age = 20;
		s2.score = 90;

		if(s1 == s2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		
	}

}
class Student{
	String name;
	int age;
	int score;
	
	public boolean equals(Object t) {
		if(!(t instanceof Student)) {
			return false;
		}
		
		Student target = (Student)t;
		
		return this.name.equals(target.name) &&
				this.age == target.age &&
				this.score == target.score
				;
	}
	
	
	
	
}