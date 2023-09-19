
public class P1 {

	public static void main(String[] args) {
		// 연산자 (연산자, 피연산자, 연산식)
		// 다 잘 써야됨
		// 연사 공부할 때 신경써야 될 것 : 타입
		
		// 1. 산술 연산자
		int a = 10;
		int b = 3;
		int r1 = a + b;
		int r2 = a - b;
		int r3 = a * b;
		int r4 = a / b; //정수 나누기
		int r5 = a % b;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);	
		System.out.println(r5);

		// 산술 연산 시 주의사항1
		byte b1 = 10;
		byte b2 = 3;
		
		int r6 = b1 + b2; //사실상 int 연산을 함
		
		// 산술 연산 시 주의사항2 - 많이 사용됨
		double c1 = 10.0;
		double c2 = 10.2;
		double r7 = c1 + c2; //실수 연산 - 정직한 경우
		int c3 = 5;
		double r8 = c2 + c3; //둘 중에 하나라도 실수값이면 다른 하나의 값을 double로 캐스팅됨.
		System.out.println(r8);
		// 활용 예
		int c4 = 10;
		System.out.println(c4/3.0);
		System.out.println((double)c4/3);
		System.out.println(c4/(double)3);


	}

}
