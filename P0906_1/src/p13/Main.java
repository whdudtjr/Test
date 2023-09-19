package p13;

public class Main {

	public static void main(String[] args) {
		// 상속 + 다형성 + 오버라이딩 팁: 문법과 런타임을 다르게 생각해야됨 
		// 오버라이딩 - 재정의, 부모의 메서드를 그대로 다시 구현(리턴타입, 메소드명, 파라미터)
		// 오버라이딩 되있으면 오버라이딩 된 값을 호출함
		AAA a = new BBB();
		a.print();
		
		BBB b = new BBB();
		b.print();
		b.test();
	
		//신경써야 될 부분
		AAA ref = new BBB();
		ref.print();
		
	}

}
class AAA{
	int a1;
	int a2;
	
	void qqq() {
		
	}
	
	void print() {
		System.out.println("AAA print 호출됨");
	}
}
class BBB extends AAA{
	void test() {
		System.out.println("BBB test 호출됨");
	}
	
	//오버라이딩 문법 - 다시 정의하겠다.
	void print() {
		System.out.println("BBB print 호출됨");
	}
}












