package p5;

public class Main {

	public static void main(String[] args) {
		// Wrapper Class: 기본 타입에 해당하는.. 포장 클래스
		
		int v1 = 10;
		Integer v2 = 10; //wrapper class, 박싱(기본타입을 참조타입으로 변환)
		v2 = null;
		v1 = v2; //언박싱(참조타입을 기본타입으로 변환)
		
		byte v3 = 10;
		Byte v4 = 10;
		
		char v5 = '아';
		Character v6 = 'd';
		
		Object v = 10;
	}

}
