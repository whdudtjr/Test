
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeComponent sc1 = SomeComponent.getInstance();
		sc1.test();
		SomeComponent sc2 = SomeComponent.getInstance();
		sc2.test();

	}

	
}

class SomeComponent{
	// 싱글톤 디자인 패턴
	private static final SomeComponent instance = new SomeComponent();
	
	private SomeComponent(){}
	
	public static SomeComponent getInstance() {
		return instance;
	}
	// 아래는 일반적인 코드
	private int v1;
	
	public void test() {
		System.out.println(v1);
	}
}








