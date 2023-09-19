
public class P1 {

	public static void main(String[] args) {
		
		TestClass t1 = new TestClass(10, "222");
		TestClass t2 = new TestClass(20, "222");
		int a = 10;
		t1.doProcess(a);
		t2.doProcess(a);
	}

}

class TestClass{
	//인스턴스 변수
	private int v1;
	private String v2;
	
	
	//생성자
	public TestClass() {
		
	}
	
	public TestClass(int v1, String v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	//기능 - 메서드
	//동사로 지어줄 것
	public int doProcess(int a) {
		System.out.println("안녕: " + v1);
		return a+1;
	}

}