
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		
		t2.a = 30;
		//t2.c = 40
		t2.process2();
	}

}

class Test2{
	//제약 조건 - 컴파일
	//private 는 다른 클래스에서 접근을 못 함
	public int a;
	private int b;
	private int c;
	
	private void process1() {
		System.out.println("안녕");
	}
	public void process2() {
		System.out.println("안녕1");

	}
}