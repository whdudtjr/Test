package p10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a1 = new BBB();
		
		a1.testA();
	
		
		//하위에 참조되어있는지 확인하는것
		//instanceof는 해당 객체가 자기 클래스 (본인의 집)이 맞는지 확인해주는것
		//위에서의 AAA클래스의 참조변수인 a1을 BBB클래스로 타입캐스팅해준것
		if(a1 instanceof BBB) {
			BBB b1 = (BBB)a1;// 쓰이는 경우는 한 가지인데 실무에서 많이 쓴다
			b1.testB();
		}else {
			System.out.println("a1은 BBB가 아냐");
		}
	}

}
class AAA{
	int a1;
	int a2;
	
	void testA() {
		System.out.println("d");
	}
}
class BBB extends AAA{
	int b1;
	int b2;

	void testB() {
		System.out.println("안녕");
	}
}






