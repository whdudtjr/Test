package p2;

public class Main {

	public static void main(String[] args) {
		// 
		
		Testable t1 = new Some1();
		
		// 익명 객체 생성(사실상 안씀)
		// 클래스를 정의하고 싶지 않을 때
		// 클래스 생성 없이 선언하고싶을 때
		Testable t2 = new Testable() {
			public void test1(int a, int b) {
				System.out.println("안녕");
			}
			public void test2() {
				System.out.println("반갑");
			}
		};
		
		t2.test2();


	}

}
interface Testable{
	public void test1(int a, int b);
	public void test2();
}

class Some1 implements Testable{
	public void test1(int a, int b) {
			
	}
	public void test2() {
		
	}
}