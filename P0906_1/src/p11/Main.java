package p11;

public class Main {
	public static void main(String[] args) {
		//Object는 모든 클래스에서의 최상위
		Object ref = new AAA();
		ref = 1;
		ref = "안녕";
		ref = new int[9];
	}
}
//어떤 클래스든 Object를 상속 받는다
class AAA {
	int a1;
}