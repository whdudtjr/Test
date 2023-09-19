package p1;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Object 클래스: 모든 클래스의 최상위 부모
		AAA a = new AAA();
		System.out.println(a);

		
		//오버라이딩 돼서 값이 나옴
		Date d = new Date();
		System.out.println(d); // 테스트
		
		String str = a.toString();
		System.out.println(str);
		
		BBB b = new BBB();
		System.out.println(b);
		
	}

}
class AAA{
	int v1;
	int v2;
	
	//메소드 오버라이딩
	public String toString() {
		return "v1 =" + v1 + ", v2 =" + v2;
	}
}
class BBB{
	int v3;
	int v4;
}