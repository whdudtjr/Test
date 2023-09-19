
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a1.v2 = 10; //잘못된 문법
		//a2.v2 = 20; //잘못된 문법
		AAA.v2 = 10; // 클래스 생성 시 메서드 영역에 생성
		AAA.v2 = 20;
		System.out.println(AAA.v2);
		System.out.println(AAA.v2);
		AAA.test2();
		AAA a = new AAA();
		a.v1 = 20;
		AAA.v2 = 30;
		
		new Q1().test1();
		System.out.println(AAA.v2);
	}

}

//문법 static - 메소드 영역에 메모리 생성된다. 처음부터 1개 생성되고 프로그램 종료 시까지 소멸 안됨. 문법적으로 글로벌하다.
// - 인스턴스 생성과는 무관함 AAA a1 = new AAA(); 일 때, v1,v3만 힙 메모리에 생성되고 v2는 메소드 영역에 따로 생성된다.
// - 인스턴스 생성 없이 쓸 수 있음
// - this를 못 쓴다 this는 인스턴수 변수의 주소이기 때문
// - 인스턴스 변수와 클래스 변수는 거의 안 섞어쓴다.
// - static을 쓴다는 건 함수와 똑같다. 내부의 값은 안 쓰고, 외부의 값만 가져다 쓰기 때문이다.
class AAA{
	int v1;
	static int v2;// 클래스 변수
	int v3;
	
	void test1() {
		System.out.println("안녕1");
	}
	//메소드 오버로딩
	void test1(int a) {
		System.out.println("안녕2");
	}
	static void test2() {
		System.out.println("안녕2");
	}
}

class Q1{
	void test1() {
		test2();
	}
	void test2() {
		test3();
	}
	void test3() {
		System.out.println("안녕하세요: " + AAA.v2);
		AAA.v2 = 50;
	}
}	


//class Q1{
//	void test1(AAA a) {
//		test2(a);
//	}
//	void test2(AAA a) {
//		test3(a);
//	}
//	void test3(AAA a) {
//		System.out.println("안녕하세요: " + a.v1);
//		AAA.v2 = 50;
//	}
//}	








