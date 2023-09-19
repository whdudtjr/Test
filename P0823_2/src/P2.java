
public class P2 {

	public static void main(String[] args) {
		// 세밀한 연산을 하려면 double 연산을 최대한 피해야 한다.
		// 해법: 최대한 정수 연산 후 마지막에 자릿수만큼 나눈다.
		
		//		int apple = 1;
		//		double piece = 0.1;
		//		
		//		int number = 7;
		//		double result = apple - number * piece;
		//		System.out.println(result);
		
		int apple = 10;
		int piece = 1;
		int number = 7;
		
		double result = (apple - number * piece) / 10.0;
		System.out.println(result);
	}

}
