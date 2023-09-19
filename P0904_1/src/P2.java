
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new School().takeExam(null);
		
	}

}

class School{
	//private Student s1; -> 생성자 주입을 받아야 함
	//private Student s1 = new Student(); -> 결합도가 상당히 높은 관계,school생성 -> student생성, school소멸 -> student소멸
	
	public School(Student s1) {
	//	this.s1 = s1;
	}
	
	public void takeExam(Student s1) {
		System.out.println("학교가 시험을 치룹니다.");
		//Student s1 = new Student();
	}
	
}

class Student{
	private String name;
	private int age;
	private int score;
	
	public void study() {
		System.out.println("공부를 합니다");
	}
}