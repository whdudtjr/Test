
public class P1 {
	
	public static void main(String[] args) {
		//string에 아무 값이 없을 때 null, int에 아무 값이 없을 때 0
		//인스턴스 생성 문법 - 클래스 정의 형태로 메모리 생성(힙)
		// . 은 접근 연산자
		// new 클래스명();
		//a1과 a2에는 StudentInfo 힙 메모리를 가르키는 주소값이 들어감
		StudentInfo a1 = new StudentInfo();
		StudentInfo a2 = new StudentInfo();
		
		a1.name = "한조";
		a1.age = 50;
		a1.score = 99;
		//System.out.println(a1.name);
		
		a2.name = "트레이서";
		a2.age = 50;
		a2.score = 99;

		a2 = a1;
		
		a1.name = "안녕하세요";
		System.out.println(a2.name);
		
		TestA testA = new TestA();

		testA.v1 = 10;
		System.out.println(testA.v1);
		
		testA.v2.v1 = 30;
		System.out.println(testA.v2.v1);
//		String str = "";
//		str.concat(str).concat(str);
//		String name1 = "hanjo";
//		int age1 = 20;
//		int score1 = 70;
//		
//		String name2 = "hanjo1";
//		int age2 = 20;
//		int score2 = 70;
	}

}


//클래스 정의 문법: class 클래스명{....}
//클래스명 명명법: 파스칼 케이스 - 첫 글자 대문자로 시작, 명사 
//클래스 정의만으로는 아무것도 안된다.
class StudentInfo{
	//속성 : 인스턴스 변수, 멤버 변수
	String name;
	int age;
	int score;
	//생성자 : 
	
	
	//기능 : 메소드
	
}


class TestA{
	int v1;
	TestB v2 = new TestB();
}

class TestB{
	int v1;
}















