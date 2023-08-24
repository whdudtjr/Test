
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a1 = 1;
		double a3 = 0.1;
		int a2 = a1; // 타입캐스팅 - 묵시적
		int a4 = a2; // 매우 정상 
		
		byte a5 = (byte)a4; // 타입 캐스팅 - 명시적
		//사실상 - 명시적 타입 캐스팅을 해야되는 경우는 값의 증발이 정상적이라고 판단되는 경우

		double b1 = a4; // 타입 캐스팅 
		double b2 = (double)a4; // 위에 코드와 동일 , 명시적 타입 캐스팅
		
		int b4 = '안'; 
		
		double c1 = 10.1;
		int c2 = (int)c1; // 10
		System.out.println(c2);
		
		char d1 = 'A';
		System.out.println((int)d1);
		
		int d2 = 97;
		System.out.println((char)d2);
		
		
	}

}
