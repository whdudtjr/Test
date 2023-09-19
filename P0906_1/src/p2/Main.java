package p2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속: 말그대로 부모가 자식에게 상속해주는것
		// 오버라이딩 : 만약에 부모클래스와 자식클래스에 같은 인스턴스 변수가 있다면 자식클래스의 값을 따라감 - 자식 이기는 부모 없다(?)
		// 만약 부모클래스에는 있는데 자식 클래스에는 없다면 부모클래스에 있는 인스턴스 변수를 추가해줌
		// 하나의 부모에 자식은 여러명 있을 수 있음 - 이래서 분기를 사용할 수 있는듯?
		Test a1 = new Test();
		a1.Test1();
		
		TestA b1 = new TestA();
		b1.
		TestB c1 = new TestB();
	}

}

class Test{
	int v1;
	int v2;
	
	void Test1() {
		System.out.println("test1 호출됨");
	}
}


//상속 문법 - extends 상속받을 클래스명
//TestA는 v1,v2,v3,v4,void Test1() 사용 가능
class TestA extends Test{
	int v3;
	int v4;
}
//TestB는 v1,v2,v3,v4,c1,c2,void Test1() 사용 가능
class TestB extends TestA{
	int c1;
	int c2;
}







