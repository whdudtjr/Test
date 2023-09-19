
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("테스트 시작");
		Student s1 = new Student("한조", 1, 2);
		Student s2 = new Student("dd", 1);
		Student s3 = new Student("ff", 1, 2);
		Student s4 = new Student("gg", 1, 2);
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
		System.out.println(s4.name);
//		s1.name = "한조";
//		s1.age = 20;
//		s1.score = 80;
		System.out.println("테스트 끝");
		
	}

}

class Student{
	//속성 정의 인스턴스 변수
	String name;
	int age;
	int score;
	int test;
	
	
	//생성자
	//생성자 선언 문법: 클래스명(매개변수N....){...}
	//인스턴스가 생성되면 실행
	//일반적인 활용법: 값의 초기화 용도
	//this 문법: 생성자가 생성될 때마다 다른 주소값을 가르킴
	//this 사용할 시점: 지역 변수와 인스턴스 변수가 똑같을 때
	Student(String name, int age , int score){
		
		this.name = name;
		this.age = age;
		this.score = score;
		test = 10;			
	}
	
	//생성자 오버로딩
	//오버로딩은 개수가 문제가 아니라 타입이 문제다.
	Student(String name, int age){
		this(name,age,0);
//		this.name = name;
//		this.age = age;
	}
	
	Student(){
		
	}
	
	
	
}