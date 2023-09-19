package p7;

public class Main {

	public static void main(String[] args) {
		// 다형성 - 참조변수는 자신의 타입을 포함해서 모든 자손을 받을 수 있다.
		AAA a = new AAA();
		BBB b = new BBB();
		
		double c = 1;//타입 미스매치이지만 자동 타입캐스팅이 되는 경우임.
		
		//다형성의 경우
		AAA aaa;
		aaa = new AAA(); // 당연히 됨
		aaa = new BBB(); // 다형성
		
		BBB bbb;
		bbb = new BBB(); // 당연히 됨
		//bbb = new AAA(); // 안됨
	
		//주의사항
		// 문법과 런타임이 달라서 신경써줘야 함
		// 문법으로는 불가능한데 런타임에서는 쓸 수 있는 메모리가 생성돼있음
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		BBB b1 = new BBB();
	
	}

}
class AAA{
	
	int a1;
	int a2;
	
	void printA() {
		System.out.println("프린트A 출력됨");
	}
}
class BBB extends AAA{
	int b1;
	int b2;
	
	void printB() {
		System.out.println("프린트B 출력됨");
	}
	
}

















