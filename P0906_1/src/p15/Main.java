package p15;

public class Main {

	public static void main(String[] args) {
		// 상속 + 다형성 + 오버라이딩 = 인터페이스
		// 추상화의 끝
		// 인터페이스 AAA를 클래스 TTT에서 구현한 후 구현한 메서드를 호출한다.
		AAA t = new TTT();
		t.test1();
	}

}
//싹 다 abstract
//메소드만 정의, 단 구현은 안 함
interface AAA{
	//아래 4가지 모두 다 동일한 경우
	public abstract void test();// 정확한 표현
	abstract void test1();
	public void test2(); // 일반적 표현법
	void test3();	
}

// implements 구현한다.

class TTT implements AAA{
	public void test() {
		
	}
	public void test1() {

	}
	public void test2() {
	
	}
	public void test3() {
	
	}
}

