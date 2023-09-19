import java.util.*;
public class A7 {

	public static void main(String[] args) {
		// A - 순환

//문제 설명
//xyz는 왼쪽에서 오른쪽으로 숫자가 x, y, z인 3자리 정수라고 하자.
//숫자가 0이 아닌 3자리 정수를 abc라고 할 때, abc+bca+cab를 구하라.
//
//제약
//abc는 각 숫자가 0인 아닌 3자리 정수이다.
		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		System.out.println("입력받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int x = Integer.parseInt(inputs[0]);
		int n_1 = 0;
		int n_2 = 0;
		int n_3 = 0;
		
		n_1 = x%10; //4
		x = x/10; //23
		
		String xRest_1 = String.valueOf(n_1);
		String xQuotient_1 = String.valueOf(x);
		
		int x_1 = Integer.valueOf(xRest_1 + xQuotient_1);
		
		n_2 = x_1 % 10;
		x_1 = x_1 / 10;
		
		String xRest_2 = String.valueOf(n_2);
		String xQuotient_2 = String.valueOf(x_1);
		
		int x_2 = Integer.valueOf(xRest_2 + xQuotient_2);
		
		n_3 = x_2 % 10;
		x_2 = x_2 / 10;
		
		String xRest_3 = String.valueOf(n_3);
		String xQuotient_3 = String.valueOf(x_2);
		
		int result1 = Integer.valueOf(xRest_1 + xQuotient_1);
		int result2 = Integer.valueOf(xRest_2 + xQuotient_2);
		int result3 = Integer.valueOf(xRest_3 + xQuotient_3);
		
		System.out.println(result1 + result2 + result3);
		
	}
	
}
