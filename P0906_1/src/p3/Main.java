package p3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스 변수가 중첩될 때만 super메서드 사용
		AAA a1 = new AAA();
		BBB b1 = new BBB();
		System.out.println(b1.v2);
		
		b1.test2();
		
		
	}

}
class AAA{
	int v1;
	int v2;
	
	AAA(){
		System.out.println("AAA 생성자 호출됨");
	}
	
	AAA(int v1){
		System.out.println("AAA int값 받는 생성자 호출됨");
		this.v1 = v1;
	}
	
	void test1() {
		this.v2 = 10;
		System.out.println(v2);
	}
}
class BBB extends AAA{
	int v2;
	int v3;
	
	BBB(){
		super();
		System.out.println("BBB 생성자 호출됨");
	}
	void test2() {
		super.v2 = 30;
		this.v2 = 20;
		System.out.println(v2);
	}
}