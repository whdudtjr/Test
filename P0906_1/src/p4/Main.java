package p4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final이 붙어있는 클래스는 상속받을 수 없다.
		BBB b1 = new BBB(10);
	}

}

class AAA{
	int v1;
	int v2;
	
	AAA(){
		System.out.println("생성자1 호출됨");
	}
	AAA(int v1){
		this.v1 = v1;
		System.out.println("A 생성자2 호출됨");
	}
}

class BBB extends AAA{
	int v2;
	int v3;
	
	BBB(){
		System.out.println("B 생성자1 호출됨");
	}
	BBB(int v3){
		super(10);
		this.v3 = v3;
		System.out.println("B 생성자2 호출됨");
	}
}
